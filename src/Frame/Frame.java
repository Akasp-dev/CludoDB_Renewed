package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Frame extends JFrame {
    int width, height;
    Panel mainPanel, innerPanel;
    public Frame(int width, int height){
        this.width = width;
        this.height = height;
        mainPanel = mainPanel(Color.decode("#2f3640"));
        mainPanel.setLayout(new BorderLayout());
        innerPanel = innerPanel(Color.BLACK);
        innerPanel.setLayout(new BorderLayout());
        innerPanel.setMaximumSize(new Dimension((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(), 100));
        innerPanel.add(new JLabel("Text text text"){
            @Override
            public void setForeground(Color fg) {
                super.setForeground(Color.WHITE);
            }
            @Override
            public void setFont(Font font) {
                super.setFont(new Font("Arial", Font.BOLD, 28));
            }
        });
        mainPanel.add(innerPanel);
        setSize(this.width,this.height);
        setLayout(new BorderLayout());
        add(mainPanel);
        setTitle("CludoDB");
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public Panel mainPanel(Color c){
        return new Panel(c);
    }
    public Panel innerPanel(Color c){
        return new Panel(c);
    }
}
