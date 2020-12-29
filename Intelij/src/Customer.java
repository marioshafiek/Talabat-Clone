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
public class Customer extends Person{
    private String mob_number;
    private String address;
    private ArrayList<Order> order = new ArrayList<Order>();

    public Customer()
    {

    }
    public Customer(String username, String password, String mob_number,String address) {
        super(username, password);
        this.mob_number = mob_number;
        this.address = address;
    }

    public void setMob_number(String mob_number) {
        this.mob_number = mob_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob_number() {
        return mob_number;
    }

    public String getAddress() {
        return address;
    }
    public boolean validate_login(String username, String passwrod, Person [] p)
    {
        /* p is The available accounts of customers */
        boolean valid = false;
        
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
    public void signUp(String uname,String pass,String mob_number,String address){
        this.signUp(uname, pass);
        this.address=address;
        this.mob_number=mob_number;

    }



}
