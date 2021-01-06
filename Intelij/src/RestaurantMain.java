import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;
import javax.swing.border.LineBorder;
import java.util.ArrayList ;
public class RestaurantMain extends JFrame implements ActionListener {
    //intialization
 
    JPanel pbg = new JPanel() ;
    JPanel meal_part = new JPanel();
   Color co = new Color(245,255,240);
   JScrollPane scrollFrame = new  JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    
    

   // bg : label to add images in it
    JLabel bg= new JLabel ();
    JLabel delivery_man = new JLabel();
    JLabel toptext = new JLabel();
    JLabel mealpart_bg = new JLabel();
    JLabel mealpart_outerframe = new JLabel();
    JButton customerIcon = new JButton();
    
    
    JLabel[] Name = new JLabel[Talabat.owners.size()];
    JLabel[] about = new JLabel[Talabat.owners.size()];
    JButton[] button = new JButton[Talabat.owners.size()];

   /* ArrayList <JLabel> meal = new ArrayList<JLabel>(size);
    ArrayList <JLabel>  name = new ArrayList<JLabel>(size);
    ArrayList <JLabel>  price = new ArrayList<JLabel>(size);
    ArrayList <JButton>  button = new ArrayList<JButton>(size);*/
    

    //static  int size = 15 ;
    public static int knowRestaurat = 0;
     
  

      
    // label for talabat text 
  JLabel ltalabat = new JLabel("Talabat");

    //intialize imageicon to add path of image
    ImageIcon bgimage = new ImageIcon("Designs/Main for user/Assets/2x/Background@2x.PNG");
    ImageIcon d_man = new ImageIcon("Designs/Main for user/Assets/1x/Delivery .PNG");
    ImageIcon TOPTEXT_IMAGE = new ImageIcon("Designs/Main for user/Assets/1x/Oredr food.PNG");
    ImageIcon mealf_image = new ImageIcon("Designs/Main for user/Assets/2x/Frame @2x.PNG");
    ImageIcon meal_IMAGE = new ImageIcon("Designs/Main for user/Assets/BackgroundRes.PNG");
    ImageIcon backRes = new ImageIcon("Designs/Main for user/Assets/1x/Asset 6.PNG");
    ImageIcon custIcon = new ImageIcon("Designs/Main for user/Assets/1x/Customer icon.PNG");
    
    public RestaurantMain ()
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
        
    

        
        ltalabat.setBounds(15, 15, 200, 50);
        ltalabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        ltalabat.setForeground(Color.white);
        
        //set image of customer icon 
        customerIcon.setIcon(custIcon);
        customerIcon.setBounds(920, 10, 100, 70);
        pbg.add(customerIcon);
        customerIcon.setBorderPainted(false);
        customerIcon.setFocusPainted(false);
        customerIcon.setContentAreaFilled(false);
        customerIcon.addActionListener(this);
        
        
//add image (bg) to a label (rbg)
        bg.setIcon(bgimage);
        //properties of  background
        bg.setBounds(0, 0, 1024, 720);
        
        mealpart_outerframe.setIcon(mealf_image);
        mealpart_outerframe.setBounds(335, 100, 1430, 10000);
  
        
        scrollFrame.setPreferredSize(new Dimension(450,10000));
        
        
         mealpart_bg.setIcon(bgimage);
        //properties of meal part  background
        mealpart_bg.setBounds(2, 2, 646, 10000);
        
        //properties of delivery man image
        delivery_man.setIcon(d_man);
        delivery_man.setBounds(15, 420, 294, 234);
        
         //properties of top text  image
          toptext.setIcon(TOPTEXT_IMAGE);
        toptext.setBounds(410, 10, 510, 75);

        // PROPERTIES OF MEAL IMAGE
       //meal_part.add(talab1);
       //meal_part.add(talab2);
         int y = 0;
      for(int i = 0 ; i < Talabat.owners.size() ; i++)
      {
          System.out.println("Enter");
          //Set label for restaurant's name
          Name[i] = new JLabel(Talabat.owners.get(i).restaurant.getName());
          Name[i].setBounds(240,20+y ,250 ,50);
          meal_part.add(Name[i]);
          Name[i].setFont(new Font("Cairo" , Font.PLAIN, 30));
          // End Set label for restaurant's name
          
          //Set about for restaurant
         about[i] = new JLabel("About: "+Talabat.owners.get(i).restaurant.getDescription());
         about[i].setBounds(390, 150+y, 220, 50);
         meal_part.add(about[i]);
         about[i].setFont(new Font("Cairo" , Font.PLAIN, 18));
         about[i].setForeground(Color.decode("#ffffff"));
         //End set about restaurant
          
          //Set button for restaurant
          button[i] = new JButton();
          button[i].setIcon(backRes);
          button[i].setBounds(2, y+5, 635,208);
          button[i].setBorder(null);
          button[i].setBorderPainted(false);
          button[i].setFocusPainted(false);
          button[i].setContentAreaFilled(false);
          meal_part.add(button[i]);
         //End set button for restaurant
         y+=240;
         
         
         button[i].addActionListener(this);
               
         
   
              
      
          

      }  

           
     
     
        scrollFrame.setBounds(335, 100, 650, 525 );
        
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

        for(int i=0; i<Talabat.owners.size();i++)
        {
            if(e.getSource()==button[i])
            {
                System.out.println("Found");
                knowRestaurat = i;
                dispose();
                demomainuser demo = new demomainuser();
            }
            else
                System.out.println("Not found");
        }
        if(e.getSource()==customerIcon)
        {
            dispose();
            ProfileCutomer pC = new ProfileCutomer(Talabat.customers.get(Customer.foundCustomer));
          
            System.out.println("Done");
        }

    }


}