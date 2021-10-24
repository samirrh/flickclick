package sh.io.flickclick.comparison;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComparisonRepository extends JpaRepository<Comparison, Long> {

    List<Comparison> findComparisonBysenderEmail(String email);
}
