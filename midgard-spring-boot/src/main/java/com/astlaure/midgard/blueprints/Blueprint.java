package com.astlaure.midgard.blueprints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blueprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
