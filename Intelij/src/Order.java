/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Order {

    private int quantity;
    private String additional_note;
    private String order_date;
    private Meal meal;
    //setters and getters


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAdditional_note(String additional_note) {
        this.additional_note = additional_note;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAdditional_note() {
        return additional_note;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void makeOrder(Meal meal)
    {

    }

}
