package lab2;
import java.util.*;


public class LISTA {

    List<Object> list = new ArrayList<Object>();



    List<String> masini=new ArrayList<>();
    List<String> animale=new ArrayList<>();

    public void addmasini(String masini){
        this.masini.add(masini);
    }

    public void addanimale(String animale){
        this.animale.add(animale);
    }

    public void afiseaza() {
        System.out.println("Mașini: " + masini);
        System.out.println("Animale: " + animale);
    }



}
