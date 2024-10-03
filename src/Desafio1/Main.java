package Desafio1;

public class Main {
    public static void main(String[] args) {
        String nome1 = "Naruto";
        int idade1 = 15;
        String missao1 = "Proteja a vila";
        char nivel1 = 'A';
        String status1 = "Em andamento";

        String nome2 = "Sakura";
        int idade2 = 14;
        String missao2 = "Ajude a vila";
        char nivel2 = 'B';
        String status2 = "Não iniciada";

        String nome3 = "Sasuke";
        int idade3 = 15;
        String missao3 = "Destrua a vila";
        char nivel3 = 'S';
        String status3 = "Em andamento";

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Nivel: " + nivel1);
        System.out.println("Status: " + status1);
        System.out.println("");
        if (idade1 >= 15)
            System.out.println("Esse ninja tem mais de 15 anos e pode fazer missões de qualquer nivel");
        else
            System.out.println("Esse ninja tem menos de 15 anos e só pode fazer missões de nivel C ou D");

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nivel: " + nivel2);
        System.out.println("Status: " + status2);
        System.out.println("");
        if (idade2 >= 15)
            System.out.println("Esse ninja tem mais de 15 anos e pode fazer missões de qualquer nivel");
        else
            System.out.println("Esse ninja tem menos de 15 anos e só pode fazer missões de nivel C ou D");

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nome: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nivel: " + nivel3);
        System.out.println("Status: " + status3);
        System.out.println("");
        if (idade3 >= 15)
            System.out.println("Esse ninja tem mais de 15 anos e pode fazer missões de qualquer nivel");
        else
            System.out.println("Esse ninja tem menos de 15 anos e só pode fazer missões de nivel C ou D");
    }
}
