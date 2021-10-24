package sh.io.flickclick.comparison;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComparisonConfig {
    @Bean
    CommandLineRunner commandLineRunner(ComparisonRepository repository) {
        return args -> {
            Comparison test = new Comparison("SamirHaque@gmail.com", new String[] { "1", "2" });
            repository.save(test);
            Comparison test2 = new Comparison("SamirHaque@gmail.com", new String[] { "3", "4" });
            repository.save(test2);
        };

    }
}