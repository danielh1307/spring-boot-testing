package danielh1307.springboottesting.stars;

import danielh1307.springboottesting.stars.web.AddNewStarRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StarController {

    private final StarService starService;

    StarController(StarService starService) {
        this.starService = starService;
    }

    @PostMapping(value = "/stars")
    public Star addStar(@RequestBody final AddNewStarRequest addNewStarRequest) {
        return starService.createStar(addNewStarRequest.getName(), addNewStarRequest.getDistanceInKm());
    }

}
