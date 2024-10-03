package Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    public String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade tipo, String habilidade, String especialidade) {
        super(nome, idade, tipo, habilidade);
        this.especialidade = especialidade;
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
    public void executarEspecialidade() {
        System.out.println("Executando especialidade: " + especialidade);
    }
}
