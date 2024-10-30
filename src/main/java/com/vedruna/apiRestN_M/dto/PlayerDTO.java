package com.vedruna.apiRestN_M.dto;


import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import com.vedruna.apiRestN_M.persistance.models.Player;
import com.vedruna.apiRestN_M.persistance.models.Trophie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO{
    private int idPlayer;
    private String nombreUsuario;
    private List<TrophieDTO> playersTrophies;


    public PlayerDTO(Player p) {
        this.idPlayer = p.getIdPlayer();
        this.nombreUsuario = p.getNombreUsuario();
        this.playersTrophies=trophiesDTO(p.getPlayersTrophies());


    }
      public List<TrophieDTO> trophiesDTO(List<Trophie> trophies) {
        List<TrophieDTO> trophiesRegistered = new ArrayList<TrophieDTO>();
        for (Trophie t : trophies) {
            trophiesRegistered.add(new TrophieDTO(t));
        }
        return trophiesRegistered;
    }
}  


