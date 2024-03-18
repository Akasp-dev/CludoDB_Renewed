package Frame;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Color c;
    public Panel(Color c){
        this.c = c;
        setBackground(c);
    }
    public void setMaximumSize(Dimension d){
        super.setMaximumSize(d);
    }
    public void setPreferredSize(Dimension d){
        super.setPreferredSize(d);
    }
}
