package com.zghero.CRUD;

import com.zghero.alarm.AlarmClock;
import com.zghero.classes.Tarefa;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CriaTarefa {

    static Scanner input = new Scanner(System.in);
    static Date dataAlarme;
    static Calendar C1 = Calendar.getInstance();

    public static void adicionaTarefa(){
        Tarefa tarefa = new Tarefa();

        System.out.printf("Digite o nome da tarefa: ");
        tarefa.setNome(input.nextLine());
        System.out.printf("Digite a descrição da tarefa: ");
        tarefa.setDescricao(input.nextLine());
        System.out.printf("Indique a descrição da categoria (1 - PESSOAL / 2 - PROFISSIONAL / 3 - ACADÊMICO): ");
        tarefa.setCategoria(input.nextInt());
        input.nextLine();
        System.out.printf("Digite a prioridade da tarefa(1-5): ");
        tarefa.setPrioridade(input.nextInt());
        input.nextLine();
        tarefa.setStatus(1);
        System.out.println("Deseja habilitar um alarme para essa tarefa? (1-Sim/2-Não)");
        int alarmChoose = input.nextInt();
        input.nextLine();
        if(alarmChoose==1)
        {
            System.out.printf("Digite o dia: ");
            int dia = input.nextInt();
            input.nextLine();
            System.out.printf("Digite o mes: ");
            int mes = input.nextInt();
            input.nextLine();
            System.out.printf("Digite o ano: ");
            int ano = input.nextInt();
            input.nextLine();
            System.out.printf("Digite a hora: ");
            int hora = input.nextInt();
            input.nextLine();
            System.out.printf("Digite o minuto: ");
            int minuto = input.nextInt();
            input.nextLine();
            C1.set(Calendar.MONTH, mes);
            C1.set(Calendar.DATE, dia);
            C1.set(Calendar.YEAR, ano);
            C1.set(Calendar.HOUR, hora);
            C1.set(Calendar.MINUTE, minuto);
            dataAlarme = C1.getTime();

            tarefa.setDataAlarme(dataAlarme);

            System.out.printf("Alarme habilitado para: ");
            System.out.println(dataAlarme);

            AlarmClock.adicionarTarefas(tarefa);
        }

        ListaTarefas.adicionarTarefas(tarefa);
    }

}
