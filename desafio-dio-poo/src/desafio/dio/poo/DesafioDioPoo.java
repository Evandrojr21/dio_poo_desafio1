
package desafio.dio.poo;

import br.com.dio.desafio.dominio.Bootcamp1;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev1;
import br.com.dio.desafio.dominio.Mentoria1;
import java.time.LocalDate;

public class DesafioDioPoo { 
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCarga_horaria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCarga_horaria(4);
        
        Mentoria1 mentoria = new Mentoria1();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp1 bootcamp = new Bootcamp1();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev1 devCamila = new Dev1();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        
        devCamila.progredir();
        devCamila.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +devCamila.calcularTotalXp());
        
        System.out.println("-----");
        
        Dev1 devJoao = new Dev1();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularTotalXp());
    }   
}
    

