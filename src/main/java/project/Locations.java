package project;

import jakarta.persistence.*;

@Entity
public class Locations {

    @Id
    @Column(name = "ID")
    private int locationsID;

    private Long times;

    private Double latitude;

    private Double longitute;


    @ManyToOne
    @JoinColumn(name = "location")
    private LocationEntity locationEntity;

    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }
}


