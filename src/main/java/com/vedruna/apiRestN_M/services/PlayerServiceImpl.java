package com.vedruna.apiRestN_M.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.apiRestN_M.dto.PlayerDTO;
import com.vedruna.apiRestN_M.persistance.models.Player;
import com.vedruna.apiRestN_M.persistance.models.Trophie;
import com.vedruna.apiRestN_M.persistance.repository.PlayerRepositoryI;
import com.vedruna.apiRestN_M.persistance.repository.TrophieRepositoryI;

@Service
public class PlayerServiceImpl implements PlayerServiceI {

    @Autowired
    PlayerRepositoryI playerRepo;

    @Autowired
    TrophieRepositoryI trophieRepo;

    @Override
    public List<PlayerDTO> showAllPlayers() {
        List<Player> players = playerRepo.findAll();
        List<PlayerDTO> playersDTO = new ArrayList<>();
    
        for (Player p : players) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setIdPlayer(p.getIdPlayer());
            playerDTO.setNombreUsuario(p.getNombreUsuario());
            playersDTO.add(playerDTO);
        }
    
        return playersDTO;
    }
    

    @Override
    public PlayerDTO showPlayerByUsername(String NombreUsuario) {
        return new PlayerDTO(playerRepo.findByNombreUsuario(NombreUsuario));
    }

    @Override
    public void savePlayer(Player player) {
        playerRepo.save(player);

    }
    


    @Override
    public void deletePlayer(Integer id) {
        playerRepo.deleteById(id);    
    }
 @Override
    public void assignTrophieToPlayer(Integer playerId, Integer trophieId) {
        Player player = playerRepo.findById(playerId)
            .orElseThrow(() -> new RuntimeException("Player not found"));
        Trophie trophie = trophieRepo.findById(trophieId)
            .orElseThrow(() -> new RuntimeException("Trophie not found"));

        player.getPlayersTrophies().add(trophie);
        playerRepo.save(player);
    }


    
}