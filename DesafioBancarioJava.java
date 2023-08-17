import jdk.jshell.Snippet;

import java.util.Scanner;

public class DesafioBancarioJava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente;
        String tipoConta;
        double saldo;
        String extrato, operacoes;
        int operacaoEscolhida;
        boolean processo = true;

        nomeCliente = "Jacqueline Oliveira";
        tipoConta = "Corrente";
        saldo = 2500.00;

        extrato = """
                ***********************
                
                Nome: %s
                Tipo de conta: %s
                Saldo: %.2f
                
                ***********************""".formatted(nomeCliente,tipoConta,saldo);

        operacoes = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:""";
        System.out.println(extrato);

        while(processo){

        System.out.println(operacoes);
        operacaoEscolhida = leitura.nextInt();

        switch (operacaoEscolhida) {
            case 1:
                System.out.println("Seu saldo atual é: "+ saldo);
                break;
            case 2:
                System.out.println("Valor a ser recebido: ");
                saldo+=leitura.nextDouble();
                System.out.println("Seu saldo agora é:"+ saldo);
                break;
            case 3:
                System.out.println("Quando deseja transferir: ");
                if (saldo>=leitura.nextDouble()) {
                    saldo -= leitura.nextDouble();
                    System.out.println("Seu salado passsa a ser: " + saldo);
                }else{
                    System.out.println("Não há saldo suficiente.");
                }
                break;
            case 4:
                System.out.println("Processo finalizado.");
                processo = false;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }}
    }
}

/*import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}*/
