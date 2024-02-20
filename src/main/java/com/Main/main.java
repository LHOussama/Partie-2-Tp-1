package com.Main;
import com.Classes.Voiture;
import com.Context.IContext;
import com.Context.ImpContext;
import com.Context.JaxbToContext;
import com.Models.Bean;

import java.util.HashMap;
public class main {

    public static void main(String[] args) throws Exception {
        IContext context=ImpContext.getInstance();
        context.addbean("com.Classes.Voiture","bmw");
        context.addbean("com.Classes.Voiture","mercedes");
        Voiture v1=(Voiture)context.getbeanByQualifiredName("com.Classes.Voiture","bmw");
        System.out.println(v1.vitesse());
        HashMap<String ,Voiture> voitures= (HashMap<String, Voiture>) context.getbeanByClassName("com.Classes.Voiture");
        for(Voiture voiture:voitures.values())
            System.out.println(voiture.vitesse());
        JaxbToContext jaxbToContext=new JaxbToContext();
        for(Voiture voiture:voitures.values())
            System.out.println(voiture.vitesse());
        System.out.println(context.toString());


    }


}
