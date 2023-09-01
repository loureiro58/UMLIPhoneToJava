package implementacao;

import interfaces.ReprodutorMusical;

public class Player implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Música tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
