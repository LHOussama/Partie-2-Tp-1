package com.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
public class ImpContext implements IContext{
    private static ImpContext instance=new ImpContext();
    private Map<String,Map <String,Object>> context;
    public static ImpContext getInstance() {
        return instance;
    }
    private ImpContext(){
        context=new HashMap<>();
    }
    @Override
    public void addbean(String className, String qualifiredName)throws Exception {
        Class c=Class.forName(className);
        Object objet=c.getConstructor().newInstance();
        if(context.containsKey(className)){
            Map <String,Object>beansMap=context.get(className);
            beansMap.put(qualifiredName,objet);
        }
        else{
            Map <String,Object> beansMap=new HashMap<>();
            beansMap.put(qualifiredName,objet);
            context.put(className,beansMap);
        }
    }
    @Override
    public Object getbeanByClassName(String className) {
        if (context.get(className)!=null)
            return context.get(className);
        else{
            return null;
        }
    }
    @Override
    public void injectiondependance( String qualifiredName1, String ref, String nom_method) throws Exception {
        Object objet1=getByQualifiredName(qualifiredName1);
        System.out.println("objet 1 "+objet1);
        Object objet2=getByQualifiredName(ref);
        System.out.println("objet 2"+objet2);
       Method method=objet1.getClass().getMethod(nom_method,objet2.getClass());
        method.invoke(objet1,objet2);
    }

    @Override
    public Object getByQualifiredName(String qualifiredName) {
        for(Map.Entry<String,Map<String,Object>> className:context.entrySet() ){
            for (Map.Entry<String, Object> qualifiredNameObjet :className.getValue().entrySet()) {
                if(qualifiredNameObjet.getKey().equals(qualifiredName))
                    return qualifiredNameObjet.getValue();
            }
        }
        return null;
    }

    @Override
    public void injectionByContructor(String qualifiredName1, String ref) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object objet1=getByQualifiredName(qualifiredName1);
        Object objet2=getByQualifiredName(ref.trim());
        Constructor constructeur=objet1.getClass().getConstructor(objet2.getClass());
        objet1=constructeur.newInstance(objet2);
        System.out.println(context.get(objet1.getClass().getName()).replace(qualifiredName1,objet1));
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       for(Map.Entry<String,Map<String,Object>> className:context.entrySet() ) {
           sb.append("\n===Class Name===\n" + className.getKey() + "\n");
           for (Map.Entry<String, Object> qualifiredNameObjet :className.getValue().entrySet()) {
               sb.append("name: " + qualifiredNameObjet.getKey() + " - value: " + qualifiredNameObjet.getValue() + "\n");
           }
       }
       return sb.toString();
    }
    public Map<String, Map<String, Object>> getContext() {
        return context;
    }
    public void setContext(Map<String, Map<String, Object>> context) {
        this.context = context;
    }


}
