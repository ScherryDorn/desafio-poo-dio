
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Conteudo> conteudos = new ArrayList<>();
    private List<Dev> devsInscritos = new ArrayList<>();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
    }
}
