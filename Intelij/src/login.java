import org.w3c.dom.ls.LSOutput;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class Login extends JFrame{
    JPanel leftpanel = new JPanel() ;
    JPanel rightpanel = new JPanel() ;
    JLabel llogo , llogin , lusername , lpassword , message;
    JButton loginbut= new JButton ();
    JTextField tuser = new JTextField(" Enter Username") ;
    JPasswordField tpass = new JPasswordField("Enter password") ;


    // color of left panel
    Color c =new Color(255,69,0);


    Color clabel  =new Color(0,0,60) ;
    Color tborder = new Color(255,238,229);

    //label for person image ,circle iamge
    JLabel lpersonimage =new JLabel();
    JLabel lcircleimage =new JLabel();
    JLabel leftBG = new JLabel();

    //images path
    ImageIcon login = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Login Butt.PNG");
    ImageIcon person = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Character.PNG");
    ImageIcon circle = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Circle under character.PNG");
    ImageIcon BackgroundLeft = new ImageIcon("Designs/Login page assets/Assets/Size 1X/Right BG.PNG");

    JSeparator sep1 = new JSeparator();
    JSeparator sep2 = new JSeparator();

    public Login()
    {
        llogo = new JLabel("Talabat");
        llogin = new JLabel("Login");
        lusername = new JLabel("Username");
        lpassword = new JLabel("Password");
        message = new JLabel("");
        this.setTitle("Talabat");
        this.setSize(1024, 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        loginbut.setIcon(login);
        loginbut.setBorderPainted(false);
        loginbut.setContentAreaFilled(false);
        loginbut.setBounds(630, 480, 238, 66);

        //Event of login button .. when the user click login button .. it will check if the user already exist or no
        loginbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Boolean validation = false;
                if(customerOrOwner.owner==true)
                {
                    message.setText("");
                    System.out.println("Owner");
                    System.out.println(tuser.getText());
                    validation = Owner.validate_login(tuser.getText(),tpass.getText());

                    if(validation==true)
                    {
                       dispose();
                       //ProfileOwner pO = new ProfileOwner(Talabat.owners.get(Owner.foundOwner));
                       ProfileOwner PO = new ProfileOwner(Talabat.owners.get(0));
                       
                    } else
                    {
                        System.out.println("NotFound");
                        message.setText("Username or password invalid");
                    }
                }
                else if(customerOrOwner.owner==false)
                {
                    message.setText("");
                    System.out.println("Customer");
                    System.out.println(tuser.getText());
                    validation= Customer.validate_login(tuser.getText(),tpass.getText());
                    if(validation==true)
                    {
                        dispose();
                        ProfileCutomer pC = new ProfileCutomer(Talabat.customers.get(Customer.foundCustomer));
                    }
                    else
                    {
                        message.setText("Username or password invalid");
                    }
                }

            }
        });



        //images properties
        lpersonimage.setIcon(person);
        lpersonimage.setBounds(75, 150, 351, 351);


        lcircleimage.setIcon(circle);
        lcircleimage.setBounds(70, 143, 359, 359);

        //words properties

        // properties of right panel , leftapnel
        rightpanel.setLayout(null);
        rightpanel.setBounds(424, 0, 524, 720);
        rightpanel.setBackground(tborder);
        leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 500, 720);
        leftpanel.setBackground(c);
        this.setResizable(false);
        this.setLocation(200,70);

        // logo (talabat) properties
        llogo.setBounds(15, 15, 200, 50);
        llogo.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        llogo.setForeground(Color.WHITE);
        llogin.setBounds(690, 80, 450, 100);
        llogin.setFont(new Font("Cairo" , Font.BOLD,50));
        llogin.setForeground(Color.decode("#141E73"));


        message.setBounds(600,550,350,70);
        message.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        message.setForeground(Color.decode("#141E73"));


        lusername.setBounds(575, 225, 450, 50);
        lusername.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        lusername.setForeground(clabel);

        lpassword.setBounds(575, 325, 450, 50);
        lpassword.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,20));
        lpassword.setForeground(clabel);





        //text field properties
        tuser.setBounds(585, 275, 250, 30);
        tuser.setForeground(Color.gray);
        tuser.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,15));
        tuser.setBorder(null);
        tuser.setBackground(tborder);


        tpass.setBounds(585, 375, 250, 30);
        tpass.setForeground(Color.gray);
        tpass.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN,15));
        tpass.setBorder(null);
        tpass.setBackground(tborder);


        sep1.setBounds(585, 304, 250, 20);
        sep1.setBorder(null);
        sep1.setBackground(Color.BLACK);

        sep2.setBounds(585, 404, 250, 20);
        sep2.setBorder(null);
        sep2.setBackground(Color.BLACK);



        //add components to left panel
        this.add(leftpanel);
        leftpanel.add(llogo);
        leftpanel.add(lpersonimage);
        leftpanel.add(lcircleimage);

        // add componets to right panel
        this.add(rightpanel);
        rightpanel.add(message);
        rightpanel.add(loginbut);
        rightpanel.add(llogin) ;
        rightpanel.add(lusername);
        rightpanel.add(lpassword);
        rightpanel.add(tuser);
        rightpanel.add(tpass);
        rightpanel.add(sep1);
        rightpanel.add(sep2);




    }




}