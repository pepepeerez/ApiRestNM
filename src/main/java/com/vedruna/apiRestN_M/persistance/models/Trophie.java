package com.vedruna.apiRestN_M.persistance.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="trophies")
public class Trophie implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtrophie")
    private int idTrophie;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy="playersTrophies")
    private List<Player> players;


}
