package com.vedruna.apiRestN_M.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vedruna.apiRestN_M.persistance.models.Player;
@Repository
public interface PlayerRepositoryI extends JpaRepository<Player, Integer> {

    public Player findByNombreUsuario(String nombreUsuario);


    
}
