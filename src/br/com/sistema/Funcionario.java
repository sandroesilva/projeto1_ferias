package br.com.sistema;

import java.util.Date;

public class Funcionario extends Pessoa{
    private Endereco endereco;
    private EnumCargo cargo;
    private int matricula;
    private static int total = 0;

    public Funcionario(String nome, String cpf, Date dataNasc, double salario, EnumCargo cargo) {
        super(nome, cpf, dataNasc, salario);
        Funcionario.total++;
        this.cargo = cargo;
        this.matricula = total;

    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setCargo(EnumCargo cargo) {
        this.cargo = cargo;
    }

    public EnumCargo getCargo() {
        return cargo;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {

        return "Nome: " + super.getNome() + "\n"+
                "CPF: " + super.getCpf() + "\n"+
                "Data de nascimento: " + super.getDataNasc() + "\n"+
                "Cargo: " + cargo.getDisplayName() + "\n"+
                "Endereco: " + this.getEndereco();
    }
}
