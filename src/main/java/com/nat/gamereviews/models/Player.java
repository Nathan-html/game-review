package com.nat.gamereviews.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Player {

    @Id
    private Long id;

    private String pseudo;

    private String password;

    private Date registerAt;

    private Boolean isAdmin;

    @OneToMany(mappedBy = "player")
    private List<Review> reviews;
}
