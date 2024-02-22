package com.Models;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="property")
@XmlAccessorType(XmlAccessType.FIELD)
public class Property {
    @XmlAttribute(name="name")
    private String name;
    @XmlAttribute(name="ref")
    private String ref;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
}
