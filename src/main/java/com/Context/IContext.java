package com.Context;

import com.Models.Bean;

public interface IContext {
    void addbean(String className,String qualifiredName ) throws Exception;
    Object getbeanByClassName(String className);


    void injectiondependance( String qualifiredName1,String qualifiredName2, String nom_method) throws Exception;
    Object getByQualifiredName(String qualifiredName);
}
