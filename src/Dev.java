

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    // Construtor
    public Dev(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Método para inscrever o Dev em um Bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.inscreverDev(this);
    }

    // Método para marcar um conteúdo como concluído
    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.get(0);
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    // Método para calcular o XP total ganho
    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                                  .mapToDouble(Conteudo::calcularXp)
                                  .sum();
    }
}
