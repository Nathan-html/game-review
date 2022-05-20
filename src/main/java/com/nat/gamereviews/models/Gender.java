package com.nat.gamereviews.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Gender {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "gender")
    private List<Game> games;
}
