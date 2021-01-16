package danielh1307.springboottesting.stars.web;

public class AddNewStarRequest {

    private final String name;
    private final long distanceInKm;

    public AddNewStarRequest(String name, long distanceInKm) {
        this.name = name;
        this.distanceInKm = distanceInKm;
    }

    public String getName() {
        return name;
    }

    public long getDistanceInKm() {
        return distanceInKm;
    }
}
