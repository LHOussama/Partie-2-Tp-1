package com.Context;
public interface IContext {
    void addbean(String className,String qualifiredName ) throws Exception;
    Object getbeanByClassName(String className)throws Exception;
    Object getbeanByQualifiredName(String className,String qualifiredName)throws Exception;
    void injectiondependance();
}
