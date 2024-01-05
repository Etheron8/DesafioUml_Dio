package Aparelho.Multifuncional;

import Aparelho.Ipad.Ipad;
import Aparelho.Telefone.AparelhoTelefonico;
import Aparelho.Navegador.NavegadorNaInternet;

public class Multifuncional implements Ipad, AparelhoTelefonico, NavegadorNaInternet {

    public void tocar() {
        System.out.println("Musica está Tocando ...");
    }

    public void pausar() {
        System.out.println("Musica está Pausada ...");

    }

    public void selecionarMusica() {
        System.out.println("selecionado Musica ...");

    }

    public void ligar() {

        System.out.println("Ligando ...");
    }

    public void atender() {
        System.out.println("Atendendo Telefone ...");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando Correio de Voz ...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina do Navegador ...");
    }

    public void adicionarNovaAba() {
        System.out.println(" Adicionando nova pagina no Navegador...");
    }

    public void atualizarPagina() {
        System.out.println(" Atulizando pagina no Navegador ...");
    }
}
