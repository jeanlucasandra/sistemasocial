package praticarjava.metodos;

import java.util.Scanner;

public class saude {
    public int nivelSaude(int saude) {

        Scanner ler = new Scanner(System.in);

        int opcaoalimento;
        int saudePerdida = 0;
        int saudeGanha = 0;


        System.out.println("Bem vindo a seção de alimentos: ");

        do {

            System.out.println("");
            System.out.println("Que alimento deseja consumir hoje?");
            System.out.println("1 - Frango Frito com Coca Cola");
            System.out.println("2 - Omelete Proteica com Vegetais");
            System.out.println("3 - Banana com Aveia");
            System.out.println("4 - Doritos com Guacamole");
            System.out.println("5 - Sair da seção da alimentos");

            System.out.print("Alimento escolhido: ");
            opcaoalimento = ler.nextInt();


            switch (opcaoalimento) {
                case 1:
                    System.out.println("Comendo Frango Frito com Coca Cola....");

                    saudePerdida = (int) (Math.random() * (3 - 1) + 1);
                    System.out.println("Oh não, você perdeu " + saudePerdida + " de Saúde.");

                    saude = saude - saudePerdida;
                    System.out.println("Saúde atual : " + saude + "/100");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Comendo Omelete Proteica com Vegetais....");

                    saudeGanha = (int) (Math.random() * (5 - 1) + 1);
                    System.out.println("Parábens, você ganhou " + saudeGanha + " de Saúde.");

                    saude = Math.min(saude + saudeGanha, 100);
                    System.out.println("Saúde atual : " + saude + "/100");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Comendo Banana com Aveia....");

                    saudeGanha = (int) (Math.random() * (5 - 1) + 1);
                    System.out.println("Parábens, você ganhou " + saudeGanha + " de Saúde.");

                    saude = Math.min(saude + saudeGanha, 100);
                    System.out.println("Saúde atual : " + saude + "/100");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Comendo Doritos com Guacamole....");

                    saudePerdida = (int) (Math.random() * (3 - 1) + 1);
                    System.out.println("Oh não, você perdeu " + saudePerdida + " de Saúde");

                    saude = saude - saudePerdida;
                    System.out.println("Saúde atual : " + saude + "/100");
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Saindo da cozinha....");
                    break;

                default:
                    System.out.println("Opção inexistente");
                    break;

            }
            if (saude <= 60) {
                System.out.println("Saúde abaixo do esperado!");
            } else if (saude == 100) {
                System.out.println("Saúde cheia!");
            }
        } while (opcaoalimento != 5);
        return saude;
    }
}
