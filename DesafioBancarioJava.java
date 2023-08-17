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

        while(processo){
        System.out.println(extrato);
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
                saldo-=leitura.nextDouble();
                System.out.println("Seu salado passsa a ser: "+ saldo);
                break;
            case 4:
                System.out.println("Processo finalizado.");
                processo = false;
                break;

        }}
    }
}
