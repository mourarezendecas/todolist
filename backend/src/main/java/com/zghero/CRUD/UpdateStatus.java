package com.zghero.CRUD;

import com.zghero.classes.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStatus {
    static Scanner input = new Scanner(System.in);

    public static void updateStatus(ArrayList<Tarefa> listaTarefas, int i){
        System.out.println("1 - A FAZER");
        System.out.println("2 - FAZENDO");
        System.out.println("3 - FEITO");
        System.out.printf("Digite a opção desejada: ");
        int j = input.nextInt();
        input.nextLine();

        listaTarefas.get(i).setStatus(j);
        ListaTarefas.setTarefas(listaTarefas);
    }
}
