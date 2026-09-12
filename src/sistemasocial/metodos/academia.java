package sistemasocial.metodos;

import java.util.Scanner;

public class academia {
    public float iniciarTreino(float peso) {
        //variaveis
        Scanner ler = new Scanner(System.in);


        float pesoPerdido = 0;
        float pesoGanho = 0;
        int opcaoacademia;

        //menu de equipamentos

        System.out.println("Bem vindo a Youth Academy: ");

        do {
            System.out.println("---------------------------------");
            System.out.println("Qual equipamento deseja usar?");
            System.out.println("1 - Esteira");
            System.out.println("2 - Halteres");
            System.out.println("3 - Supino");
            System.out.println("4 - Pular Corda");
            System.out.println("5 - Sair da academia");
            System.out.printf("Exercício escolhido:");
            opcaoacademia = ler.nextInt();
            System.out.println("---------------------------------");

            //esteira
            switch (opcaoacademia) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Ligando Esteira....");
                    System.out.println("");
                    System.out.println("Correndo desenfreadamente....");
                    System.out.println("Desligando Esteira....");

                    pesoPerdido = (float) (Math.random() * (3.5f - 1.0f) + 1.0f);
                    System.out.println("Parábens, você perdeu " + String.format("%.2f", (float) pesoPerdido) + " kg.");
                    peso = peso - pesoPerdido;
                    System.out.println("Peso atual : " + String.format("%.2f", peso));
                    System.out.println("---------------------------------");
                    break;

                //halteres
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Pegando Halteres....");
                    System.out.println("");
                    System.out.println("Puxando peso....");
                    System.out.println("");
                    System.out.println("Colocando halteres no chão....");

                    pesoGanho = (float) (Math.random() * (5.5f - 1.5f) + 1.0f);
                    System.out.println("Parábens, você ganhou " + String.format("%.2f", (float) pesoGanho) + " kg.");
                    peso = peso + pesoGanho;
                    System.out.println("Peso atual : " + String.format("%.2f", peso));
                    System.out.println("---------------------------------");
                    break;

                //supino
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Preparando a barra....");
                    System.out.println("");
                    System.out.println("Levantando peso....");
                    System.out.println("");
                    System.out.println("Guardando a barra....");

                    pesoGanho = (float) (Math.random() * (5.5f - 1.5f) + 1.0f);
                    System.out.println("Parábens, você ganhou " + String.format("%.2f", (float) pesoGanho) + " kg.");
                    peso = peso + pesoGanho;
                    System.out.println("Peso atual : " + String.format("%.2f", peso));
                    System.out.println("---------------------------------");
                    break;

                //pular corda
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Desembolando Corda");
                    System.out.println("");
                    System.out.println("Pulando corda");
                    System.out.println("");
                    System.out.println("Guardando corda na caixa");

                    pesoPerdido = (float) (Math.random() * (3.5f - 1.0f) + 1.0f);
                    System.out.println("Parábens, você perdeu " + String.format("%.2f", (float) pesoPerdido) + " kg.");
                    peso = peso - pesoPerdido;
                    System.out.println("Peso atual : " + String.format("%.2f", peso));
                    System.out.println("---------------------------------");
                    break;

                //sair academia
                case 5:
                    System.out.println("---------------------------------");
                    System.out.println("Saindo da academia");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opção inexistente");
                    System.out.println("");
                    break;

            }
            //aviso peso
            if (peso >= 100) {
                System.out.println("Você está ficando obeso");
            } else if (peso <= 70) {
                System.out.println("Você está ficando magrelo");
            }
            System.out.println("---------------------------------");

        } while (opcaoacademia != 5);
        return peso;
    }
}

