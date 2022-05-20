package com.nat.gamereviews.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Game {

    @Id
    private Long id;

    private String name;

    private String description;

    private Date releaseDate;

    @ManyToOne
    private Gender gender;

    @ManyToOne
    private Editor editor;

    @ManyToOne
    private Classification classification;

    @ManyToOne
    private EconomicModel economicModel;

    @OneToMany(mappedBy = "game")
    private List<Review> reviews;

    @ManyToMany
    private List<Platform> platforms;
}
