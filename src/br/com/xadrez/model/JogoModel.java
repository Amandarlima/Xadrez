package br.com.xadrez.model;

public class JogoModel {
    private String jogadorBranco;
    private String jogadorPreto;
    private String jogadorAtual;

    public JogoModel(String jogadorBranco, String jogadorPreto) {
        this.jogadorBranco = jogadorBranco;
        this.jogadorPreto = jogadorPreto;
        this.jogadorAtual = jogadorBranco;
    }

    public String getJogadorBranco() {
        return jogadorBranco;
    }

    public String getJogadorPreto() {
        return jogadorPreto;
    }

    public String getJogadorAtual() {
        return jogadorAtual;
    }

    public void alternarJogador() {
        jogadorAtual = jogadorAtual.equals(jogadorBranco) ? jogadorPreto : jogadorBranco;
    }
}
