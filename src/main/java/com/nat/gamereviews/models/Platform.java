package com.nat.gamereviews.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Platform {

    @Id
    private Long id;

    private String name;
}
