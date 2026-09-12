package praticarjava;

import praticarjava.metodos.academia;

import praticarjava.metodos.saude;


import java.util.Scanner;

public class PraticarJava {
    public static void main(String[] args) {

        //variaveis main
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        int saude = 100;


        //informacoes usuario
        System.out.printf("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.printf("Digite sua altura: ");
        float altura = ler.nextFloat();

        System.out.printf("Digite seu peso: ");
        float peso = ler.nextFloat();

        System.out.println("Saúde: " + saude);


        //menu completo do sistema
        do {
            System.out.println("");
            System.out.println("Bem vindo ao sistema NetSys, " + nome);
            System.out.println("O que deseja usar/fazer?");
            System.out.println("1 - Academia");
            System.out.println("2 - Comida");
            System.out.println("3 - Verificar lista do Usuário");
            System.out.println("4 - Encerrar sistema");


            System.out.printf("Opção escolhida: ");
            opcao = ler.nextInt();
            System.out.println("");

            //academia menu
            if (opcao == 1) {
                academia MinhaAcademia = new academia();
                peso = MinhaAcademia.iniciarTreino(peso);
            }

            //comida/saude menu
            if (opcao == 2) {
                saude MinhaSaude = new saude();
                saude = MinhaSaude.nivelSaude(saude);
            }

            if (opcao == 3) {
                System.out.println("Abrindo lista do usuário....");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Altura: " + altura);
                System.out.println("Peso: " + String.format("%.2f", peso) + " Kg");
                System.out.println("Saúde: " + saude + "/100");

                if (opcao == 4) {
                    System.out.println("Encerrando sistema");
                }

            }
        } while (opcao != 4);


    }
}