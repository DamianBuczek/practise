package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import project.Locations;

import java.util.List;
import java.util.Objects;

@Entity

public class LocationEntity {

   @Id
   private int locationsId;
   private long timestamp;
   private double latitude;
   private double longitude;

    private int listID;

    private String name;

    private String craft;

    @OneToMany(mappedBy = "locationEntity")
    private List<Locations> locations;





}
