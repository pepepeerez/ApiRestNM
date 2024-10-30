package com.vedruna.apiRestN_M.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.apiRestN_M.dto.TrophieDTO;
import com.vedruna.apiRestN_M.persistance.models.Trophie;
import com.vedruna.apiRestN_M.services.TrophieServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1/trophie")
@CrossOrigin
public class TrophieController {

    @Autowired
    private TrophieServiceI trophieMngmnt;
    
    @GetMapping
    public List<TrophieDTO> getAllTrophies() {
        return trophieMngmnt.showAllTrophies();
    }

    @PostMapping("/insert")
    public String postTrophie(@RequestBody Trophie trophie) {
        trophieMngmnt.saveTrophie(trophie);

        return "Trophie saved";
    }

    

}