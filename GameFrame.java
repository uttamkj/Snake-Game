import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);
        //this.add(new GameFrame());
        this.setTitle("Snake Game By UTTAM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
