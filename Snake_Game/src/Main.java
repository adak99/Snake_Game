import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHight = boardWidth;


        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}