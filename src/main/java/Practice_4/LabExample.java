package Practice_4;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class LabExample extends JFrame {
    private int milanSc=0;
    private int realSc=0;
    private JButton milanBut = new JButton("AC Milan");
    private JButton madridBut = new JButton("Real Madrid");
    private JLabel res = new JLabel("Result: 0 X 0");
    private JLabel last = new JLabel("Last Scorer: N/A");
    private JLabel win = new JLabel("Winner: DRAW");
    private JLabel text= new JLabel(" ");

    public LabExample(){
        super("Example");
        this.setBounds(400,100, 550, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,4,2,2));

        container.add(res);
        container.add(last);
        container.add(win);
        container.add(text);
        container.add(text);
        container.add(text);
        container.add(madridBut);
        container.add(milanBut);

        milanBut.addActionListener(e -> {
            last.setText("Last Scorer: AC Milan");
            milanSc++;
            res.setText("Result: "+realSc+ " X "+milanSc);
            setWinner();
        });

        madridBut.addActionListener(e -> {
            last.setText("Last Scorer: Real Madrid");
            realSc++;
            res.setText("Result: "+realSc+ " X "+milanSc);
            setWinner();
        });

        setVisible(true);
    }

    private void setWinner() {
        if(realSc>milanSc){
            win.setText("Winner: Real");
        }else if (realSc==milanSc){
            win.setText("Winner: Draw");
        }else{
            win.setText("Winner: AC Milan");
        }
    }

    public static void main(String[] args) {
        new LabExample();
    }
}

