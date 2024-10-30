package com.vedruna.apiRestN_M.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.apiRestN_M.dto.TrophieDTO;
import com.vedruna.apiRestN_M.persistance.models.Trophie;
import com.vedruna.apiRestN_M.persistance.repository.TrophieRepositoryI;

@Service
public class TrophieServiceImpl implements TrophieServiceI {

    @Autowired
    TrophieRepositoryI trophieRepo;

    @Override
    public List<TrophieDTO> showAllTrophies() {
        List<Trophie> trophies = trophieRepo.findAll();
        List<TrophieDTO> trophiesDTO = new ArrayList<TrophieDTO>();

        for (Trophie t : trophies) {
            trophiesDTO.add(new TrophieDTO(t));
        }

        return trophiesDTO;
    }

 
    @Override
    public void saveTrophie(Trophie trophie) {
        trophieRepo.save(trophie);

    }
    




    
}