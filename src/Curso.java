

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return 10d * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
