package com.Models;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "contructeur")
@XmlAccessorType(XmlAccessType.FIELD)
public class Constructeur {
    @XmlAttribute(name="ref")
    private String ref;
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
}
