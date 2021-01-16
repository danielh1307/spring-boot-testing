package danielh1307.springboottesting.stars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

import static java.util.Objects.requireNonNull;
import static java.util.UUID.randomUUID;

@Entity
class Star {

    @Id
    private final UUID id;
    @Column
    private final String name;
    @Column
    private final long distanceInKm;

    @SuppressWarnings("unused")
    private Star() {
        // needed for Hibernate
        id = null;
        name = null;
        distanceInKm = 0L;
    }

    private Star(String name, long distanceInkm) {
        requireNonNull(name);

        this.id = randomUUID();
        this.name = name;
        this.distanceInKm = distanceInkm;
    }

    static Star star(String name, long distanceInKm) {
      return new Star(name, distanceInKm);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getDistanceInKm() {
        return distanceInKm;
    }
}
