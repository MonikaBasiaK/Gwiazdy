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
        
    	//moje
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setBounds((int) ((dimension.getWidth() - this.getWidth()) / 2),
        		(int) ((dimension.getHeight() - this.getHeight()) / 2),700, 500);
        //setLocation(0, 0);
        //centreWindow(this);
        setUndecorated(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new GridBagLayout());
        setLayout(new BorderLayout());
        //add(new LoginPanel(), new GridBagConstraints());
        
        add(new HelloPanel());
        setVisible(true);
    }
    
    //robi to samo co setBounds powyzej
    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2)/2;
        frame.setLocation(x, y);
    }
    
    public void changePanel(JPanel panel)
    {
        getContentPane().removeAll();
        //add(panel, new GridBagConstraints());
        add(panel);
        revalidate();
        repaint();
    }

}