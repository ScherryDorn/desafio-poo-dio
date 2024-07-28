

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(6);

        // Criando mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        // Criando desenvolvedores
        Dev dev1 = new Dev("Dev1");
        dev1.inscreverBootcamp(bootcamp);

        // Exibindo conteúdos inscritos
        System.out.println("Conteúdos Inscritos Dev1:");
        for (Conteudo conteudo : dev1.getConteudosInscritos()) {
            System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());
        }

        // Progredindo em todos os conteúdos
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();  // Assumindo que existem conteúdos suficientes para progredir

        // Exibindo conteúdos concluídos
        System.out.println("Conteúdos Concluídos Dev1:");
        for (Conteudo conteudo : dev1.getConteudosConcluidos()) {
            System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());
        }

        // Exibindo XP total
        System.out.println("XP Total Dev1: " + dev1.calcularTotalXp());
    }
}
