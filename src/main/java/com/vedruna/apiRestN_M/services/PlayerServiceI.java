package com.vedruna.apiRestN_M.services;

import java.util.List;

import com.vedruna.apiRestN_M.dto.PlayerDTO;
import com.vedruna.apiRestN_M.persistance.models.Player;

public interface PlayerServiceI {
    List<PlayerDTO> showAllPlayers();
    PlayerDTO showPlayerByUsername(String username);
    void savePlayer(Player player);
    void deletePlayer(Integer id);
    void assignTrophieToPlayer(Integer playerId, Integer trophieId);
    
    
}