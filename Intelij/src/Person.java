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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public abstract class Person {
    private String username;
    private String password;
    
    //constructors
    public Person(){    
    }
    
    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //setters and getters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }      
    //will be overloaded in owner and customer
    public void signUp(String uname,String pass){
        username=uname;
        password=pass;
    }
    //will be overrided in owner and customer
    //public abstract boolean validate_login(String username , String password ,ArrayList<Person> persons);
}

