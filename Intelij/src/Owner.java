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
public class Owner extends Person{
    Restaurant restaurant;
    //constructors
    public Owner(){
    }
    public Owner(String username, String password) {
        super(username, password);
    } 
    public Owner(String username,String password,String restaurant_name) {
        super(username,password);
        restaurant.setName(restaurant_name);
    }
    //setters and getters
    public void setRestaurant_name(String restaurant_name) {
        restaurant.setName(restaurant_name) ;
    }

    public String getRestaurant_name() {
        return restaurant.getName();

    }
     //the overloaded method from the person class
    public boolean validate_login(String username , String password ,Person [] p)
    {
        /* p is The available accounts of owners */
        boolean valid = false;//to check the availabilty of the input
        //loop around the array of the available users that we have wrote
        for(int i = 0;i<3;i++)
        {
            if(this.getUsername()==p[i].getUsername()&&this.getPassword()==p[i].getPassword())
            {
                valid = true;
                break;
            }
        }
        if(valid==true)
        {
            return true;
        }
        else {
            return false;
        }
    }

    //the overrided method from the person class 
    public void signUp(String uname,String pass,String restaurant_name){
        this.signUp(uname, pass);
        restaurant.setName(restaurant_name);

    }
}
