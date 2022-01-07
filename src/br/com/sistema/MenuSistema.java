package br.com.sistema;


import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MenuSistema {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    List<Funcionario> listaFuncionario= new ArrayList<>();
//    public static void main(String[] args) throws ParseException {
//
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = format.parse("23/10/2012" );
//        GerenteDepartamento pessoa = new GerenteDepartamento("sando","043.432.234-42",date,1555.22) ;
//        System.out.println(format.format(pessoa.getDataNasc()));
//        pessoa.setEndereco(new Endereco("Rua x", "88123-321","Passa Vinte","Palhoça","SC"));
//        System.out.println(pessoa.getEndereco().toString());
//        System.out.println(pessoa.getSalario());
//    }
    public boolean adicionaFunc() throws ParseException {
        int opcao  ;
        String nome, cpf,dataNascString,rua,cep,bairro,cidade,estado;
        Date dataNasc;
        double salario;
        System.out.println("\n");
        System.out.println("===  Adicionar Funcionario ===");
        System.out.println("Solicite os dados abaixo ao Funcionario");
        System.out.print("Nome: ");
        nome =lerString();
        Validador validador =new Validador();
        boolean validado ;
        do{
            System.out.print("CPF: ");
            cpf = lerString();
            validado = validador.validaCpf(cpf);
        }while(validado);
        System.out.print("Data de Nascimento: ");
        dataNascString =lerString();
        dataNasc = format.parse(dataNascString);
        System.out.print("Salario: ");
        salario = lerValor();
        System.out.println("=== Endereço ===");
        System.out.print("Endereço: ");
        rua = lerString();
        System.out.print("CEP: ");
        cep = lerString();
        System.out.print("Bairro: ");
        bairro = lerString();
        System.out.print("Cidade: ");
        cidade = lerString();
        System.out.print("Estado: ");
        estado = lerString();
        System.out.println("===  Cargo ===");
        System.out.println("Qual cargo o mesmo vai ocupar: ");
        System.out.println("1 - Gerente Geral" + "\n"+
                           "2 - Gerente de departamento" + "\n"+
                           "3 - Líder Técnico" + "\n"+
                           "4 - Colaborador");
        System.out.print("Digite o numero correspondente ao cargo: ");
        opcao =(int) lerValor();

        if(opcao == 1){
            Funcionario funcionario = new Funcionario(nome,cpf,dataNasc,salario,EnumCargo.CARGO1);
            funcionario.setEndereco(new Endereco(rua,cep,bairro,cidade,estado));
            listaFuncionario.add(funcionario);
        }
        if(opcao == 2){
            Funcionario funcionario = new Funcionario(nome,cpf,dataNasc,salario,EnumCargo.CARGO2);
            funcionario.setEndereco(new Endereco(rua,cep,bairro,cidade,estado));
            listaFuncionario.add(funcionario);
        }
        if(opcao == 3){
            Funcionario funcionario = new Funcionario(nome,cpf,dataNasc,salario,EnumCargo.CARGO3);
            funcionario.setEndereco(new Endereco(rua,cep,bairro,cidade,estado));
            listaFuncionario.add(funcionario);
        }
        if(opcao == 4){
            Funcionario funcionario = new Funcionario(nome,cpf,dataNasc,salario,EnumCargo.CARGO4);
            funcionario.setEndereco(new Endereco(rua,cep,bairro,cidade,estado));
            listaFuncionario.add(funcionario);
        }

        System.out.println("Funcionario " + nome + " adicionado com sucesso!!!");
        return true;
    }

    public boolean detailsFunc(){
        int matricula;
        System.out.println("\n");
        System.out.println("===  Datalhes de um Funcionario ===");
        System.out.println("Digite abaixo a matricula");
        System.out.print("Matricula: ");
        matricula = (int) lerValor();
        for(Funcionario funcionario: listaFuncionario){
            if(funcionario.getMatricula() == matricula)
                System.out.println(funcionario);
        }


        return true;
    }
    public boolean demitirFunc(){
        int matricula;
        int opcao;
        System.out.println("\n");
        System.out.println("=== Demitir um Funcionario ===");
        System.out.println("Digite abaixo a matricula");
        System.out.print("Matricula: ");
        matricula = (int) lerValor();
        for(Funcionario funcionario: listaFuncionario){
            if(funcionario.getMatricula() == matricula) {
                System.out.println("Tem certeza quem quer demitir o funcionario "+ funcionario.getNome());
                System.out.println("Digite 1 para SIM e 2 para NÃO: ");
                opcao = (int) lerValor();
                if (opcao == 1) {
                    funcionario.setCargo(EnumCargo.SCARGO);
                }
            }else{
                System.out.println("Funcionario não encontrado");
            }
        }


        return true;
    }
    public boolean attFunc() throws ParseException {
        int opcao, matricula ;
        String nome, cpf,dataNascString,rua,cep,bairro,cidade,estado;
        Date dataNasc;
        double salario;
        System.out.println("\n");
        System.out.println("=== Atualizar dados um Funcionario ===");
        System.out.println("Digite abaixo a matricula");
        System.out.print("Matricula: ");
        matricula = (int) lerValor();
        for(Funcionario funcionario: listaFuncionario){
            if(funcionario.getMatricula() == matricula) {
                System.out.println("Tem certeza quem deseja alterarar os dados do funcionario "+ funcionario.getNome());
                System.out.println("Digite 1 para SIM e 2 para NÃO: ");
                opcao = (int) lerValor();
                if (opcao == 1) {
                    int opcao1;
                    System.out.print("Nome: ");
                    nome =lerString();
                    Validador validador =new Validador();
                    boolean validado ;
                    do{
                        System.out.print("CPF: ");
                        cpf = lerString();
                        validado = validador.validaCpf(cpf);
                    }while(validado);
                    System.out.print("Data de Nascimento: ");
                    dataNascString =lerString();
                    dataNasc = format.parse(dataNascString);
                    System.out.print("Salario: ");
                    salario = lerValor();
                    System.out.println("=== Endereço ===");
                    System.out.print("Endereço: ");
                    rua = lerString();
                    System.out.print("CEP: ");
                    cep = lerString();
                    System.out.print("Bairro: ");
                    bairro = lerString();
                    System.out.print("Cidade: ");
                    cidade = lerString();
                    System.out.print("Estado: ");
                    estado = lerString();
                    System.out.println("===  Cargo ===");
                    System.out.println("Qual cargo o mesmo vai ocupar: ");
                    System.out.println("1 - Gerente Geral" + "\n"+
                            "2 - Gerente de departamento" + "\n"+
                            "3 - Líder Técnico" + "\n"+
                            "4 - Colaborador");
                    System.out.print("Digite o numero correspondente ao cargo: ");
                    opcao1 =(int) lerValor();
                    funcionario.setNome(nome);
                    funcionario.setCpf(cpf);
                    funcionario.setDataNasc(dataNasc);
                    funcionario.setSalario(salario);
                    funcionario.getEndereco().setRua(rua);
                    funcionario.getEndereco().setCep(cep);
                    funcionario.getEndereco().setBairro(bairro);
                    funcionario.getEndereco().setCidade(cidade);
                    funcionario.getEndereco().setEstado(estado);

                    switch (opcao1){
                        case 1: funcionario.setCargo(EnumCargo.CARGO1); break;
                        case 2: funcionario.setCargo(EnumCargo.CARGO2);break;
                        case 3: funcionario.setCargo(EnumCargo.CARGO3);break;
                        case 4: funcionario.setCargo(EnumCargo.CARGO4);break;
                    }
                }
            }else{
                System.out.println("Funcionario não encontrado");
            }
        }
        return true;
    }
    public boolean listarFunc(){
        System.out.println("\n");
        System.out.println("=== Lista das funcionários ===");
        System.out.println("Segue abaixo todos os funcionários");

        for (Funcionario funcionario : listaFuncionario){
            System.out.println("======================================");
            System.out.println(funcionario);
            System.out.println("");

        }
        return true;
    }
    public boolean listarFuncWork(){
        System.out.println("\n");
        System.out.println("=== Lista das funcionários ===");
        System.out.println("Segue abaixo todos os funcionários");

        for (Funcionario funcionario : listaFuncionario){
            if(funcionario.getCargo().getDisplayName() == "Gerente Geral" ||
                funcionario.getCargo().getDisplayName() == "Gerente de Departamento"||
                funcionario.getCargo().getDisplayName() == "Líder Técnico"||
                funcionario.getCargo().getDisplayName() == "Colaborador"){
                System.out.println("======================================");
                System.out.println(funcionario);
                System.out.println("");
            }

        }

        return true;
    }
    public boolean listarFuncFired(){
        System.out.println("\n");
        System.out.println("=== Lista das funcionários ===");
        System.out.println("Segue abaixo todos os funcionários");

        for (Funcionario funcionario : listaFuncionario){
            if(funcionario.getCargo().getDisplayName() == "Demitido"){
                System.out.println("======================================");
                System.out.println(funcionario);
                System.out.println("");
            }

        }

        return true;
    }


    public double lerValor(){
        Scanner ler1 =new Scanner(System.in);
        while(true) {
            try{
                return  Double.parseDouble(ler1.nextLine().replace(",", "."));

            }catch (Exception e){
                System.out.println("formato invalido");
                System.out.print(" digite novamente:");

            }
        }
    }
    public String lerString(){
        Scanner ler1 =new Scanner(System.in);

        while(true) {
            String  string = ler1.nextLine();
            if(string.isEmpty()){
                System.out.println("formato invalido");
                System.out.print(" digite novamente:");
            }else{
                return string;
            }
        }
    }


    public static void main(String[] args) throws ParseException {
        boolean opcaoMenu = false;
        MenuSistema menu =new MenuSistema();
        do{
            Scanner ler1 = new Scanner(System.in);
            int opcao ;
            System.out.println("\n");
            System.out.println("=== Bem Vindo ao Sistema ===");
            System.out.println(" Segue menu de operações");
            System.out.println("1 - Adicionar funcionário" + "\n"+
                               "2 - Ver detalhes de um funcionário"+ "\n" +
                               "3 - Demitir funcionário" +"\n"+
                               "4 - Atualizar informações de um funcionário" +"\n"+
                               "5 - Listar todos os funcionários" +"\n"+
                               "6 - Listar somente os funcionários trabalhando" +"\n"+
                               "7 - Listar somente os funcionários demitidos" +"\n"+
                               "0 - Sair");
            System.out.print("Digite a operacao desejada: ");
            opcao = (int)menu.lerValor();
            switch(opcao){
                case 1: opcaoMenu = menu.adicionaFunc();break;
                case 2: opcaoMenu = menu.detailsFunc(); break;
                case 3: opcaoMenu = menu.demitirFunc(); break;
                case 4: opcaoMenu = menu.attFunc(); break;
                case 5: opcaoMenu = menu.listarFunc(); break;
                case 6: opcaoMenu = menu.listarFuncWork();;break;
                case 7: opcaoMenu = menu.listarFuncFired();break;
                default: System.err.println("Opçao Invalida"); opcaoMenu = true; break;
                case 0: opcaoMenu =  false;break;
            }
        }while(opcaoMenu);
    }
}
