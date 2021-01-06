import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.* ;

public class LoginOrsignUp extends JFrame implements ActionListener {
    //intialization

    JPanel leftpanel = new JPanel() ;
    JPanel rightpanel = new JPanel() ;

    // l1: talabat , l2 : welcome to talabat
    JLabel l1 , l2  ;

    // rgb : right background , logbut : login button , signbut: sign up button
    JLabel rbg= new JLabel ();
    JButton logbut= new JButton ();
    JButton signbut= new JButton ();

    //color of panel (p1)
    Color c =new Color(255,69,0) ;

    //intialize imageicon to add path of images
    ImageIcon bg = new ImageIcon("Designs/Login or Sign up/Assets/1x/Left BG.PNG");
    ImageIcon login = new ImageIcon("Designs/Login or Sign up/Assets/1x/Login Butt.PNG");
    ImageIcon signup = new ImageIcon("Designs/Login or Sign up/Assets/1x/Sign Butt.PNG");

    //end intialization
    public LoginOrsignUp ()
    {
        l1 = new JLabel("Talabat");
        l2 = new JLabel("Welcome to Talabat");
        //set properties of frame
        this.setTitle("Talabat");
        this.setSize(1024 , 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(380, 150);

        //add image (bg) to a label (rbg)
        rbg.setIcon(bg);
        //properties of right background
        rbg.setBounds(320, 0, 720, 720);

        //properties of login button
        logbut.setIcon(login);
        logbut.setBorderPainted(false);
        logbut.setContentAreaFilled(false);
        logbut.setBounds(465, 425, 237, 61);

        logbut.addActionListener(this);

        // properties
        signbut.setIcon(signup);
        signbut.setBorderPainted(false);
        signbut.setContentAreaFilled(false);
        signbut.setBounds(740, 425, 237, 63);
        signbut.addActionListener(this);








        //set bounds of left panel , rightpanel
        rightpanel.setBounds(424, 0, 600, 720);
        rightpanel.setLayout(null);
        leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 424, 720);
        leftpanel.setBackground(c);


        //properties of l1("talabat") , l2 ("welcome to talabat"))
        l1.setBounds(120, 325, 200, 50);
        l1.setFont(new Font("verdana",1,45));
        l1.setForeground(Color.WHITE);
        l2.setBounds(520, 250, 450, 50);
        l2.setFont(new Font("verdana",1,35));
        l2.setForeground(Color.black);





        this.add(leftpanel) ;
        this.add(rightpanel) ;
        leftpanel.add(l1) ;
        rightpanel.add(l2) ;
        rightpanel.add(logbut);
        rightpanel.add(signbut) ;
        rightpanel.add(rbg) ;



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==logbut)
        {
            this.dispose();
            Login login = new Login();
         
        }
        else if(e.getSource()==signbut)
        {
            this.dispose();
            if(customerOrOwner.owner==true)
            {
                SignupOwner suO = new SignupOwner();
            }
            else if(customerOrOwner.owner==false)
            {
                SignupCustomer suC = new SignupCustomer();
            }
        }

    }
}