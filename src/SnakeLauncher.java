import javax.swing.*;

/**
 * @author Zachary Holt
 * @version 9/14/24
 * This class handles the launching of the application.
 */
public class SnakeLauncher {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                //display GUI
                new SnakeInterface().setVisible(true);
            }
        });
    }

}
