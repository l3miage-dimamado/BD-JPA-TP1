package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "product_entity")
public class ProductEntity {

    @Id
    @Column(name = "bar_code_number", length = 15)
    private String barCode;

    @Column(name = "name")
    private String name;
    @Column(name = "consumable")
    private Boolean consumable;

    @ManyToOne
    private BrandMiageEntity brandMiage;
}