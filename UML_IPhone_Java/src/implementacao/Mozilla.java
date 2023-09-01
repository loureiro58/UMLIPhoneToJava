package implementacao;

import interfaces.NavegadorInternet;

public class Mozilla implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
