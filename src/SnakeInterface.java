import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Holt
 * @version 9/14/24
 * this file handles all the GUI elements of the SnakeGame.
 */
public class SnakeInterface extends JFrame {
    //Interface Constants
    public static final int GUI_WIDTH = 1920;
    public static final int GUI_HEIGHT = 1080;

    public SnakeInterface(){
        //configure GUI to end once closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set size of GUI.
        setSize(GUI_WIDTH, GUI_HEIGHT);

        //load to center of screen.
        setLocationRelativeTo(null);

        //set the layout of the application
        setLayout(new BorderLayout());

        //prevent resizing.
        setResizable(false);
    }
}
