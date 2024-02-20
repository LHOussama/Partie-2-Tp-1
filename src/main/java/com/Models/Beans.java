package com.Models;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name="beans")
public class Beans {
    @XmlElement(name="bean")
    List<Bean> beans=new ArrayList<>();
    public Beans(List<Bean> beans) {
        this.beans = beans;
    }
    public List<Bean> getBeans() {
        return beans;
    }
    public Beans() {
    }
}
