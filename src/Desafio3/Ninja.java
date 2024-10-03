package Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    public Ninja(String nome, int idade, String missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
    }
}
