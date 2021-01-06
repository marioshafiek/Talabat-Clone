import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerOrOwner extends JFrame implements ActionListener {
    //Declaration
    JPanel panel;
    JLabel Talabat,BGphoto,BGownerphoto,BGcustomerphoto;
    JButton ownerbutton,customerbutton;

    ImageIcon c00BackGround = new ImageIcon("Designs/Customer or owner/Assets/1x/Background.png");
    ImageIcon cusbutton=new ImageIcon("Designs/Customer or owner/Assets/1x/Customer butt.png");
    ImageIcon cusphoto=new ImageIcon("Designs/Customer or owner/Assets/1x/Customer photo.png");
    ImageIcon ownbutton=new ImageIcon("Designs/Customer or owner/Assets/1x/Owner butt2.png");
    ImageIcon ownphoto=new ImageIcon("Designs/Customer or owner/Assets/1x/Owner photo.png");

    public static Boolean owner;



    public customerOrOwner()
    {
        //Setup for frame
        this.setSize(1080,720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Customer or Owner");
        this.setResizable(false);
        this.setLocation(380, 150);

        //Initialize
        //Initialize panel
        panel = new JPanel();
        add(panel);

        //Initialize labels
        Talabat = new JLabel("Talabat");
        BGphoto = new JLabel();
        BGownerphoto = new JLabel();
        BGcustomerphoto= new JLabel();

        ownerbutton=new JButton();
        customerbutton=new JButton();

        //Set Layout
        this.setLayout(null);

        // Set layout for panel
        panel.setLayout(null);

        //Add Talabat logo
        panel.add(Talabat);

        //Set the position in the screen
        Talabat.setBounds(430,70,260,50);

        // Set Color for talabat
        Talabat.setForeground(Color.decode("#FFFFFF"));

        // Set Font for talabat
        Talabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 50));

        //Add BGowner
        panel.add(BGownerphoto);
        BGownerphoto.setIcon(ownphoto);
        BGownerphoto.setBounds(300,200,400,300);

        //Add BGcustomer
        panel.add(BGcustomerphoto);
        BGcustomerphoto.setIcon(cusphoto);
        BGcustomerphoto.setBounds(550,200,400,300);

        //Add ownerbutton
        panel.add(ownerbutton);
        ownerbutton.setBounds(285,430,230,100);
        ownerbutton.setIcon(ownbutton);
        ownerbutton.setBorderPainted(false);
        ownerbutton.setFocusPainted(false);
        ownerbutton.setContentAreaFilled(false);
        ownerbutton.addActionListener(this);
        //Add event to owner Button

        //Add customerbutton
        panel.add(customerbutton);
        customerbutton.setBounds(545,430,230,100);
        customerbutton.setIcon(cusbutton);
        customerbutton.setBorderPainted(false);
        customerbutton.setFocusPainted(false);
        customerbutton.setContentAreaFilled(false);
        customerbutton.addActionListener(this);

        //Add BGIMG
        panel.add(BGphoto);
        BGphoto.setBounds(0,0,1080,720);
        BGphoto.setIcon(c00BackGround);





    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ownerbutton)
        {
            owner = true;
            this.dispose();
            LoginOrsignUp los = new LoginOrsignUp();
   

        }

       if(e.getSource()==customerbutton)
        {
            owner=false;
            this.dispose();
            LoginOrsignUp los = new LoginOrsignUp();
        }

    }
}
