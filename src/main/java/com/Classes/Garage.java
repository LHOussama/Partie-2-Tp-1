package com.Classes;
public class Garage {
    private Voiture voiture;
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    public Voiture getVoiture() {
        return voiture;
    }
    public Garage(){
    }
    public Garage(Voiture voiture){
        this.voiture=voiture;

    }
    public double preparation(){
        return voiture.vitesse()*10;
    }

}
