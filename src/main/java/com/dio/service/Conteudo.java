package com.dio.service;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper= false)
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;

    private String descricao;

    public abstract double calcularXP();
}
