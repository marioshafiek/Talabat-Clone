import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ProfileCutomer cust = new ProfileCutomer();
        //ProfileOwner owner = new ProfileOwner();
        //LoginOrsignUp a = new LoginOrsignUp();
        //customerOrOwner c = new customerOrOwner();
        Owner o = new Owner("Marioshafiek","123");
        o.restaurant.setName("Arabiata");
        o.restaurant.setAddress("Cairo-Egypt");
        o.restaurant.setPhone("0128487409");
        //ArrayList<Owner> PAPAP = new ArrayList<Owner>();
        //PAPAP.add(o);
        Talabat.owners.add(o);
        customerOrOwner c = new customerOrOwner();
        //System.out.println(Talabat.owners.get(0).getUsername());



    }
}
