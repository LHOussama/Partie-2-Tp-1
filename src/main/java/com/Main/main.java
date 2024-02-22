package com.Main;
import com.Classes.Garage;
import com.Classes.Voiture;
import com.Context.IContext;
import com.Context.ImpContext;
import com.Context.JaxbToContext;
import java.util.HashMap;
public class main {
    public static void main(String[] args) throws Exception {
        IContext context = ImpContext.getInstance();
        context.addbean("com.Classes.Voiture", "bmw");
        context.addbean("com.Classes.Voiture", "mercedes");
        Voiture v1 = (Voiture) context.getByQualifiredName( "bmw");
        System.out.println(v1.vitesse());
        HashMap<String, Voiture> voitures = (HashMap<String, Voiture>) context.getbeanByClassName("com.Classes.Voiture");
        JaxbToContext jaxbToContext = new JaxbToContext();
        System.out.println(context.toString());
        Voiture vv = (Voiture) context.getByQualifiredName("v1");
        System.out.println(vv.vitesse());
        Garage g1 = (Garage) context.getByQualifiredName( "g1");
        System.out.println(g1.preparation());

    }


}
