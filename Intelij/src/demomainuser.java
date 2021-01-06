import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;
import javax.swing.border.LineBorder;
import java.util.ArrayList ;
public class demomainuser extends JFrame implements ActionListener{
    //intialization
 
    JPanel pbg = new JPanel() ;
    JPanel meal_part = new JPanel();
    Color co = new Color(245,255,240);
    JScrollPane scrollFrame = new  JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    int Foundmeal = 0;

    
    

   // bg : label to add images in it
    JLabel bg= new JLabel ();
    JLabel delivery_man = new JLabel();
    JLabel toptext = new JLabel();
    JLabel mealpart_bg = new JLabel();
    JLabel mealpart_outerframe = new JLabel();
    JButton customerIcon = new JButton();
    JLabel checkoutBG = new JLabel();
    JLabel checkout = new JLabel("Check out");
    JLabel checkoutName = new JLabel("");
    JLabel checkoutPrice = new JLabel("");
    JButton checkoutDone = new JButton("");
    JLabel checkoutOrderDone = new JLabel("");
    
    
    JLabel[] meal = new JLabel[size];
    JLabel[] name = new JLabel[size];
    JLabel[] price = new JLabel[size];
    JButton[] button = new JButton[size];
    
   /* ArrayList <JLabel> meal = new ArrayList<JLabel>(size);
    ArrayList <JLabel>  name = new ArrayList<JLabel>(size);
    ArrayList <JLabel>  price = new ArrayList<JLabel>(size);
    ArrayList <JButton>  button = new ArrayList<JButton>(size);*/
    

    static  int size = 15 ;
     int imgxbound = 15 ;
     int imgybound = 10;
     
  

      
    // label for talabat text 
  JButton ltalabat = new JButton("Talabat");

    //intialize imageicon to add path of image
    ImageIcon bgimage = new ImageIcon("Designs/Main for user/Assets/2x/Background@2x.PNG");
    ImageIcon d_man = new ImageIcon("Designs/Main for user/Assets/1x/Delivery .PNG");
    ImageIcon TOPTEXT_IMAGE = new ImageIcon("Designs/Main for user/Assets/1x/Oredr food.PNG");
    ImageIcon mealf_image = new ImageIcon("Designs/Main for user/Assets/2x/Frame @2x.PNG");
    ImageIcon meal_IMAGE = new ImageIcon("Designs/Main for user/Assets/1x/Card.PNG");
    ImageIcon talab_image = new ImageIcon("Designs/Main for user/Assets/1x/TalabButt.PNG") ;
    ImageIcon custIcon = new ImageIcon("Designs/Main for user/Assets/1x/Customer icon.PNG");
    ImageIcon checkoutBorder = new ImageIcon("Designs/Main for user/Assets/1x/checkoutBG.PNG");
    ImageIcon doneButton = new ImageIcon("Designs/Main for user/Assets/1x/DoneButton.PNG");
    
    public demomainuser ()
    {
        bg = new JLabel();
        
        //set properties of frame
        this.setTitle("Talabat");
        this.setSize(1024 , 720);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(380, 150);
        

         
            //panel properties
         pbg.setBounds(424, 0, 600, 720);
        pbg.setLayout(null);
        
            //meal part panel  properties
       
      
        meal_part.setLayout(new BorderLayout());
        meal_part.setBorder(new LineBorder(Color.white));

        
         ltalabat.setBounds(0, 15, 175, 50);
        ltalabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        ltalabat.setForeground(Color.white);
        ltalabat.setBorderPainted(false);
        ltalabat.setFocusPainted(false);
        ltalabat.setContentAreaFilled(false);
        ltalabat.addActionListener(this);
        
        
        //set image of customer icon 
        customerIcon.setIcon(custIcon);
        customerIcon.setBounds(920, 10, 100, 70);
        pbg.add(customerIcon);
        customerIcon.setBorderPainted(false);
        customerIcon.setFocusPainted(false);
        customerIcon.setContentAreaFilled(false);
        customerIcon.addActionListener(this);
        
        //add check out label 
        
        checkout.setBounds(115, 105, 150, 80);
        checkout.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        checkout.setVisible(false);
        
        //add nameMeal for checkout
        
        checkoutName.setBounds(138,165,150,80);
        checkoutName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 20));
        
        //add priceMeal label 
        
        checkoutPrice.setBounds(155,220,150,80);
        checkoutPrice.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        
        
        //add done buuton 
        
        checkoutDone.setIcon(doneButton);
        checkoutDone.setBounds(90, 310, 180, 50);
         checkoutDone.setBorderPainted(false);
         checkoutDone.setFocusPainted(false);
         checkoutDone.setContentAreaFilled(false);
         checkoutDone.setVisible(false);
         checkoutDone.addActionListener(this);
        
        //Add label for order done
        pbg.add(checkoutOrderDone);
        checkoutOrderDone.setBounds(100, 350, 250, 50);
        checkoutOrderDone.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        checkoutOrderDone.setForeground(Color.decode("#141E73"));
        
        
        //add imgae for checkOut
      
        checkoutBG.setIcon(checkoutBorder);
        checkoutBG.setBounds(75,5,500,500);
        checkoutBG.setVisible(false);
        
        
        
        pbg.add(checkout);
        pbg.add(checkoutName);
        pbg.add(checkoutPrice);
        pbg.add(checkoutDone);
        pbg.add(checkoutBG);
        
        
        
        
        
        
