package Desafio4;

public class NinjaBasico implements Ninja{
    public String nome;
    public int idade;
    public String habilidade;
    public TipoHabilidade tipo;

    public NinjaBasico(String nome, int idade, TipoHabilidade tipo, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de habilidade: " + tipo);
        System.out.println("Habilidade: " + habilidade);
    }
    public void executarHabilidade() {
        System.out.println("Executando habilidade: " + habilidade + " do tipo " + tipo);
    }
}
