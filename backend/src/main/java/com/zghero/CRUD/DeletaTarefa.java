package com.zghero.CRUD;

import com.zghero.classes.Tarefa;

import java.util.ArrayList;

public class DeletaTarefa {
    public static void deletaTarefa(ArrayList<Tarefa> listaTarefas, int i){
            System.out.println("Tarefa: " + listaTarefas.get(i).getNome() + " deletada com sucesso!");
            listaTarefas.remove(i);
            ListaTarefas.setTarefas(listaTarefas);
    }
}
