import entidades.Paciente;
import estatica.FilaComPrioridade;

public class Main {
    public static void main(String[] args) {
        FilaComPrioridade fila = new FilaComPrioridade(10);

        fila.enfileirar(new Paciente("Carlos", 2, 45, false));
        System.out.println("Após inserir Carlos: " + fila);

        fila.enfileirar(new Paciente("Maria", 5, 5, false));
        System.out.println("Após inserir Maria: " + fila);

        fila.enfileirar(new Paciente("João", 3, 20, false));
        System.out.println("Após inserir João: " + fila);

        fila.enfileirar(new Paciente("Beatriz", 3, 35, true));
        System.out.println("Após inserir Beatriz: " + fila);

        fila.enfileirar(new Paciente("Pedro", 5, 2, false));
        System.out.println("Após inserir Pedro: " + fila);

        fila.enfileirar(new Paciente("Helena", 2, 45, true));
        System.out.println("Após inserir Helena: " + fila);

        System.out.println("\nOrdem de atendimento:");
        System.out.printf("%-12s %-10s %-8s %-12s%n", "Nome", "Urgência", "Espera", "Vulnerável");
        System.out.println("------------------------------------------------");

        while (!fila.estaVazia()) {
            Paciente p = fila.desenfileirar();
            System.out.printf("%-12s %-10d %-8d %-12s%n",
                    p.getNome(),
                    p.getNivelUrgencia(),
                    p.getTempoEsperaMinutos(),
                    p.isGrupoVulneravel() ? "Sim" : "Não");
        }
    }
}