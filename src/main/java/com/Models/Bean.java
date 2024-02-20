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
}
