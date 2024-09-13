package com.dio.entities;

import com.dio.service.Conteudo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Curso extends Conteudo {

    private Integer cargaHoraria;


    @Override
    public String toString(){
        return "Curso: {"+
                "Titulo = "+ getTitulo() + '\'' +
                ", Descrição = " + getDescricao() + '\'' +
                ", Carga horária = " + cargaHoraria + '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
