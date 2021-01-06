import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfileOwner extends JFrame {

    // Declaration
    JPanel OwnerProfilePanel;
    JLabel profileOwner, Ownername, talabatLogo, Restaurant, OwnerUserName, OwnerPassword, resName, resAddress, resPhone, BackG, OwnerBG, resInfoBG ;
    JButton ownerSubmit, restSubmit;
    JTextField OwnerUserText, resNameText, resAddressText, resPhoneText;
    JPasswordField OwnerPassText;
    JSeparator SEP1 , SEP2, SEP3, SEP4, SEP5 ;
    ImageIcon OwnerProfile = new ImageIcon("Designs/Profile owner page/Assets/1x/Profile icon.png");
    ImageIcon BG = new ImageIcon("Designs/Profile owner page/Assets/1x/Background N.png");
    ImageIcon restaurantBG = new ImageIcon("Designs/Profile owner page/Assets/1x/Background for rest info.png");
    ImageIcon OwnerInfoBG = new ImageIcon("Designs/Profile owner page/Assets/1x/BG 2 for data.png");
    ImageIcon SubmitBut = new ImageIcon("Designs/Profile owner page/Assets/1x/Submit button.png");
    // End declaration


    // passed to the parameter the object of owner which i will use in the frame
    public ProfileOwner(Owner owner)
    {
        //Setup for frame
        this.setSize(1080,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Owner Profile");
        this.setResizable(false);
        this.setLocation(380, 150);


        //Initialization
        // Initialize panel
        OwnerProfilePanel = new JPanel();
        add(OwnerProfilePanel);

        //Initialize Labels
        profileOwner = new JLabel();
        talabatLogo = new JLabel("Talabat");
        Restaurant = new JLabel("Restaurant");
        OwnerUserName = new JLabel("Username: ");
        OwnerPassword = new JLabel("Password: ");
        resName = new JLabel("Name: ");
        resAddress = new JLabel("Address: ");
        resPhone= new JLabel("Phone: ");
        BackG = new JLabel("Hello");
        Ownername = new JLabel(owner.getUsername());
        OwnerBG = new JLabel();
        resInfoBG =new JLabel();

        //Initialize Button
        ownerSubmit = new JButton();
        restSubmit = new JButton();

        //Initialize password
        OwnerPassText = new JPasswordField(owner.getPassword());

        //Initialize separator
        SEP1 = new JSeparator();
        SEP2 = new JSeparator();
        SEP3 =new JSeparator();
        SEP4 = new JSeparator();
        SEP5= new JSeparator();

        //Initialize TextFields
        OwnerUserText = new JTextField(owner.getUsername());
        resNameText = new JTextField(owner.restaurant.getName());
        resAddressText = new JTextField(owner.restaurant.getAddress());
        resPhoneText = new JTextField(owner.restaurant.getPhone());

        // End initialization

        //Set Layout
        this.setLayout(null);
        OwnerProfilePanel.setLayout(null);

        //Add objects
        //Add talabat logo
        OwnerProfilePanel.add(talabatLogo);
        talabatLogo.setBounds(15,15,160,30);
        // Set Font for talabat
        talabatLogo.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        // Set Color for talabat
        talabatLogo.setForeground(Color.decode("#FFFFFF"));



        // Profile picture for Owner
        OwnerProfilePanel.add(profileOwner);
        profileOwner.setBounds(650,10,190,200);
        profileOwner.setIcon(OwnerProfile);

        //ADD owner name
        OwnerProfilePanel.add(Ownername);
        Ownername.setBounds(665,210,300,30);
        Ownername.setForeground(Color.decode("#FFFFFF"));
        Ownername.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));



        // ADD username Label
        OwnerProfilePanel.add(OwnerUserName);
        OwnerUserName.setBounds(450,290,180,40);
        OwnerUserName.setForeground(Color.decode("#262626"));
        OwnerUserName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        // Add username password
        OwnerProfilePanel.add(OwnerPassword);
        OwnerPassword.setBounds(450,380,180,40);
        OwnerPassword.setForeground(Color.decode("#262626"));
        OwnerPassword.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        // Add username textField
        OwnerProfilePanel.add(OwnerUserText);
        OwnerUserText.setBounds(600,290,180,40);
        OwnerUserText.setBorder(null);
        OwnerUserText.setOpaque(false);
        OwnerUserText.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        OwnerUserText.setForeground(Color.decode("#393737"));

        // Add separator
        OwnerProfilePanel.add(SEP1);
        SEP1.setBackground(Color.BLACK);
        SEP1.setBounds(600,320,300,5);
        SEP1.setForeground(Color.BLACK);


        // Add password text field
        OwnerProfilePanel.add(OwnerPassText);
        OwnerPassText.setBounds(600,380,300,40);
        OwnerPassText.setOpaque(false);
        OwnerPassText.setBorder(null);
        OwnerPassText.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        OwnerPassText.setForeground(Color.decode("#393737"));


        // ADD SEPARATOR 2
        OwnerProfilePanel.add(SEP2);
        SEP2.setBounds(600,410,300,40);
        SEP2.setBackground(Color.black);
        SEP2.setForeground(Color.BLACK);

        // ADD owner Submit
        OwnerProfilePanel.add(ownerSubmit);
        ownerSubmit.setBounds(590,460,300,40);
        ownerSubmit.setIcon(SubmitBut);
        ownerSubmit.setBorderPainted(false);
        ownerSubmit.setFocusPainted(false);
        ownerSubmit.setContentAreaFilled(false);

        //The event of ownerSubmit button , it will update the information of owner when the user click submit
        ownerSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Update the userName of the user
                owner.setUsername(OwnerUserText.getText());
                //Update the password of the user
                owner.setPassword(OwnerPassText.getText());
                System.out.println(owner.getUsername());
                System.out.println(owner.getPassword());
                //Update the user name which appear in the screen under the photo
                Ownername.setText(owner.getUsername());

            }
        });

        //Add background for Owner info
        OwnerProfilePanel.add(OwnerBG);
        OwnerBG.setBounds(420,260,800,275);
        OwnerBG.setIcon(OwnerInfoBG);


        // Add restaurant label
        OwnerProfilePanel.add(Restaurant);
        Restaurant.setBounds(106,160,250,30);
        Restaurant.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 40));
        Restaurant.setForeground(Color.decode("#141E73"));

        //ADD restaurant name label
        OwnerProfilePanel.add(resName);
        resName.setBounds(50,260,100,30);
        resName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        resName.setForeground(Color.decode("#262626"));

        // ADD restaurant address label
        OwnerProfilePanel.add(resAddress);
        resAddress.setBounds(50,380,150,30);
        resAddress.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        resAddress.setForeground(Color.decode("#262626"));

        // ADD restaurant phone label
        OwnerProfilePanel.add(resPhone);
        resPhone.setBounds(50,500,150,30);
        resPhone.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        resPhone.setForeground(Color.decode("#262626"));

        // ADD restaurant name textField
        OwnerProfilePanel.add(resNameText);
        resNameText.setBounds(135,260,200,30);
        resNameText.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        resNameText.setForeground(Color.decode("#393737"));
        resNameText.setBorder(null);
        resNameText.setOpaque(false);

        // ADD separator 3
        OwnerProfilePanel.add(SEP3);
        SEP3.setBounds(135,285,240,30);
        SEP3.setForeground(Color.BLACK);
        SEP3.setBackground(Color.decode("#2f2f30"));

        //ADD address label for restaurant
        OwnerProfilePanel.add(resAddressText);
        resAddressText.setBounds(165,380,200,30);
        resAddressText.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        resAddressText.setForeground(Color.decode("#393737"));
        resAddressText.setBorder(null);
        resAddressText.setOpaque(false);

        // ADD separator 4
        OwnerProfilePanel.add(SEP4);
        SEP4.setBounds(165,405,220,30);
        SEP4.setForeground(Color.BLACK);
        SEP4.setBackground(Color.decode("#2f2f30"));

        // ADD restaurant phone TextField
        OwnerProfilePanel.add(resPhoneText);
        resPhoneText.setBounds(150,500,220,30);
        resPhoneText.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));
        resPhoneText.setForeground(Color.decode("#393737"));
        resPhoneText.setBorder(null);
        resPhoneText.setOpaque(false);

        // ADD separator 4
        OwnerProfilePanel.add(SEP5);
        SEP5.setBounds(150,525,220,30);
        SEP5.setForeground(Color.BLACK);
        SEP5.setBackground(Color.decode("#2f2f30"));

        //ADD submit button for restaurant
        OwnerProfilePanel.add(restSubmit);
        restSubmit.setIcon(SubmitBut);
        restSubmit.setBounds(100,600,220,60);
        restSubmit.setIcon(SubmitBut);
        restSubmit.setBorderPainted(false);
        restSubmit.setFocusPainted(false);
        restSubmit.setContentAreaFilled(false);

        // The event of restaurant Submit button .. it will update the information of restaurant when the user click submit
        restSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                owner.restaurant.setName(resNameText.getText());
                owner.restaurant.setAddress(resAddressText.getText());
                owner.restaurant.setPhone(resPhoneText.getText());
                System.out.println(owner.restaurant.getName());
                System.out.println(owner.restaurant.getAddress());
                System.out.println(owner.restaurant.getPhone());
            }
        });


        //Add background for restaurant
        OwnerProfilePanel.add(resInfoBG);
        resInfoBG.setBounds(10,50,500,720);
        resInfoBG.setIcon(restaurantBG);


        // Add Background
        OwnerProfilePanel.add(BackG);
        BackG.setBounds(0,0,1080,720);
        BackG.setIcon(BG);


    }

    private void setContentPanel(JPanel OwnerProfilePanel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
