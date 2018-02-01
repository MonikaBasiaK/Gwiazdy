package gui;

import core.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel {
    private JLabel helloLabel = new JLabel("Second Panel");
    private Font f = new Font("SansSerif", Font.BOLD, 30);
    private JButton back = new JButton("BACK");
   
    public Panel2() {
        setLayout(new FlowLayout());
        setBackground(Color.white);

        this.helloLabel.setFont(f);
        this.back.setFont(f);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.w.changePanel(new HelloPanel());
            }
        });


        add(this.helloLabel);
        add(this.back);
    }
}
