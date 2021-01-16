package danielh1307.springboottesting.stars;

import org.springframework.stereotype.Service;

import static danielh1307.springboottesting.stars.Star.star;

@Service
public class StarService {

    private final StarJpaRepository starJpaRepository;

    StarService(StarJpaRepository starJpaRepository) {
        this.starJpaRepository = starJpaRepository;
    }

    public Star createStar(String name, long distanceInKm) {
        return this.starJpaRepository.save(star(name, distanceInKm));
    }
}
