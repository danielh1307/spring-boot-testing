package danielh1307.springboottesting.stars;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StarJpaRepository extends JpaRepository<Star, String> {
}
