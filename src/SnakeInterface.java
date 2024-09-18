import javax.swing.*;
import java.awt.*;

/**
 * @author Zachary Holt
 * @version 9/14/24
 * this file handles all the GUI elements of the SnakeGame.
 */
public class SnakeInterface extends JFrame {
    //Interface Constants
    //GUI
    private static final int GUI_WIDTH = 1200;
    private static final int GUI_HEIGHT = 900;
    //GAME WINDOW
    private static final int GAME_WINDOW_WIDTH = 800;
    private static final int GAME_WINDOW_HEIGHT = 800;
    private static final int GAME_WINDOW_LOCATION_X = 43;
    private static final int GAME_WINDOW_LOCATION_Y = 66;
    //TITLE BAR
    private static final int TITLE_BAR_HEIGHT = 26;

    //Interface Components
    JPanel titleBar;
    JPanel gameWindow;

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
        createTitleBar();
        createGameWindow();
    }

    /**
     * Method to make our game window
     */
    private void createGameWindow(){
        gameWindow = new JPanel();
        gameWindow.setSize(GAME_WINDOW_WIDTH, GAME_WINDOW_HEIGHT);
        gameWindow.setLocation(GAME_WINDOW_LOCATION_X, GAME_WINDOW_LOCATION_Y);
        gameWindow.setBackground(new java.awt.Color(200, 200, 200));
        add(gameWindow);
    }

    /**
     * Method to make the title bar.
     */
    private void createTitleBar(){
        //Create titleBard
        titleBar = new JPanel();
        titleBar.setSize(GUI_WIDTH, TITLE_BAR_HEIGHT);
        titleBar.setLocation(0, 0);
        titleBar.setLayout(new BorderLayout());
        titleBar.setBackground(new java.awt.Color(200, 200, 200));

        //Add the title
        JLabel title = new JLabel();
        title.setText("     SnakeProject.java");
        title.setFont(new Font("Serif", Font.BOLD, 16));
        title.setLocation(GAME_WINDOW_LOCATION_X, 13);
        title.setVisible(true);
        titleBar.add(title, BorderLayout.LINE_START);

        //Add the fully rendered title bar.
        add(titleBar);
    }


}
