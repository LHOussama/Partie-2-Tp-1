package com.Context;

import java.lang.reflect.InvocationTargetException;

public interface IContext {
    void addbean(String className,String qualifiredName ) throws Exception;
    Object getbeanByClassName(String className);
    void injectiondependance( String qualifiredName1,String qualifiredName2, String nom_method) throws Exception;
    Object getByQualifiredName(String qualifiredName);
    void injectionByContructor(String qualifiredName1,String ref) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
