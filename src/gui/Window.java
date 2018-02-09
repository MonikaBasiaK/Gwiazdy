package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    
    public Window()
    {
    	super("Gwiazdy");
    	
    	setSize(700, 500);
        setResizable(false);
        setBounds((int) ((dimension.getWidth() - this.getWidth()) / 2), (int) ((dimension.getHeight() - this.getHeight()) / 2),700, 500);
        setUndecorated(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        add(new HelloPanel());
        setVisible(true);
    }
    
    public void changePanel(JPanel panel)
    {
        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }

}