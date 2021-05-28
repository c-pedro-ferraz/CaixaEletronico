package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        //Definição de variaveis
        Scanner ler = new Scanner(System.in);
        String cpf, senha, banco;
        float saldoInicial, depositar, sacar, transferir;
        int opcao, tentativaSenha, conta, agencia;

        //Atribuição de valores a variaveis       
        saldoInicial = 1000.00f;
        tentativaSenha = 1;

        //Inicio do Software
        //Tela de boas vindas
        System.out.println(" Seja muito bem vindo ao Banco do Pedrão !!");
        System.out.println(" [̲̅$̲̲̅̅$̲̅] Aqui seu dinheiro ta $afe [̲̅$̲̲̅̅$̲̅] ");
        System.out.print("\n Para começar, digite o CPF: "); //Solicita o CPF
        cpf = ler.nextLine(); //Le o CPF

        if ("123.456.789-00".equals(cpf)) { //Valida o CPF            
            System.out.println("\n (づ￣ ³￣)づ Seja bem vindo senhor " + cpf + " !!"); //Se CPF for verdadeiro
            System.out.print("Digite sua senha: "); //Solicita a senha
            senha = ler.nextLine(); // Le a senha

            while (!"01020304".equals(senha) && tentativaSenha < 3) { //Valida a senha e as tentativas
                System.out.println("\n (╯°□°)╯ ERRRRRROU, tenta denovo amigão: "); //Senha incorreta
                senha = ler.nextLine(); //Le a senha
                tentativaSenha++; //Acrescenta o contador
            }

            if ("01020304".equals(senha) && tentativaSenha <= 3) {
                System.out.println("\n (ﾉ◕ヮ◕)ﾉ ACERTO MIZERAVI !!"); //Se senha for verdadeiro

                do { //Entra no menu
                    System.out.println("\n [̲̅$̲̲̅$̲̲̅$̲̲̅$̲̲̅$̲̅] ESCOLHA AS OPÇÕES A BAIXO [̲̅$̲̲̅$̲̲̅$̲̲̅$̲̲̅$̲̅]");
                    System.out.println(" ");
                    System.out.println("1 - Consultar Saldo");
                    System.out.println("2 - Realizar um Depósito");
                    System.out.println("3 - Realizar um Saque");
                    System.out.println("4 - Efetuar uma Transferência");
                    System.out.println("5 - Realizar uma Nova Operação");
                    System.out.println("0 - Encerrar Operação");
                    System.out.println(" ");

                    opcao = ler.nextInt(); //Le a opção digitada pelo usuario

                    switch (opcao) {

                        case 1: //Imprime o saldo
                            System.out.println(" \n [̲̅$̲̲̲̅] Saldo: RS:" + saldoInicial);
                            break;

                        case 2: //Realiza o deposito
                            System.out.println(" \n [̲̅$̲̲̲̅] Quanto vai depositar consagrado?");
                            System.out.print(" [̲̅$̲̲̲̅] R$: "); //Solicita o valor
                            depositar = ler.nextFloat(); //Le o valor 
                            saldoInicial = saldoInicial + depositar; //Atualiza o saldo
                            System.out.println(" \n [̲̅$̲̲̲̅] Saldo Atual: RS:" + saldoInicial); //Imprime o saldo atual
                            break;

                        case 3: //Realiza um saque
                            System.out.println(" \n [̲̅$̲̲̲̅] Quanto vai sacar consagrado?");
                            System.out.print(" [̲̅$̲̲̲̅] R$: "); //Solicita o valor
                            sacar = ler.nextFloat(); //Le o valor 

                            if (sacar > saldoInicial) { // Se o valor digitado foi maior que o saldo não saca
                                System.out.println(" \n (╯°□°)╯ Se não tem isso tudo de dinheiro não amigo !");
                            } else { //Se não saca
                                saldoInicial = saldoInicial - sacar; //Atualiza o saldo
                                System.out.println(" \n [̲̅$̲̲̲̅] Saldo Atual: RS:" + saldoInicial); //Imprime o saldo atual
                            }
                            break;

                        case 4: //Realiza uma transferencia
                            System.out.println(" \n [̲̅$̲̲̲̅] Quanto vai transferir consagrado?");
                            System.out.print(" [̲̅$̲̲̲̅] R$: "); //Solicita o valor
                            transferir = ler.nextFloat(); //Le o valor

                            if (transferir > saldoInicial) { // Se o valor digitado foi maior que o saldo não transfere
                                System.out.println(" \n (╯°□°)╯ Se não tem isso tudo de dinheiro não amigo !");
                            } else { // Se não transfere
                                System.out.println(" ");
                                
                                System.out.print(" [̲̅$̲̲̲̅] Digite o nome do banco: "); //Solicita o nome do banco
                                banco = ler.next(); //Le o nome do conta

                                System.out.print(" [̲̅$̲̲̲̅] Digite o numero da conta: "); //Solicita a conta
                                conta = ler.nextInt(); //Le o numero da conta

                                System.out.print(" [̲̅$̲̲̲̅] Digite o numero da agencia e digito: "); //Solicita a agencia
                                agencia = ler.nextInt(); //Le a agencia

                                System.out.print(" \n [̲̅$̲̲̲̅] Transferido R$:" + transferir
                                        + " para o Banco: " + banco
                                        + " | Conta: " + conta
                                        + " | Agencia: " + agencia);

                                System.out.println(" ");

                                saldoInicial = saldoInicial - transferir; //Atualiza o saldo
                                System.out.println(" \n [̲̅$̲̲̲̅] Saldo Atual: RS:" + saldoInicial); //Imprime o saldo atual
                            }
                            break;

                        case 5:
                            System.out.println(" \n [̲̅$̲̲̲̅]  BANCO DO PEDRÃO AO SEU DISPOR [̲̅$̲̲̲̅] "); //Realiza uma nova operação
                            break;

                        case 0:
                            System.out.println(" \n [̲̅$̲̲̲̅]  OBRIGADO E VOLTE $EMPRE !! [̲̅$̲̲̲̅] "); //Encerra a tela
                            break;

                        default:
                            System.out.println("\n (╯°□°)╯ ERRRRRROU, escolha as opções a baixo"); //Escolha incorreta
                            break;
                    }
                } while (opcao != 0);
            } else { // Errou 3 vezes a senha bloqueia o cartão
                System.out.println("\n (╯°□°)╯ ERRRRRROU 3 vezes a senha, cartão bloqueado vai ter que ligar na central kk");
            }
        } else { // Errou o cpf nem entra no sistema
            System.out.println("\n (╯°□°)╯ ERRRRRROU, CPF ta errado amigão, tente novamente");
        }
    }
}
