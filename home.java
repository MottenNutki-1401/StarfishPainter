import javax.swing.JFrame;
public class home {

    public static void main (String [] args) {

        JFrame frame = new JFrame("Starfish Painter");


        frame.setSize(800,600); //width x height of frame
        // we need to close the JFrame to make sure that when the user click X it wont run in background
        //this likely to happen cuz the default JFrame behavior is (HIDE_ON_CLOSE)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //to center the window (frame) we can pass it to null so swing will center it instead of putting it next to a component (c)
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); // this is best to be in last part of the frame so we can make sure other methods will work
        
    }
    
}
