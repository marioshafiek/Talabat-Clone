import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ProfileCutomer cust = new ProfileCutomer();
        //ProfileOwner owner = new ProfileOwner();
        //LoginOrsignUp a = new LoginOrsignUp();
        //customerOrOwner c = new customerOrOwner();
        Person o1 = new Owner("Marioshafiek","123");
        ((Owner) o1).restaurant.setName("Arabiata");
        ((Owner) o1).restaurant.setAddress("Cairo-Egypt");
        ((Owner) o1).restaurant.setPhone("0128487409");
        Person C1 = new Customer("Mario Shafiek","123","012848074809","Cairo-Egypt");
        Person o2 = new Owner("Zeyad","123");
        //Add customer to array list of customers
        Talabat.customers.add((Customer)C1);
        //add Owner to array list of owners;
        Talabat.owners.add((Owner) o1);
        // add owner 2 to array of owners
        Talabat.owners.add((Owner)o2);
        customerOrOwner c = new customerOrOwner();
        //ProfileCutomer c = new ProfileCutomer(Talabat.customers.get(0));
        //ProfileOwner PO = new ProfileOwner(Talabat.owners.get(0));
        
        
        //Login login = new Login();
        //SignupOwner s = new SignupOwner();



    }
}
