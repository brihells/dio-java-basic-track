public class SmartTv {
    boolean ligada=false;
    int canal=7;
    int volume=15;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando Canal: " + canal);

    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo Canal: " + canal);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Vol: " + volume);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Vol: " + volume);

    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

}
