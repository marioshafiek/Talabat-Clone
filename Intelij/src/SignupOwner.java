
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class SignupOwner extends JFrame implements ActionListener {
    JPanel p1 = new JPanel() ;
    JPanel p2 = new JPanel() ;
    JLabel logo , lsignup , luser , lpassword , lrestaurant   ;
    JLabel rbgbut= new JLabel ();


    JButton signupbut= new JButton ();


    JTextField tuser = new JTextField(" Enter Username") ;
    JPasswordField tpass = new JPasswordField("password") ;
    JTextField trestaurant = new JTextField(" Enter Restaurant name") ;


    Color c =new Color(255,69,0) ;
    Color c1 =new Color(0,0,60) ;
    Color tborder = new Color(255,238,229) ;
    JLabel lperson =new JLabel() ;
    JLabel lcircle =new JLabel() ;
    ImageIcon person = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Character.PNG");
    ImageIcon circle = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Circle under character.PNG");
    ImageIcon bg = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Left BG.PNG");
    ImageIcon signup = new ImageIcon("Designs/Sign up for user/Assets/1x/Asset 6.PNG");

    JSeparator sep1 = new JSeparator();
    JSeparator sep2 = new JSeparator();
    JSeparator sep3 = new JSeparator();
    public SignupOwner ()
    {
        logo = new JLabel("Talabat");
        lsignup = new JLabel("SIGNUP");
        luser = new JLabel("Username");
        lpassword = new JLabel("Password");
        lrestaurant = new JLabel ("Restaurant Name") ;
        this.setTitle("Talabat");
        this.setSize(1024, 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(380, 150); 

        lperson.setIcon(person);
        lperson.setBounds(100, 150, 351, 351);
        lcircle.setIcon(circle);
        lcircle.setBounds(95, 143, 359, 359);

        rbgbut.setIcon(bg);
        rbgbut.setBounds(475, 0, 540, 720);

        signupbut.setIcon(signup);
        signupbut.setBorderPainted(false);
        signupbut.setContentAreaFilled(false);
        signupbut.setBounds(650, 525, 238, 66);
        signupbut.addActionListener(this);


        p1.setLayout(null);
        p2.setLayout(null);
        p1.setBounds(0, 0, 500, 720);
        p2.setBounds(424, 0, 524, 720);
        p1.setBackground(c);

        logo.setBounds(15, 15, 200, 50);
        logo.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        logo.setForeground(Color.WHITE);
        lsignup.setBounds(675, 25, 450, 50);
        lsignup.setFont(new Font("verdana",1,40));
        lsignup.setForeground(c1);

        luser.setBounds(575, 100, 450, 50);
        luser.setFont(new Font("verdana",1,20));
        luser.setForeground(c1);

        lpassword.setBounds(575, 200, 450, 50);
        lpassword.setFont(new Font("verdana",1,20));
        lpassword.setForeground(c1);


        lrestaurant.setBounds(575, 300, 450, 50);
        lrestaurant.setFont(new Font("verdana",1,20));
        lrestaurant.setForeground(c1);


        tuser.setBounds(585, 150, 250, 30);
        tuser.setForeground(Color.gray);
        tuser.setFont(new Font("verdana",1,15));
        tuser.setBorder(null);
        tuser.setBackground(tborder);

        tpass.setBounds(585, 250, 250, 30);
        tpass.setForeground(Color.gray);
        tpass.setFont(new Font("verdana",1,15));
        tpass.setBorder(null);
        tpass.setBackground(tborder);

        trestaurant.setBounds(585, 350, 250, 30);
        trestaurant.setForeground(Color.gray);
        trestaurant.setFont(new Font("verdana",1,15));
        trestaurant.setBorder(null);
        trestaurant.setBackground(tborder);

        sep1.setBounds(585, 179, 250, 20);
        sep1.setBorder(null);
        sep1.setBackground(Color.BLACK);

        sep2.setBounds(585, 279, 250, 20);
        sep2.setBorder(null);
        sep2.setBackground(Color.BLACK);

        sep3.setBounds(585, 379, 250, 20);
        sep3.setBorder(null);
        sep3.setBackground(Color.BLACK);

        this.add(p1) ;
        this.add(p2) ;

        p1.add(logo) ;
        p1.add(lperson);
        p1.add(lcircle);
        p2.add(lsignup) ;
        p2.add(luser);
        p2.add(lpassword);
        p2.add(tuser);
        p2.add(tpass);
        p2.add(lrestaurant);
        p2.add(trestaurant);
        p2.add(sep1);
        p2.add(sep2);
        p2.add(sep3);

        p2.add(signupbut);

        p2.add(rbgbut);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signupbut)
        {
            Owner owner = new Owner();
            owner.setUsername(tuser.getText());
            owner.setPassword(tpass.getText());
            owner.restaurant.setName(trestaurant.getText());
            Talabat.owners.add(owner);
            this.dispose();
            Login login = new Login();
        }
    }
}