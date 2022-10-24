package com.zghero.classes;

import java.util.Date;

public class Tarefa {
    private String descricao, status, nome, categoria;

    private int prioridade, idStatus, idCat;

    private Date dataAlarme;


    public Tarefa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int i) {
        this.idStatus = i;
        if(i==1)
        {
            this.status = "A fazer";
        } else if (i==2) {
            this.status = "Fazendo";
        }
        else{
            this.status = "Feito.";
        }
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(int i) {
        this.idCat = i;
        if(i==1)
        {
            this.categoria = "Pessoal";
        } else if (i==2) {
            this.categoria = "Profissional";
        }
        else{
            this.categoria = "Acadêmico";
        }
    }

    public Date getDataAlarme() {
        return dataAlarme;
    }

    public void setDataAlarme(Date dataAlarme) {
        this.dataAlarme = dataAlarme;
    }

    public void imprimeTarefa()
    {

        System.out.println("Nome: " + this.getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Prioridade: " + this.getPrioridade());
        System.out.println("Status: " + this.getStatus());
        if(dataAlarme!=null)
        {
            System.out.println("Alarme habilitado para: " + this.getDataAlarme());
        }
        System.out.println();
    }


}
