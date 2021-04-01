package ca.sheridan.assignment3.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contacts")
public class Contact implements Serializable {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name")
    private String contactFullName = "";

    @Column(name = "job_type")
    private String jobType = "";

    @Column(name = "phone_number")
    private String phoneNumber = "";

    @Column(name = "address")
    private String contactAddress = "";

    @Column(name = "email")
    private String contactEmail = "";

    public Contact(){
    };

    public Integer getId(){return id;}

    public void setId(Integer id){this.id = id;}

    public String getContactFullName(){return contactFullName;}

    public void setContactFullName(String contactFullName){this.contactFullName = contactFullName;}

    public String getJobType(){return jobType;}

    public void setJobType(String jobType){this.jobType = jobType;}

    public String getPhoneNumber(){return phoneNumber;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getContactAddress(){return contactAddress;}

    public void setContactAddress(String contactAddress){this.contactAddress = contactAddress;}

    public String getContactEmail(){return contactEmail;}

    public void setContactEmail(String contactEmail){this.contactEmail = contactEmail;}
}
