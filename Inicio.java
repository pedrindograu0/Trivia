import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        System.out.println("Olá, bem vindo ao jogo trivia");

        // Primeira pergunta com resposta
        System.out.println("Insira seu nome de jogador por favor:");
        Scanner scanner = new Scanner(System.in);
            
        String nomeJogador = scanner.nextLine();

        System.out.println("Ok, " + nomeJogador + ", vamos começar então.");

        System.out.println("1: (Ciência) Quais das seguintes opções são animais mamíferos?");
        System.out.println("A. Pica-pau, Crocodilo, Dragão-de-komodo");
        System.out.println("B. Peixinho dourado, Corvo");
        System.out.println("C. Gato, Leão, Morcego");
        System.out.println("D. Tartaruga, Jiboia, Perereca");
        System.out.println("Digite a letra da opção desejada:");
        char opcao1 = scanner.next().charAt(0);

        switch (opcao1) {
            case 'A':
                System.out.println("Opção A errada");
                break;
            case 'B':
                System.out.println("Opção B errada");
                break;
            case 'C': 
                System.out.println("Opção C correta");
                break;
            case 'D':
                System.out.println("Opção D errada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("2: (História) Em que ano ocorreu a Segunda Guerra Mundial?");
        System.out.println("A. 1993");
        System.out.println("B. 1935");
        System.out.println("C. 2019");
        System.out.println("D. 1939");
        System.out.println("Digite a opção correta:");
        char opcao2 = scanner.next().charAt(0);

        switch (opcao2) {
            case 'A':
                System.out.println("Opção A errada");
                break;
            case 'B':
                System.out.println("Opção B errada");
                break;
            case 'C':
                System.out.println("Opção C errada");
                break;
            case 'D':
                System.out.println("Opção D correta"); 
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("3: (Geografia) Qual o continente que o país Essuatíni?");
            System.out.println("A. Africa");
            System.out.println("B. Ásia");
            System.out.println("C. America do sul");
            System.out.println("D. Oceania");
            char opcao3 = scanner.next().charAt(0);
           
            switch (opcao3) {
                case 'A':
                    System.out.println("Opção A correta");
                    break;
                case 'B':
                    System.out.println("Opção B errada");
                    break;
                case 'C':
                    System.out.println("Opção C errada");
                    break;
                case 'D':
                    System.out.println("Opção D errada");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("4.(Artes) Qual é o nome do pintor do quadro de Mona Lisa?");
                System.out.println("A. Vicente van Gogh");
                System.out.println("B. Leornado da Vinci");
                System.out.println("C. Pablo Picasso");
                System.out.println("D. Michelangelo Buonarroti");
            char opcao4 = scanner.next().charAt(0);

            switch (opcao4) {
                case 'A':
                    System.out.println("Opção A errada");
                    break;
                case 'B':
                    System.out.println("Opção B correta");
                    break;
                case 'C':
                    System.out.println("Opção C errada");    
                    break;
                case 'D':
                    System.out.println("Opção D correta");
                    break;
                default:
                  System.out.println("Opção inválida");
            }

            System.out.println("5.(Matemática) Quanto é 5x5?");
                System.out.println("A. 25");
                System.out.println("B. 10");
                System.out.println("C. 5");
                System.out.println("D. 1090");
            char opcao5 = scanner.next().charAt(0);

            switch (opcao5) {
                case 'A':
                    System.out.println("Opção A correta");
                    break;
                case 'B':
                    System.out.println("Opção B errada");
                    break;
                case 'C':
                    System.out.println("Opção C errada");
                    break;
                case 'D':
                    System.out.println("Opção D errada");
                    break;
                default:
                    System.out.println("Opção inváçida");
            }
        scanner.close();
    }
}   
