import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        /*Person o1 = new Owner("Marioshafiek","123");
        ((Owner) o1).restaurant.setName("Arabiata");
        ((Owner) o1).restaurant.setAddress("Cairo-Egypt");
        ((Owner) o1).restaurant.setPhone("0128487409");
        ((Owner) o1).restaurant.setDescription("Fol and flalfl");
        ((Owner) o1).restaurant.addmeal("chicken", "Verygood", 26F);
        ((Owner) o1).restaurant.addmeal("Big mac", "Verygood", 520F);
        Person C1 = new Customer("Mario Shafiek","123","012848074809","Cairo-Egypt");
        Person o2 = new Owner("Zeyad","123");*/
        
        
       //Create array of person(Owner&Customers)
        Person[] person = new Person[3];
        
        //Hard code for Owner person
        
        //First Person
        person[0] = new Owner("Marioshafiek","123","Macdonald's");
        Talabat.owners.add((Owner) person[0]);
        ((Owner)person[0]).restaurant.setID(12);
        ((Owner) person[0]).restaurant.addmeal("Big mac", "Chicken and sauce", 75F,12);
        ((Owner) person[0]).restaurant.addmeal("Big Tasty", "Chicken and sauce", 90F,12);
        ((Owner) person[0]).restaurant.addmeal("Big zak", "Chicken and sauce", 150F,12);
        ((Owner) person[0]).restaurant.setDescription("Fried chicken");
        
        
        //Second Person
        person[1]=new Owner("Zeyad sultan","123","Arabiata");
        Talabat.owners.add((Owner) person[1]);
        ((Owner)person[1]).restaurant.setID(13);
        ((Owner) person[1]).restaurant.addmeal("  Fol", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.addmeal("  Flafl", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.addmeal("  Btats", "Fol", 7F,13);
        ((Owner) person[1]).restaurant.addmeal("Baba 8no", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.setDescription("Fol we Flafl");
        
        //Third person (Customer)
        person[2] = new Customer("Marioshafiek","123","0123456789","Cairo-egypt");
        Talabat.customers.add((Customer) person[2]);
        
        
        
        
    

        customerOrOwner c = new customerOrOwner();
        //ProfileCutomer c = new ProfileCutomer(Talabat.customers.get(0));
        //ProfileOwner PO = new ProfileOwner(Talabat.owners.get(0));
        //demomainuser d = new demomainuser();
        //RestaurantMain re = new RestaurantMain();
        //Login login = new Login();
        //SignupOwner s = new SignupOwner();



    }
}
