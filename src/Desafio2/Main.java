package Desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int count = 0;
        boolean sair = false;
        Ninja[] ninjas = new Ninja[size];
        while(!sair) {
            System.out.println("------------------------------------------------");
            System.out.println("Bem vindos ao cadastro de ninjas");
            System.out.println("Digite 1 para cadastrar um ninja");
            System.out.println("Digite 2 para listar os ninjas cadastrados");
            System.out.println("Digite 3 para sair");
            int escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaDoUsuario) {
                case 1:
                    if (count == size) {
                        Ninja[] buffer = new Ninja[size * 2];
                        System.arraycopy(ninjas, 0, buffer, 0, size);
                        ninjas = buffer;
                        size *= 2;
                    }
                    System.out.println("Digite o nome do ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    ninjas[count] = new Ninja(nome, idade);
                    count++;
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("=============== Lista de ninjas ===============");
                    if (count == 0)
                        System.out.println("Nenhum ninja cadastrado");
                    else {
                        for (int i = 0; i < count; i++)
                            System.out.println("Ninja " + (i + 1) + ": " + ninjas[i].nome + ", " + ninjas[i].idade + " anos");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
