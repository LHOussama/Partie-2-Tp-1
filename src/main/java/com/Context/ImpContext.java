package com.Context;
import java.util.HashMap;
import java.util.Map;
public class ImpContext implements IContext{
    private Map<String,Map <String,Object>> context=new HashMap<>();
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
    public Object getbeanByClassName(String className)throws Exception {
        return context.get(className);
    }
    @Override
    public Object getbeanByQualifiredName(String className,String qualifiredName)throws Exception {
        return context.get(className).get(qualifiredName);
    }
}
