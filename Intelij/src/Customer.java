/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pc
 */
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
    public static int foundCustomer = 0;

    public Customer(String username, String password) {
        super(username, password);
    }

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

    //the overloaded method from the person class
    public static boolean validate_login(String Name , String password) {
        /* p is The available accounts of owners */
        boolean valid = false;//to check the availabilty of the input
        //loop around the array of the available users that we have wrote
        boolean validation = true;


        for (int i = 0; i < Talabat.customers.size(); i++) {
            System.out.println("Found00");
            System.out.println(Talabat.customers.get(i).getUsername());
            if (Talabat.customers.get(i).getUsername()==Name)
            {
                valid = true;
                System.out.println("Found");
                foundCustomer = i;
                break;
            }
            else
            {
                System.out.println("NotFound yet");
            }

        }

        return valid;
    }
    public void signUp(String uname,String pass,String mob_number,String address){
        this.signUp(uname, pass);
        this.address=address;
        this.mob_number=mob_number;

    }
    public void makeOrder()
    {
       Order o = new Order();
        
    }



}

