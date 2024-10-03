package Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Naruto", 17, TipoHabilidade.NINJUTSU, "Rasengan");
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke", 17, TipoHabilidade.NINJUTSU, "Chidori", "Sharingan");

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        System.out.println("");

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
        ninjaAvancado.executarEspecialidade();
    }
}
