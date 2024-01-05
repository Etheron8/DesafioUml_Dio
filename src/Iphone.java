import Aparelho.Multifuncional.Multifuncional;

public class Iphone {

    public static void main(String[] args) {

        System.out.println("Bem Vindo ao Iphone 7 com os recursos de Ipad,Telefone,Navegador");

        Multifuncional iphone7 = new Multifuncional();

        System.out.println("\nNavegador:");
        iphone7.exibirPagina();
        iphone7.atualizarPagina();
        iphone7.adicionarNovaAba();

        System.out.println("\nTelefone:");
        iphone7.atender();
        iphone7.ligar();
        iphone7.iniciarCorrerioVoz();

        System.out.println("\naIpad:");
        iphone7.tocar();
        iphone7.pausar();
        iphone7.selecionarMusica();

    }
}