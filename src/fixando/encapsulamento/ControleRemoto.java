package fixando.encapsulamento;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //Métodos abstratos (sobrescrevendo)

    @Override
    public void ligar() {
        this.setLigado(true);

    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }


    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + getLigado());
        System.out.println("Está tocando? " + getTocando());
        System.out.print("Volume: " + getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("|");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() +5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -5);
        } else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(getTocando())){
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && getTocando()){
            this.setTocando(false);
        }
    }

}
