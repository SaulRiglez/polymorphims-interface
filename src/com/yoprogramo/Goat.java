package com.yoprogramo;

public class Goat implements Describable {

    private String description;

    public Goat(String name) {
        this.description = name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    /*
     * Implement other methods for a goat
     */
}
