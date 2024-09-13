package com.dio.entities;

import com.dio.service.Conteudo;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentoria extends Conteudo {

    private LocalDate data = LocalDate.now();


    @Override
    public String toString(){
        return "Curso: {"+
                "Titulo = "+ getTitulo() + '\'' +
                ", Descrição = " + getDescricao() + '\'' +
                ", Carga horária = " + data + '}';
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}

