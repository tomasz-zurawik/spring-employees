package hibernate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@ToString
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Column(name = "lastname")
    @Getter @Setter
    private String lastName;

    @Column(name = "firstname")
    @Getter @Setter
    private String firstName;

    @Column(name = "address")
    @Getter @Setter
    private String address;

    @Column(name = "city")
    @Getter @Setter
    private String city;

    @Column(name = "salary")
    @Getter @Setter
    private int salary;

    @Column(name = "age")
    @Getter @Setter
    private int age;

    @Column(name = "startjobdate")
    @Getter @Setter
    private Date startJobDate;

    @Column(name = "benefit")
    @Getter @Setter
    private int benefit;


    public Employees(){

    }

    public Employees(String lastName, String firstName, String address, String city, int salary, int age, Date startJobDate, int benefit) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
        this.salary = salary;
        this.age = age;
        this.startJobDate = startJobDate;
        this.benefit = benefit;
    }
}
