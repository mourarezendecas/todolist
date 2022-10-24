import com.zghero.CRUD.CriaTarefa;
import com.zghero.CRUD.DeletaTarefa;
import com.zghero.CRUD.ListaTarefas;
import com.zghero.CRUD.UpdateStatus;
import com.zghero.alarm.AlarmClock;

import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {iniciaApp();}

    public static void iniciaApp(){
        int i, j;
        Date dataAtual = new Date();

        Scanner input = new Scanner(System.in);
        System.out.println("--- TO DO LIST ---");
        System.out.println("1 - Criar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Atualizar Status");
        System.out.println("4 - Deletar tarefas");
        System.out.println("5 - Listar concluídas, a fazer e feitas");
        System.out.println("6 - Listar atividades com alarme");
        System.out.println("7 - Fechar programa");

        System.out.printf("Opção desejada: ");
        int option = input.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Criando tarefa.");
                CriaTarefa.adicionaTarefa();
                System.out.println("TAREFA CADASTRADA COM SUCESSO");
                iniciaApp();
                break;

            case 2:
                System.out.println("Listando tarefas.");
                System.out.println("1 - CATEGORIA");
                System.out.println("2 - PRIODIDADE");
                System.out.println("3 - STATUS");
                System.out.printf("Digite o tipo de listagem: ");
                int opt = input.nextInt();
                input.nextLine();
                    switch (opt){
                        case 1:
                            System.out.println("Listagem por Categoria");
                            System.out.println("1 - PESSOAL");
                            System.out.println("2 - PROFISSIONAL");
                            System.out.println("3 - ACADÊMICO");
                            System.out.printf("Digite o tipo de categoria: ");
                            j = input.nextInt();
                            input.nextLine();
                            ListaTarefas.listarCat(j);
                            break;
                        case 2:
                            System.out.println("Listagem por Prioridade");
                            System.out.printf("Digite o nivel de proridade (1-5): ");
                            j = input.nextInt();
                            input.nextLine();
                            ListaTarefas.listarTarefasPrioridade(j);
                            break;
                        case 3:
                            System.out.println("Listagem por Status");
                            System.out.println("1 - A fazer");
                            System.out.println("2 - Fazendo");
                            System.out.println("3 - Feito");
                            System.out.printf("Digite o tipo de status: ");
                            j = input.nextInt();
                            input.nextLine();
                            ListaTarefas.listarStatus(j);
                            break;
                    }
                iniciaApp();
                break;

            case 3:
                System.out.println("Setando status");
                ListaTarefas.listarTarefas();
                System.out.println("Digite qual tarefa deseja mudar o Status: ");
                i = input.nextInt();
                input.nextLine();
                i = i -1;
                UpdateStatus.updateStatus(ListaTarefas.getTarefas(), i);
                iniciaApp();
                break;

            case 4:
                System.out.println("Deletando tarefas.");
                ListaTarefas.listarTarefas();
                System.out.printf("Digite qual tarefa deseja deletar: ");
                i = input.nextInt();
                input.nextLine();
                i = i - 1;
                DeletaTarefa.deletaTarefa(ListaTarefas.getTarefas(), i);
                iniciaApp();
                break;

            case 5:
                System.out.println("Imprimindo Status");
                ListaTarefas.getStatus();
                iniciaApp();
                break;

            case 6:
                System.out.println("--TAREFAS COM ALARME---");
                AlarmClock.listaTarefas();
                iniciaApp();
                break;

            case 7:
                System.out.println("Saindo do programa.");
                break;

            default:
                System.out.println("Entrada inválida.");
                iniciaApp();
        }


    }

}
