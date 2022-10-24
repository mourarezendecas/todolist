package com.zghero.alarm;

import com.zghero.classes.Tarefa;

import java.util.ArrayList;
import java.util.Date;


public class AlarmClock {
    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    static Date currentDate = new Date();

    static ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public static  void adicionarTarefas(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }


    public static void listaTarefas()
    {
        for(Tarefa tasks : tarefas)
        {
            tasks.imprimeTarefa();
//            System.out.println("Faltam: " + (tasks.getDataAlarme().getDate()-currentDate.getDate())+" dias");
//            System.out.println("Faltam: " + (tasks.getDataAlarme().getMonth()-currentDate.getMonth())+" meses");
//            System.out.println("Faltam: " + (tasks.getDataAlarme().getHours()-currentDate.getHours())+" horas");
            long msDiff = tasks.getDataAlarme().getTime()-currentDate.getTime();
            Date resultado = new Date(msDiff);

            System.out.println("Faltam " + resultado.getDate() + " dias, " + resultado.getMonth() + " meses" + resultado.getHours() + " horas e " + resultado.getMinutes() + " minutos");
        }
    }

}
