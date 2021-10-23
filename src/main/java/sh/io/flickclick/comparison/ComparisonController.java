package sh.io.flickclick.comparison;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/compare")
public class ComparisonController {

    @GetMapping
    public Comparison getComparison() {
        return new Comparison(1L, "samir@gmail.com", new String[] { "123", "456" });
    }
}
