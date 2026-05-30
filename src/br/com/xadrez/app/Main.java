package br.com.xadrez.app;

import br.com.xadrez.controller.JogoController;
import br.com.xadrez.model.JogoModel;
import br.com.xadrez.view.JogoView;

public class Main {
    public static void main(String[] args) {
        JogoModel model = new JogoModel("Brancas", "Pretas");
        JogoView view = new JogoView();
        JogoController controller = new JogoController(model, view);

        controller.iniciarJogo();
        controller.finalizarTurno();
    }
}
