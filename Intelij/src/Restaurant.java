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
public class Restaurant {
    private String  name; 
    private String address;
    private  String phone;
    private ArrayList<Meal> meals = new ArrayList<Meal>(); /*to get all the meals of the restaurant  */
    private ArrayList<Order> orders = new ArrayList<Order>();
    //setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    // This function check the name of meal , if it exist, will return
    public boolean CheckMeal(String name)
    {
        Boolean exist = false;
        int indexOfMeals = 0;
        Meal meal;
        for(int i=0; i<meals.size(); i++)
        {
            meal = meals.get(i);
            if(name==meal.getName())
            {
                exist = true;
            }
        }
       return exist;

    }

    public void addmeal(String name, String description, float price){

           Meal newMeal = new Meal();//create a new object from class meal
           //to set the the input that the user entered
           newMeal.setName(name);
           newMeal.setPrice(price);
           newMeal.setDescription(description);
           meals.add(newMeal);// a method in class ArrayList
    }
    //a method to remove the meal
    public void removeMeal(String name){
        int Found =0;
        for(int i=0; i<meals.size();i++)
        {
            Meal meal = meals.get(i);
            if(meal.getName()==name)
            {
                Found = i;
                break;
            }
        }
        meals.remove(Found);
    }
    public void editMeals(String oMeal,String newName, String newDescription, float newPrice){
        int index=0;
        for(Meal m : meals)
        {
            if(oMeal==m.getName())
            {
                break;
            }
            index++;
        }
        meals.set(index,new Meal(newName,newDescription,newPrice));
    }

}



