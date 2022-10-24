package com.zghero.CRUD;

import com.zghero.classes.Tarefa;

import java.util.ArrayList;

public class ListaTarefas {

    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    static int todo=0, doing = 0, done =0;
    public static  void adicionarTarefas(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }
    public static void listarTarefas()
    {
        int i = 1;
        for(Tarefa tasks: tarefas)
        {
            System.out.println();
            System.out.println("----- TAREFA " + i + " -----");
            tasks.imprimeTarefa();
            i++;
        }
    }

    public static void listarTarefasPrioridade(int i){
        if(i==1) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getPrioridade() == 1) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==2) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getPrioridade() == 2) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==3) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getPrioridade() == 3) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==4) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getPrioridade() == 4) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==5) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getPrioridade() == 5) {
                    tasks.imprimeTarefa();
                }
            }
        }
    }

    public static void listarStatus(int i){
        if(i==1) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getStatus().equals("A fazer")) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==2) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getStatus().equals("Fazendo")) {
                    tasks.imprimeTarefa();
                }
            }
        }

        if(i==3) {
            for (Tarefa tasks : tarefas) {
                if (tasks.getStatus().equals("Feito.")) {
                    tasks.imprimeTarefa();
                }
            }
        }
    }

    public static void listarCat(int j){
        if(j==1) {
            for (Tarefa tasks : tarefas) {
                System.out.println("CATEGORIA - PESSOAL");
                if (tasks.getCategoria().equals("Pessoal")) {
                    tasks.imprimeTarefa();
                }
            }
        }
        if(j==2) {
            for (Tarefa tasks : tarefas) {
                System.out.println("CATEGORIA - PROFISSIONAL");
                if (tasks.getCategoria().equals("Profissional")) {
                    tasks.imprimeTarefa();
                }
            }
        }
        if(j==3) {
            for (Tarefa tasks : tarefas) {
                System.out.println("CATEGORIA - ACADÊMICO");
                if (tasks.getCategoria().equals("Acadêmico")) {
                    tasks.imprimeTarefa();
                }
            }
        }
    }


    public static void getStatus(){
        for(Tarefa tasks : tarefas)
        {
            if(tasks.getStatus().equals("A fazer")){
                todo++;
            }
            if(tasks.getStatus().equals("Fazendo")){
                doing++;
            }
            if(tasks.getStatus().equals("Feito.")){
                done++;
            }
        }

        System.out.println("CONCLUIDAS: " + done);
        System.out.println("PARA FAZER: " +todo);
        System.out.println("SENDO FEITAS: "+doing);
    }

    public static ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void setTarefas(ArrayList<Tarefa> tarefas) {
        ListaTarefas.tarefas = tarefas;
    }

}
