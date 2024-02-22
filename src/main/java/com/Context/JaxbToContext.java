package com.Context;
import com.Models.Bean;
import com.Models.Beans;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
public class JaxbToContext {
    public JaxbToContext() throws Exception {
        JAXBContext jaxbContext=JAXBContext.newInstance(Beans.class);
        Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
        Beans beans=(Beans) unmarshaller.unmarshal(new File("src/main/resources/beans.xml"));
        IContext context=ImpContext.getInstance();
        for(Bean bean:beans.getBeans()) {
            context.addbean(bean.getClassName(), bean.getQualifiredName());
            if(bean.getProperty()!=null) {
                context.injectiondependance(bean.getQualifiredName(),bean.getProperty().getRef().trim(),"setVoiture");
            }
            if(bean.getConstructeur()!=null){
                context.injectionByContructor(bean.getQualifiredName(), bean.getConstructeur().getRef().trim());
            }
        }
    }
}
