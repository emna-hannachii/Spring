package tn.esprit.spring.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCours")
    private Integer idCours; // Clé primaire
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau;

// Constructeur et accesseurs (getters) et mutateurs (setters)

    @OneToMany(mappedBy = "cours",cascade = CascadeType.ALL)
    private Set<Inscription> inscriptions;




}