package br.com.sistema;

public class Validador {
    public boolean validaCpf(String cpf) {
        cpf = cpf.trim().replace(".", "").replace("-", "");

        if (cpf.equals("00000000000") ||
                cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() != 11)) {
            System.out.println("cpf invalido");
            return true ;
        } else {

            return false;

        }
    }
}
