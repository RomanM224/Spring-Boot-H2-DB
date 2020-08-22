package com.maistruk.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Integer id;
    private String name;
    private String lang;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", lang=" + lang + "]";
    }
}
