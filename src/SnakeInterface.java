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
    public static final int SIDE_PANE_WIDTH = 560;
    public static final int HORIZONTAL_PANE_HEIGHT = 140;
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

        //load to center of screen.
        setLocationRelativeTo(null);

        //set the layout of the application
        setLayout(new BorderLayout());

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
        createInteractArea();
        createContextArea();
        createPageBottom();
    }

    /**
     * Method to instantiate the title bar of the interface.
     */
    private void createTitleBar() {
        titleBar = new JPanel();
        titleBar.setLayout(new FlowLayout());
        titleBar.setPreferredSize(new Dimension(GUI_WIDTH, HORIZONTAL_PANE_HEIGHT));
        titleBar.setBackground(new java.awt.Color(255, 0, 0));
        add(titleBar, BorderLayout.PAGE_START);
    }

    /**
     * Method to instantiate the game window.
     */
    private void createGameWindow(){
        gameWindow = new JPanel();
        gameWindow.setBackground(new java.awt.Color(0, 255, 0));
        add(gameWindow, BorderLayout.CENTER);
    }

    /**
     * Method to instantiate the interact area where our control buttons will be.
     */
    private void createInteractArea(){
        interactArea = new JPanel();
        interactArea.setLayout(new BoxLayout(interactArea, BoxLayout.PAGE_AXIS));
        interactArea.setBackground(new java.awt.Color(0, 0, 255));
        interactArea.setPreferredSize(new Dimension(SIDE_PANE_WIDTH, GUI_HEIGHT));
        add(interactArea, BorderLayout.LINE_START);
    }

    /**
     * method to instantiate the contextArea.
     */
    private void createContextArea(){
        contextArea = new JPanel();
        contextArea.setLayout(new BoxLayout(contextArea, BoxLayout.PAGE_AXIS));
        contextArea.setBackground(new java.awt.Color(255, 0, 255));
        contextArea.setPreferredSize(new Dimension(SIDE_PANE_WIDTH, GUI_HEIGHT));
        add(contextArea, BorderLayout.LINE_END);
    }

    /**
     * method to instantiate the bottom of the gui.
     */
    private void createPageBottom(){
        pageBottom = new JPanel();
        pageBottom.setLayout(new FlowLayout());
        pageBottom.setBackground(new java.awt.Color(0, 255, 255));
        pageBottom.setPreferredSize(new Dimension(GUI_WIDTH, HORIZONTAL_PANE_HEIGHT));
        add(pageBottom, BorderLayout.PAGE_END);
    }
}
