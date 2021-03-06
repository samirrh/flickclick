package sh.io.flickclick.comparison;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Service layer has business logic

@Service
public class ComparisonService {
    private final ComparisonRepository comparisonRepository;

    @Autowired
    public ComparisonService(ComparisonRepository comparisonRepository) {
        this.comparisonRepository = comparisonRepository;
    }

    public List<Comparison> getComparisons(String email) {
        return comparisonRepository.findComparisonBysenderEmail(email);
    }

    public Comparison getComparisonById(Long id) {
        return comparisonRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Comparison with id: " + id + " not found"));
    }

    public Long postComparison(Comparison comparison) {
        comparisonRepository.save(comparison);
        return comparison.getId();
    }

    @Transactional
    public ArrayList<String> addRecipientData(Long id, String recipientEmail, String[] recipientMovies) {
        Comparison comparison = comparisonRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("User with id:" + id + "not found"));
        comparison.setRecipientEmail(recipientEmail);
        comparison.setRecipientMovies(recipientMovies);
        String[] senderMovies = comparison.getSenderMovies();
        ArrayList<String> inCommon = new ArrayList<String>();
        for (String senderMovie : senderMovies) {
            for (String recipientMovie : recipientMovies) {
                if (senderMovie.equals(recipientMovie)) {
                    inCommon.add(senderMovie);
                }
            }
        }

        return inCommon;
    }
}
