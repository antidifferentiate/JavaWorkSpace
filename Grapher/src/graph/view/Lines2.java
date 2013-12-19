package graph.view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Lines2 extends JFrame {

    public Lines2() {

        initUI();
    }
    
    private void initUI() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//makes the code terminate when the window is closed.
        //add(surface) is a method in JFrame that makes it use a JPanel.
        
        add(new Surface());				//add the JPanel into the JFrame.	This is required.
        
        setSize(350, 250);				//set the size of the JFrame		This is required.
        setLocationRelativeTo(null);    //make the thing open in the middle of the screen.
    }

}
