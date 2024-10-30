package com.vedruna.apiRestN_M.persistance.models;

import java.io.Serializable;
import java.util.List;

import javax.security.auth.Subject;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="players")
public class Player implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idplayer")
    private int idPlayer;

    @Column(name="username")
    private String nombreUsuario;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="players_has_trophies", joinColumns={@JoinColumn(name="players_idplayer")}, inverseJoinColumns={@JoinColumn(name="trophies_idtrophie")})
    private List<Trophie> playersTrophies;



    
}
