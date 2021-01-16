package danielh1307.springboottesting.stars;

import static java.util.Objects.requireNonNull;

class Star {

    private final String name;
    private final long distanceInKm;

    private Star(String name, long distanceInkm) {
        requireNonNull(name);

        this.name = name;
        this.distanceInKm = distanceInkm;
    }

    static Star star(String name, long distanceInKm) {
      return new Star(name, distanceInKm);
    }

    public String getName() {
        return name;
    }

    public long getDistanceInKm() {
        return distanceInKm;
    }
}
