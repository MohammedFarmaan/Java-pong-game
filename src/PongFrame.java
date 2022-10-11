import java.awt.*;
import javax.swing.*;

public class PongFrame extends JFrame{

    PongPanel panel;
    PongFrame(){
        panel = new PongPanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
