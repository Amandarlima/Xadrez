package br.com.xadrez.view;

public class JogoView {

    public void mostrarBoasVindas() {
        System.out.println("=== Xadrez MVC ===");
    }

    public void mostrarJogadorDaVez(String jogador) {
        System.out.println("Jogador da vez: " + jogador);
    }

    public void mostrarTrocaDeTurno() {
        System.out.println("Turno finalizado.\n");
    }
}
