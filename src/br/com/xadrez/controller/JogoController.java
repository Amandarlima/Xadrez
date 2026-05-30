package br.com.xadrez.controller;

import br.com.xadrez.model.JogoModel;
import br.com.xadrez.view.JogoView;

public class JogoController {
    private final JogoModel model;
    private final JogoView view;

    public JogoController(JogoModel model, JogoView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciarJogo() {
        view.mostrarBoasVindas();
        view.mostrarJogadorDaVez(model.getJogadorAtual());
    }

    public void finalizarTurno() {
        model.alternarJogador();
        view.mostrarTrocaDeTurno();
        view.mostrarJogadorDaVez(model.getJogadorAtual());
    }
}
