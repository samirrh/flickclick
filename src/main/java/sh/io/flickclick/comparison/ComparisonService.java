package sh.io.flickclick.comparison;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
