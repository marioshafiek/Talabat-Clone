

package talabat;
import java.awt.* ;
import javax.swing.* ;

public class login extends JFrame{
    //intialization

    JPanel leftpanel = new JPanel() ;
    JPanel rightpanel = new JPanel() ;

    // l1: talabat , l2 : welcome to talabat
    JLabel l1 , l2  ;

    // rgb : right background ,lbg : left background  ,logbut : login button , signbut: sign up button
    JLabel rbg= new JLabel ();
     JLabel lbg= new JLabel ();
    JButton logbut= new JButton ();
    JButton signbut= new JButton ();

  

    //intialize imageicon to add path of images
    ImageIcon bg = new ImageIcon("Designs/Login or Sign up/Assets/1x/Left BG.PNG");
    ImageIcon login = new ImageIcon("Designs/Login or Sign up/Assets/1x/Login Butt.PNG");
    ImageIcon signup = new ImageIcon("Designs/Login or Sign up/Assets/1x/Sign Butt.PNG");
    ImageIcon leftbg = new ImageIcon("Designs/Login or Sign up/Assets/2x/Right BG@2x.PNG");
    //end intialization
    public login ()
    {
        l1 = new JLabel("Talabat");
        l2 = new JLabel("Welcome to Talabat");
        //set properties of frame
        this.setTitle("Talabat");
        this.setSize(1024 , 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //add image (bg) to a label (rbg)
        rbg.setIcon(bg);
        //properties of right background
        rbg.setBounds(320, 0, 720, 720);

        
        //add image (leftbg) to a label (lbg)
        lbg.setIcon(leftbg);
        //properties of left background image
        lbg.setBounds(0, 0, 745, 720);
        
        
        //properties of login button
        logbut.setIcon(login);
        logbut.setBorderPainted(false);
        logbut.setContentAreaFilled(false);
        logbut.setBounds(465, 425, 237, 61);

        // properties
        signbut.setIcon(signup);
        signbut.setBorderPainted(false);
        signbut.setContentAreaFilled(false);
        signbut.setBounds(740, 425, 237, 63);
        


        //set bounds of left panel , rightpanel
        rightpanel.setBounds(424, 0, 600, 720);
        rightpanel.setLayout(null);
        leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 424, 720);
        


        //properties of l1("talabat") , l2 ("welcome to talabat"))
        l1.setBounds(120, 325, 200, 50);
        l1.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 50));
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
        leftpanel.add(lbg) ;


    }



}