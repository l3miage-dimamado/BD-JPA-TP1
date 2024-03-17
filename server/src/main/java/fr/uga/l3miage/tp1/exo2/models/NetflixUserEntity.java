package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "sex", length = 2)
    private Sex sex;
    @Column(name = "birthDate")
    private Date birthDate;
    @OneToOne
    private NetflixAccountEntity account;


}
