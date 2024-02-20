package com.Main;
import com.Classes.Voiture;
import com.Context.ImpContext;
import java.util.HashMap;
public class main {
    public static void main(String[] args) throws Exception {
        ImpContext context=new ImpContext();
        context.addbean("com.Classes.Voiture","bmw");
        context.addbean("com.Classes.Voiture","mercedes");
        Voiture v1=(Voiture)context.getbeanByQualifiredName("com.Classes.Voiture","bmw");
        v1.verification();
        HashMap<String ,Voiture> voitures= (HashMap<String, Voiture>) context.getbeanByClassName("com.Classes.Voiture");
        for(Voiture voiture:voitures.values())
            voiture.verification();



    }
}
