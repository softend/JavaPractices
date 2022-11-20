package Practice_21_22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private ICreateDocument iCreateDocument;

    public Frame(ICreateDocument iCreateDocument){
        super("Editor");
        this.iCreateDocument=iCreateDocument;
        
        render();
    }

    private void render() {
        setSize(500,500);
        setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(exitItem);

        menuBar.add(menu);

        newItem.addActionListener(b->{
            iCreateDocument.createNew();
            System.out.println("Created!");
        });

        openItem.addActionListener(b->{
            iCreateDocument.createOpen();
            System.out.println("Opened!");
        });

        setJMenuBar(menuBar);
    }
}