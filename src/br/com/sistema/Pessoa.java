package br.com.sistema;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNasc;
    private double salario;



    public Pessoa(String nome, String cpf, Date dataNasc, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }
    public String getDataNasc() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(this.dataNasc);
        return strDate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
