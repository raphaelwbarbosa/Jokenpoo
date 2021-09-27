package exercicio;

import java.util.Scanner;
import java.util.Random;

public class Jokenpoo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        String resultado = "", computador_escolha = "";
        int pontos = 0;

        
       System.out.println("~~~~~~~~~~~~~~\nJoKenPo!\n~~~~~~~~~~~~~~");
       System.out.println("Digite, Pedra, Papel ou Tesoura para escolher a sua opção!");
      
       
       while (teclado.hasNext()) {
            String escolha = teclado.next(); 
            int aleatorio = gerador.nextInt(100000) % 3; 

           
            if (escolha.equals("*"))
                return;
            switch (aleatorio) {
            case 0:
                computador_escolha = "Tesoura";
                break;
            case 1:
                computador_escolha = "Papel";
                break;
            default:
                computador_escolha = "Pedra";
            }

            if (escolha.equals("tesoura")) {
                switch (aleatorio) {
                case 0:
                    resultado = "Empate!";
                    break;
                case 1:
                    resultado = "YOU WINS!";
                    pontos++;
                    break;
                default:
                    resultado = "CPU WINS!";
                    pontos--;
                }
            }

            if (escolha.equals("papel")) {
                switch (aleatorio) {
                case 0:
                    resultado = "CPU WINS";
                    pontos--;
                    break;
                case 1:
                    resultado = "Empate!";
                    break;
                default:
                    resultado = "YOU WINS!";
                    pontos++;
                }
            }

            if (escolha.equals("pedra")) {
                switch (aleatorio) {
                case 0:
                    resultado = "YOU WINS!";
                    pontos++;
                    break;
                case 1:
                    resultado = "CPU WINS";
                    pontos--;
                    break;
                default:
                    resultado = "Empate!";
                }
            }

            System.out.println(escolha + " x " + computador_escolha + ": " + resultado + "\npontos: " + pontos);
            System.out.println("Digite * se quiser sair.");
       }
    }

}