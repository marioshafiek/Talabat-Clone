/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pc
 */
public class Meal {
    private String name;
    private String description;
    private float price;

    // constructors
    public Meal() {
    }

        public Meal(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
   
//setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