//add image (bg) to a label (rbg)
        bg.setIcon(bgimage);
        //properties of  background
        bg.setBounds(0, 0, 1024, 720);
        
        mealpart_outerframe.setIcon(mealf_image);
        mealpart_outerframe.setBounds(335, 100, 1430, 1145);
        
        
        mealpart_bg.setIcon(bgimage);
        //properties of meal part  background
        mealpart_bg.setBounds(2, 2, 646, 521);
        
        //properties of delivery man image
        delivery_man.setIcon(d_man);
        delivery_man.setBounds(15, 420, 294, 234);
        
         //properties of top text  image
         toptext.setIcon(TOPTEXT_IMAGE);
         toptext.setBounds(410, 10, 510, 75);

        // PROPERTIES OF MEAL IMAGE
       //meal_part.add(talab1);
       //meal_part.add(talab2);
      for(int i = 0 ; i < Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.size(); i++)
      {
          
         /* meal[i] = new JLabel();
          meal[i].setIcon(meal_IMAGE);
          meal[i].setBounds(imgxbound, imgybound , 171, 252);
          //imgxbound += 220;
          imgybound += 255;
          meal_part.add(meal[i]);*/
          
         
          if(imgxbound <= 500)
          {
           System.out.println("Entered first");
           
           //Label name
           name[i] = new JLabel(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getName());
           name[i].setBounds(imgxbound+50, imgybound+30, 171, 252);
           name[i].setFont(new Font("Arial Rounded MT" , Font.ITALIC, 20));
           meal_part.add(name[i]);
           //End label for name
           
           //Label for price 
           price[i] = new JLabel(Float.toString(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getPrice())+" LE");
           price[i].setBounds(imgxbound+67, imgybound+60, 171, 252);
           meal_part.add(price[i]);
           
            //Label for button
           button[i] = new JButton();
           button[i].setIcon(talab_image);
           button[i].setBounds(imgxbound+5, imgybound+95, 171, 252);
            button[i].setBorder(null);
            button[i].setBorderPainted(false);
           button[i].setFocusPainted(false);
           button[i].setContentAreaFilled(false);
           meal_part.add(button[i]);
           //End label for button
           
           
           //Label for image
           meal[i]= new JLabel();
           meal[i].setIcon(meal_IMAGE);
           meal[i].setBounds(imgxbound, imgybound, 171, 252);
           meal_part.add(meal[i]);
           //End label for image
           
          
           button[i].addActionListener(this);
              
           imgxbound += 220;
           
          }
         
else
          {
              imgybound += 255 ;
              imgxbound =15;
              //Label name
           name[i] = new JLabel(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getName());
           name[i].setBounds(imgxbound+50, imgybound+30, 171, 252);
           name[i].setFont(new Font("Arial Rounded MT" , Font.ITALIC, 20));
           meal_part.add(name[i]);
           //End label for name
           
           //Label for price 
           price[i] = new JLabel(Float.toString(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getPrice())+" LE");
           price[i].setBounds(imgxbound+67, imgybound+60, 171, 252);
           meal_part.add(price[i]);
           
            //Label for button
           button[i] = new JButton();
           button[i].setIcon(talab_image);
           button[i].setBounds(imgxbound+5, imgybound+95, 171, 252);
            button[i].setBorder(null);
            button[i].setBorderPainted(false);
           button[i].setFocusPainted(false);
           button[i].setContentAreaFilled(false);
           meal_part.add(button[i]);
           //End label for button
           
           
           //Label for image
           meal[i]= new JLabel();
           meal[i].setIcon(meal_IMAGE);
           meal[i].setBounds(imgxbound, imgybound, 171, 252);
           meal_part.add(meal[i]);
           //End label for image
           
           imgxbound += 220 ;
           button[i].addActionListener(this);
              
      
          }

      }  

           
     
     
        scrollFrame.setBounds(335, 100, 650,525 );
       scrollFrame.setViewportView(meal_part);
       
       
       
       
     this.add(scrollFrame);
     
        
        
  
       
        
      
       meal_part.add(mealpart_bg);
         
  
      
      
       
        this.add(pbg) ;
        
         
   
        
        pbg.add(ltalabat) ;
        pbg.add(toptext) ;
        pbg.add(delivery_man) ;
      
        
        pbg.add(bg);
      
       
       


    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
            for(int i=0; i<Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.size();i++)
            {
                if(e.getSource()==button[i])
                {
                    Foundmeal = i;
                    checkoutBG.setVisible(true);
                    checkoutDone.setVisible(true);
                    checkout.setVisible(true);
                    checkoutName.setText(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getName());
                    checkoutPrice.setText(Float.toString(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(i).getPrice()));
                    
                    
                    System.out.println("Yes");
                }
            }
            if(e.getSource()==checkoutDone)
            {
                Talabat.customers.get(Customer.foundCustomer).makeOrder(Talabat.owners.get(RestaurantMain.knowRestaurat).restaurant.meals.get(Foundmeal));
                checkoutOrderDone.setText("Order is already done");
            }
            
        
        
        
            if(e.getSource()==ltalabat)
            {
                dispose();
                RestaurantMain res = new RestaurantMain();
            }
            if(e.getSource()==customerIcon)
            {
                dispose();
                ProfileCutomer pC = new ProfileCutomer(Talabat.customers.get(Customer.foundCustomer));
                
            }

    }



}