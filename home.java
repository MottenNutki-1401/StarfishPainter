import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class home {

    public static void main (String [] args) {

        JFrame frame = new JFrame("Starfish Painter");


        frame.setSize(800,600); //width x height of frame
        //To create a custom window so we can add our own colors, buttons etc 
        // we need to remove the OS tittle bar
        frame.setUndecorated(true); // this method removes the default setup of JFrame    
        // we need to close the JFrame to make sure that when the user click X it wont run in background
        //this likely to happen cuz the default JFrame behavior is (HIDE_ON_CLOSE)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //to center the window (frame) we can pass it to null so swing will center it instead of putting it next to a component (c)
        frame.setLocationRelativeTo(null);
        

        //create a JPanel for our customwinow
        JPanel mainPanel = new JPanel (new BorderLayout());

        //inside this mainPanel (the container we created) we will put the design of the window such as the tittle bar
        JPanel TittleBar = new JPanel();

        //we can use decode method to set custom colors using hex color codes
        TittleBar.setBackground(Color.decode("#FF8989")); // set background color of tittle bar
        TittleBar.setPreferredSize(new Dimension (800,40));
        TittleBar.setLayout(new BorderLayout()); // set layout of tittle bar to BorderLayout

        //Then we can label the "TittleBar" we created using a JLabel
        JLabel appName = new JLabel ("Starfish Painter");
        appName.setForeground(Color.YELLOW);

        //Then we can add buttons to our window 
        JButton closeButton = new JButton ("X");
        closeButton.setForeground(Color.BLACK);
        //design for the close button
        closeButton.setBackground(Color.white);
        closeButton.setForeground(Color.BLACK);
        //logic for our close button
        closeButton.addActionListener(e -> frame.dispose() ); //(frame) here is the main JFrame we created 

        //In this section we will place the components we just created using a BorderLayout
        //So far we craeted two components which is a tiitle bar and a close button
        TittleBar.add(appName,BorderLayout.WEST);
        

        //visibility logic
         mainPanel.add(TittleBar, BorderLayout.NORTH); // add the tittle bar to the main panel at the top (NORTH)
         TittleBar.add(closeButton, BorderLayout.EAST);
         TittleBar.add(appName, BorderLayout.WEST);
         frame.setContentPane(mainPanel); //this line is very important so we can see the main panel
         frame.setVisible(true); // this is best to be in last part of the frame so we can make sure other methods will work

    }
    
}
