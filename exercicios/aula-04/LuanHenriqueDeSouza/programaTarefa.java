import java.util.Scanner;

public class programaTarefa {
    public static void main(String[] args) {
        int num, i;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas tarefas quer registrar? ");
        num = teclado.nextInt();
        teclado.nextLine();

        Tarefa[] tarefas = new Tarefa[num];
        for (i = 0; i < num; i++) {
            tarefas[i] = new Tarefa();
            System.out.println("Descrição da tarefa" + (i + 1) + ": ");
            tarefas[i].descricao = teclado.nextLine();
            tarefas[i].concluida = false;
        }

        int opcao;
        do {
            System.out.println("Digite o numero da tarefa concluída (ou 0 para finalizar): ");
            opcao = teclado.nextInt();
            if (opcao != 0 && opcao <= num) {
                tarefas[opcao - 1].concluida = true;
            }

        } while (opcao != 0);
        System.out.println("Situação das tarefas: ");
        for (i = 0; i < num; i++) {
            String status = tarefas[i].concluida ? "OK" : "Pendente";
            System.out.println((i + 1) + ". " + tarefas[i].descricao + "[" + status + "]");
        }
        teclado.close();
    }
}
