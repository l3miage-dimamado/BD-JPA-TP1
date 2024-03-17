package fr.uga.l3miage.tp1.exo2.models;

import lombok.Getter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
@Accessors
@Getter
public class UserEntity {
    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;

    @OneToOne
    private SessionEntity session;
}
