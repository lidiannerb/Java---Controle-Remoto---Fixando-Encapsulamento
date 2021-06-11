package fixando.encapsulamento;

public class Main {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();

	    }
}
