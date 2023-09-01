package implementacao;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Corrêio de vóz");
    }
}
