package com.Models;
import jakarta.xml.bind.annotation.*;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bean {
    @XmlAttribute
    private String className;
    @XmlAttribute
    private String qualifiredName;
    @XmlElement
    private Property property;
    @XmlElement
    private Constructeur constructeur;
    public Constructeur getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(Constructeur constructeur) {
        this.constructeur = constructeur;
    }

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
