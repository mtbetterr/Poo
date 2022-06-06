package aula02;
import java.util.concurrent.TimeUnit;


public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected float carga;
   protected boolean tampada;

    public void status(){
System.out.println("Caneta!");

        System.out.println("Modelo: " + this.modelo);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Uma Caneta " + this.cor);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ponta: " + this.ponta);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Carga: " + this.carga);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Está tampada? " + this.tampada);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
    
}

    
  protected  void tampar() {
        this.tampada = true;

    }
  protected  void destampar(){
        this.tampada = false;
        
    }
   public void rabiscar(){
        if (this.tampada == true){
            System.out.println ("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");

        }
        System.out.println("___________________________");

    }
}
