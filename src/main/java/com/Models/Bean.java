package com.Models;
import com.Context.IContext;
import com.Context.ImpContext;
import jakarta.xml.bind.annotation.*;
import java.util.Map;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bean {
    @XmlAttribute
    private String className;
    @XmlAttribute
    private String qualifiredName;
    @XmlElement
    private Property property;
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getQualifiredName() {
        return qualifiredName;
    }
    public void setQualifiredName(String qualifiredName) {
        this.qualifiredName = qualifiredName;
    }
    public void setProperty(Property property) {
        this.property = property;
    }
    public Property getProperty() {
        return property;
    }
}
