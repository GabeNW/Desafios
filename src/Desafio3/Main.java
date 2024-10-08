package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        int ninjaCount = 0;
        int uchihaCount = 0;
        int ninjaSize = 10;
        int uchihaSize = 10;

        Ninja ninjas[] = new Ninja[ninjaSize];
        Uchiha uchihas[] = new Uchiha[uchihaSize];
        while(!sair) {
            System.out.println("------------------------------------------------");
            System.out.println("Bem vindo ao cadastro de ninjas");
            System.out.println("Digite 1 para cadastrar um ninja");
            System.out.println("Digite 2 para exibir a informação de todos os ninjas cadastrados");
            System.out.println("Digite 3 para adicionar habilidade especial a um ninja");
            System.out.println("Digite 4 para sair");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Digite 1 se for um ninja normal ou 2 se for um Uchiha");
                    int tipoNinja = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o nome do ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a missão do ninja: ");
                    String missao = scanner.nextLine();

                    if (tipoNinja == 1) {
                        if (ninjaCount == ninjaSize) {
                            Ninja[] buffer = new Ninja[ninjaSize * 2];
                            System.arraycopy(ninjas, 0, buffer, 0, ninjaSize);
                            ninjas = buffer;
                            ninjaSize *= 2;
                        }
                        ninjas[ninjaCount] = new Ninja(nome, idade, missao);
                        ninjaCount++;
                    } else {
                        if (uchihaCount == uchihaSize) {
                            Uchiha[] buffer = new Uchiha[uchihaSize * 2];
                            System.arraycopy(uchihas, 0, buffer, 0, uchihaSize);
                            uchihas = buffer;
                            uchihaSize *= 2;
                        }
                        System.out.println("Digite a habilidade especial do ninja: ");
                        String habilidadeEspecial = scanner.nextLine();
                        uchihas[uchihaCount] = new Uchiha(nome, idade, missao, habilidadeEspecial);
                        uchihaCount++;
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("=============== Lista de ninjas ===============");
                    if (ninjaCount == 0 && uchihaCount == 0)
                        System.out.println("Nenhum ninja cadastrado");
                    else {
                        for (int i = 0; i < ninjaCount; i++) {
                            System.out.println("Ninja " + (i + 1) + ":");
                            ninjas[i].mostrarInformacoes();
                            System.out.println("");
                        }
                        for (int i = 0; i < uchihaCount; i++) {
                            System.out.println("Uchiha " + (i + 1) + ":");
                            uchihas[i].mostrarInformacoes();
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o indice do ninja (Uchiha) que deseja selecionar: ");
                    int ninjaSelecionado = scanner.nextInt();
                    scanner.nextLine();
                    if (ninjaSelecionado > ninjaCount - 1)
                        System.out.println("Ninja não encontrado, verifique se o valor digitado está correto");
                    else {
                        System.out.println(uchihas[ninjaSelecionado].nome + " selecionado");
                        System.out.println("Digite o nome da nova habilidade especial: ");
                        String novaHabilidade = scanner.nextLine();
                        uchihas[ninjaSelecionado].habilidadeEspecial = novaHabilidade;
                    }
                    break;
                case 4:
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
