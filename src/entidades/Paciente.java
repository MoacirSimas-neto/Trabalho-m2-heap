package entidades;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int nivelUrgencia;
    private int tempoEsperaMinutos;
    private boolean grupoVulneravel;

    public Paciente(String nome, int nivelUrgencia, int tempoEsperaMinutos, boolean grupoVulneravel) {
        this.nome = nome;
        this.nivelUrgencia = nivelUrgencia;
        this.tempoEsperaMinutos = tempoEsperaMinutos;
        this.grupoVulneravel = grupoVulneravel;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public int getTempoEsperaMinutos() {
        return tempoEsperaMinutos;
    }

    public boolean isGrupoVulneravel() {
        return grupoVulneravel;
    }

    @Override
    public int compareTo(Paciente outro) {
        if (this.nivelUrgencia != outro.nivelUrgencia) {
            return this.nivelUrgencia - outro.nivelUrgencia;
        }

        if (this.tempoEsperaMinutos != outro.tempoEsperaMinutos) {
            return this.tempoEsperaMinutos - outro.tempoEsperaMinutos;
        }

        if (this.grupoVulneravel && !outro.grupoVulneravel) {
            return 1;
        }

        if (!this.grupoVulneravel && outro.grupoVulneravel) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return nome;
    }
}