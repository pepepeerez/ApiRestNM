package com.vedruna.apiRestN_M.dto;



import com.vedruna.apiRestN_M.persistance.models.Trophie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrophieDTO {

    private int idTrophie;
    private String titulo;
    private String descripcion;

    public TrophieDTO(Trophie t) {
        this.idTrophie = t.getIdTrophie();
        this.titulo = t.getTitle();
        this.descripcion=t.getDescription();
    }

    
}
