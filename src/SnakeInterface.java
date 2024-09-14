import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Holt
 * @version 9/14/24
 * this file handles all the GUI elements of the SnakeGame.
 */
public class SnakeInterface extends JFrame {
    //Interface Constants
    public static final int GUI_WIDTH = 1600;
    public static final int GUI_HEIGHT = 900;
    public static final int GAME_WINDOW_WIDTH = 850;
    public static final int GAME_WINDOW_HEIGHT = 850;

    //Interface Components
    JPanel titleBar;
    JPanel gameWindow;
    JPanel interactArea;
    JPanel contextArea;
    JPanel pageBottom;

    public SnakeInterface(){
        //configure GUI to end once closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set size of GUI.
        setSize(GUI_WIDTH, GUI_HEIGHT);

        //hide default title bar
        setUndecorated(true);

        //load to center of screen.
        setLocationRelativeTo(null);

        //set the layout of the application
        setLayout(null);

        //prevent resizing.
        setResizable(false);

        //create GUI components;
        createGuiComponents();
    }

    /**
     * Method to create the components of our GUI.
     */
    private void createGuiComponents() {
        createGameWindow();
    }

    /**
     * Method to make our game window
     */
    private void createGameWindow(){
        gameWindow = new JPanel();
        gameWindow.setSize(GAME_WINDOW_WIDTH, GAME_WINDOW_HEIGHT);
        gameWindow.setLocation( 25, 25);
        gameWindow.setBackground(new java.awt.Color(200, 200, 200));
        add(gameWindow);
    }


}
