package ru.mirea.ikbo20.pr4;
// Была идея о добавлении кнопки обнуления счета,
// но не стал добавлять в силу простоты решения
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ScoreWindow extends JFrame {
    JPanel[] pnl = new JPanel[3];

    JButton btnRM = new JButton("Real Madrid");
    JButton btnACM = new JButton("Real Madrid");

    JLabel txtResult = new JLabel("Result: 0 X 0");
    JLabel txtLastScorer = new JLabel("Last Scorer: ");
    JLabel txtWinner = new JLabel("Winner: DRAW");

    int scoreMilan, scoreMadrid = 0;

    private void scoreChecker() {
        if (scoreMadrid > scoreMilan)
            txtWinner.setText("Winner: Real Madrid");
        else if (scoreMadrid < scoreMilan)
            txtWinner.setText("Winner: AC Milan");
        else
            txtWinner.setText("Winner: Draw");
    }

    ScoreWindow() {
        // Приятная мелочь
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1,3));
        setSize(500, 120);

        pnl[0] = new JPanel();
        pnl[1] = new JPanel();
        pnl[2] = new JPanel();

        // Все же интересно, возможно ли ставить на фон
        // орнаменты вроде двух цветов в полоску R B R B R B
        pnl[0].setBackground(new Color(0, 0, 255));
        pnl[2].setBackground(new Color(255, 0, 0));
        pnl[1].setLayout(new GridLayout(3, 1));

        add(pnl[0]); add(pnl[1]); add(pnl[2]);

        pnl[0].add(btnRM);
        pnl[1].add(txtResult);
        pnl[1].add(txtLastScorer);
        pnl[1].add(txtWinner);
        pnl[2].add(btnACM);

        // Изначально я весь функционал трекера мыши дал
        // панелькам, а не кнопкам, так что можно было
        // нажимать на большие цветные части окна, но
        // потом вернулся к постановке задачи
        btnRM.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                ++scoreMadrid;
                txtResult.setText("Result: " + scoreMadrid + " X " + scoreMilan);
                txtLastScorer.setText("Last Scorer: Real Madrid");
                scoreChecker();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        btnACM.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                ++scoreMilan;
                txtResult.setText("Result: " + scoreMadrid + " X " + scoreMilan);
                txtLastScorer.setText("Last Scorer: AC Milan");
                scoreChecker();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }

    public static void main(String[] args) {
        new ScoreWindow().setVisible(true);
    }
}
