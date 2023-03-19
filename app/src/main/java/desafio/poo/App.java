/*
 * @author Bruno
 */
package desafio.poo;

import java.time.LocalDate;

import desafio.poo.dominio.Bootcamp;
import desafio.poo.dominio.Curso;
import desafio.poo.dominio.Dev;
import desafio.poo.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso java");
        curso1.setCargaHoraria(72);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso C++");
        curso2.setDescricao("Curso C++");
        curso2.setCargaHoraria(80);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev brunoDev = new Dev();
        brunoDev.setNome("Bruno");
        brunoDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscrito Bruno: " + brunoDev.getConteudoInscrito());
        brunoDev.progredir();
        System.out.println("Conteúdo inscrito Bruno: " + brunoDev.getConteudoInscrito());
        System.out.println("Conteúdo Concluido Bruno: " + brunoDev.getConteudoConcluido());
        System.out.println("XP: " + brunoDev.calcularTotlXP());

        Dev joaoDev = new Dev();
        joaoDev.setNome("João");
        joaoDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscrito João: " + joaoDev.getConteudoInscrito());
        joaoDev.progredir();
        System.out.println("Conteúdo inscrito João: " + joaoDev.getConteudoInscrito());
        System.out.println("Conteúdo Concluido João: " + joaoDev.getConteudoConcluido());
        System.out.println("XP: " + joaoDev.calcularTotlXP());
    }
}
