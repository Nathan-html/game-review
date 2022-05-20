package com.nat.gamereviews.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Review {

    @Id
    private Long id;

    private Date sendDate;

    private Float note;

    private String description;

    @ManyToOne
    private Game game;

    @ManyToOne
    private Player player;
}
