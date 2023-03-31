import br.com.desafio.dio.dominio.BootCamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Boot Camp Java");
        mentoria.setHora(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("Spring Boot Essential");
        curso1.setDescricao("Descrição do Curso Spring Boot Essential");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot Advanced");
        curso2.setDescricao("Descrição do Curso Spring Boot Advanced");
        curso2.setCargaHoraria(80);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Boot Camp Spring Boot");
        bootCamp.setDescricao("Descrição do Boot Camp Spring Boot");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João da Silva");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("**********************");
        System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XPs: " + devJoao.calcularTotalXP());
    }
}
