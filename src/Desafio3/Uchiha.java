package Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String habilidadeEspecial) {
        super(nome, idade, missao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
