package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nb_devices")
    private int nbDevices;
    @Column(name = "typeAccount")
    private String typeAccount;

    @OneToOne(mappedBy = "account")
    private NetflixUserEntity user;

}
