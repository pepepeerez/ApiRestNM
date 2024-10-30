package com.vedruna.apiRestN_M.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.apiRestN_M.dto.PlayerDTO;
import com.vedruna.apiRestN_M.persistance.models.Player;
import com.vedruna.apiRestN_M.services.PlayerServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1/player")
@CrossOrigin
public class PlayerController {

    @Autowired
    private PlayerServiceI playerMngmnt;
    
    @GetMapping
    public List<PlayerDTO> getAllPlayers() {
        return playerMngmnt.showAllPlayers();
    }

    @GetMapping("/name/{username}")
    public PlayerDTO showPlayerByUsername(@PathVariable String username) {
        return playerMngmnt.showPlayerByUsername(username);
    }

    @PostMapping("/insert")
    public String postPlayer(@RequestBody Player player) {
        playerMngmnt.savePlayer(player);

        return "Player saved";
    }
    @PostMapping("assign/{idplayer}/{idtrophie}")
    public String assignTrophieToPlayer(@PathVariable Integer idplayer, @PathVariable Integer idtrophie) {
        playerMngmnt.assignTrophieToPlayer(idplayer, idtrophie);
        return "Trophie assigned to player";
    }
    
    
    @DeleteMapping("delete/{id}")
    public String deletePlayer(@PathVariable Integer id) {
        playerMngmnt.deletePlayer(id);
        
        return "Player deleted";
    }

}