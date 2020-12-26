import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProfileCutomer extends JFrame {

    // Declaration
    JPanel panel ;
    JLabel talabat, customerName,  latestOrder, Username, Address, Mobilenumber, BG, ProfileImg , BGInfo , BGOrder;
    JTextField custName, address, mobileNumber;
    JButton submit;
    JSeparator sep1 , sep2 , sep3;
    ImageIcon profile = new ImageIcon("Designs/Porfile customer page asset/Asset/Profile icon.png");
    ImageIcon BackGorund = new ImageIcon("Designs/Porfile customer page asset/Asset/Background.png");
    ImageIcon subimtBUTT = new ImageIcon("Designs/Porfile customer page asset/Asset/Submit Butt.png");
    ImageIcon BGForOrder = new ImageIcon("Designs/Porfile customer page asset/Asset/BG for order.png");
    ImageIcon BGForInfo = new ImageIcon("Designs/Porfile customer page asset/Asset/BG 2 for data.png");


    public ProfileCutomer()
    {
        //Setup for frame
        this.setSize(1080,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Customer Profile");
        this.setResizable(false);
        this.setLocation(200,70);

        //Initialize
        //Initialize panel
        panel = new JPanel();
        add(panel);

        //Initialize labels
        talabat = new JLabel("Talabat");
        customerName = new JLabel("Customer name");
        latestOrder = new JLabel("Latest Order");
        Username = new JLabel("Username: ");
        Address = new JLabel("Address: ");
        Mobilenumber = new JLabel("Mobile number: ");
        ProfileImg = new JLabel();
        BGInfo = new JLabel();
        BGOrder = new JLabel();
        //Initialize label for background
        BG = new JLabel();
        //Initialized textFields
        custName = new JTextField("Enter Username");
        address = new JTextField("Enter Address");
        mobileNumber = new JTextField("Enter mobile number");
        // Initialized buttons
        submit = new JButton ("");

        // Initialized separator
        sep1 = new JSeparator();
        sep2 = new JSeparator();
        sep3 = new JSeparator();

        // End initialize

        //Set Layout
        this.setLayout(null);

        // Set layout for panel
        panel.setLayout(null);

        //Add Talabat logo
        panel.add(talabat);

        //Set the position in the screen
        talabat.setBounds(15,15,160,30);

        // Set Color for talabat
        talabat.setForeground(Color.decode("#FFFFFF"));

        // Set Font for talabat
        talabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));

        //Add profileIMG
        panel.add(ProfileImg);
        ProfileImg.setBounds(465,0,200,200);
        ProfileImg.setIcon(profile);

        // Add CustomerName label
        panel.add(customerName);
        customerName.setBounds(440,95,200,200);
        customerName.setForeground(Color.decode("#FFFFFF"));
        customerName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));


        //Add label username
        panel.add(Username);
        Username.setBounds(270,200,150,150);
        Username.setForeground(Color.BLACK);
        Username.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        // Add label Address
        panel.add(Address);
        Address.setBounds(270,270,150,150);
        Address.setForeground(Color.BLACK);
        Address.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        //ADD label for mobile number
        panel.add(Mobilenumber);
        Mobilenumber.setBounds(270,340,250,150);
        Mobilenumber.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        Mobilenumber.setForeground(Color.BLACK);

        //ADD TextField for customer name
        panel.add(custName);
        custName.setBounds(420,260,200,30);
        custName.setBorder(null);
        custName.setOpaque(false);
        custName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator
        panel.add(sep1);
        sep1.setBounds(410,290,400,10);
        sep1.setBackground(Color.black);
        sep1.setBorder(null);

        // ADD text field for address
        panel.add(address);
        address.setBounds(390,330,250,30);
        address.setBorder(null);
        address.setOpaque(false);
        address.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator2
        panel.add(sep2);
        sep2.setBounds(390,360,400,10);
        sep2.setBackground(Color.black);
        sep2.setBorder(null);

        // ADD text field for mobile number
        panel.add(mobileNumber);
        mobileNumber.setBounds(470,402,250,30);
        mobileNumber.setBorder(null);
        mobileNumber.setOpaque(false);
        mobileNumber.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator3
        panel.add(sep3);
        sep3.setBounds(470,430,350,10);
        sep3.setBackground(Color.black);
        sep3.setBorder(null);

        //ADD submit button
        panel.add(submit);
        submit.setBounds(455,460,160,39);
        submit.setIcon(subimtBUTT);
        submit.setBorderPainted(false);
        //submit.setFocusPainted(false);
        submit.setContentAreaFilled(false);



        // Add label latest order
        panel.add(latestOrder);
        latestOrder.setBounds(446,480,200,120);
        latestOrder.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 30));
        latestOrder.setForeground(Color.decode("#141E73"));


        //ADD label for BG For Info
        panel.add(BGInfo);
        BGInfo.setIcon(BGForInfo);
        BGInfo.setBounds(220,230,630,275);


        //ADD label for BG for Order
        panel.add(BGOrder);
        BGOrder.setIcon(BGForOrder);
        BGOrder.setBounds(220,470,630,275);



        // Add Background
        panel.add(BG);
        BG.setBounds(-2,0,1080,720);
        BG.setIcon(BackGorund);

        // ADD Events




    }



}
