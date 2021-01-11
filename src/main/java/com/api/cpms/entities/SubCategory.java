package com.api.cpms.entities;

import javax.persistence.*;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sCID;
    private String name;
    private String description;


    public int getsCID() {
        return sCID;
    }

    public void setsCID(int sCID) {
        this.sCID = sCID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

