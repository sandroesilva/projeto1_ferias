package br.com.sistema;

public class Endereco {
    private String rua;
    private String cep;
    private String bairro;
    private String Cidade;
    private String Estado;

    public Endereco(String rua, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        Cidade = cidade;
        Estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "{" +
                "rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", Cidade='" + Cidade + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
