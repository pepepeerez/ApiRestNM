package com.vedruna.apiRestN_M.services;

import java.util.List;

import com.vedruna.apiRestN_M.dto.TrophieDTO;
import com.vedruna.apiRestN_M.persistance.models.Trophie;

public interface TrophieServiceI {
    List<TrophieDTO> showAllTrophies();
    void saveTrophie(Trophie trophie);
}