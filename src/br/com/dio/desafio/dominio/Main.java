package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKarina = new Dev();
        devKarina.setNome("Karina");
        devKarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Karina" + devKarina.getConteudosInscritos());
        devKarina.progredir();
        devKarina.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Karina" + devKarina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Karina" + devKarina.getConteudosConcluidos());
        System.out.println("XP:" + devKarina.calcularTotalXp());

        System.out.println("........");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Paulo" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("..");
        System.out.println("Conteudos Inscritos Paulo" + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Paulo" + devPaulo.getConteudosConcluidos());
        System.out.println("XP:" + devPaulo.calcularTotalXp());


    }
}

