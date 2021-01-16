package danielh1307.springboottesting.stars;

import org.springframework.stereotype.Service;

import static danielh1307.springboottesting.stars.Star.star;

@Service
public class StarService {

    public Star createStar(String name, long distanceInKm) {
        return star(name, distanceInKm);
    }
}
