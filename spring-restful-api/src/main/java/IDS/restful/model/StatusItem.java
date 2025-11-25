package IDS.restful.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "status_data")
public class StatusItem {

    @Id
    private Long id;

    private String name;
}