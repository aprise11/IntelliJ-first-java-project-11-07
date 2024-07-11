package com.datorium.Datorium.API;

public class Cheese {
    private String name;
    private String type;
    
    public Cheese() {
    }

    public Cheese(String name, String type) {
        this.name = name;
        this.type = type;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
