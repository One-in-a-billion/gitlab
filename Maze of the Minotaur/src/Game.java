import javax.swing.*;

public class Game {
    private JFrame window;

    public Game() {
        window = new JFrame("");
        window.setSize(360, 500);
        window.add(new Panel());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Game();
            }
        });
    }
}