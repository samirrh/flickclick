package sh.io.flickclick.comparison;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/compare")
// API layer makes requests , uses service layer to get data etc

public class ComparisonController {
    private final ComparisonService comparisonService;

    @Autowired
    public ComparisonController(ComparisonService comparisonService) {
        this.comparisonService = comparisonService;
    }

    @GetMapping(path = "all")
    public List<Comparison> getComparisons(@RequestParam("email") String email) {
        return comparisonService.getComparisons(email);
    }

    @GetMapping(path = "{id}")
    public Comparison getComparison(@PathVariable("id") Long id) {
        return comparisonService.getComparisonById(id);
    }

    @PostMapping()
    public Long postComparison(@RequestBody Comparison comparison) {
        return comparisonService.postComparison(comparison);
    }

    @PutMapping(path = "recipient/{id}")
    public ArrayList<String> addRecipientData(@PathVariable Long id, @RequestParam String recipientEmail,
            @RequestParam String[] recipientMovies) {
        return comparisonService.addRecipientData(id, recipientEmail, recipientMovies);
    }
}
