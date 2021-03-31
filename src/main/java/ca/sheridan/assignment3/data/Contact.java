package ca.sheridan.assignment3.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName = "";

    @Column(name = "last_name")
    private String lastName = "";

    @Column(name = "job_type")
    private String jobType = "";
}
