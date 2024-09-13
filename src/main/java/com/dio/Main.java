package com.dio;

import com.dio.entities.Bootcamp;
import com.dio.entities.Curso;
import com.dio.entities.Dev;
import com.dio.entities.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev devCarlos = new Dev();
        Dev devEduardo = new Dev();

        System.out.println("-------------");

        System.out.println("-------------");

        System.out.println("-------------");

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos " + devCarlos.getConteudosInscritos());
        System.out.println("-------------");
        System.out.println("Conteúdos Inscritos " + devEduardo.getConteudosInscritos());
    }
}