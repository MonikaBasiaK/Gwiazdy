package core;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.google.gson.Gson;
import gui.listeners.ButtonExitActionListener;
import gui.listeners.ButtonGoToHelloPanelActionListener;


public class Utilities {

    public Gson gson = new Gson();
    public JButton exit = new JButton("EXIT");
    public JButton back = new JButton("<| BACK");
    public JButton zapisz = new JButton("ZAPISZ");
    public Font f = new Font("SansSerif", Font.BOLD, 20);
    public Font i = new Font("Impact", Font.BOLD, 20);
    public Font g = new Font("Gabriola", Font.BOLD, 20);
    public String daneZPliku = new String("");
    public int x;
    public Connection dbConnection = null;

    private Utilities() {
        x = centre() / 4;
        exit.addActionListener(new ButtonExitActionListener());
        back.addActionListener(new ButtonGoToHelloPanelActionListener());
        dbConnection = SQLiteJDBC.connect();
    }

    private static class UtilitiesHandler {
        private final static Utilities instance = new Utilities();
    }

    public static Utilities getInstance() {
        return UtilitiesHandler.instance;
    }

    //---------------------------------------------------
    //Background
    public JLabel panelImgLab;
    public ImageIcon panelImage;

    public void setBackgroud(String s) {
        panelImage = new ImageIcon(s);
        panelImgLab = new JLabel();
        panelImgLab.setBounds(0, 0, panelImage.getIconWidth(), panelImage.getIconHeight());
        panelImgLab.setIcon(panelImage);
    }
    //---------------------------------------------------

    public static int centre() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth());
        dimension.getHeight();
        return x;
    }

    public void shutDown() {
        try {
            this.dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


