package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import gui.PanelPlaneta;

public class KategoriaPlanetyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<?> combo = (JComboBox<?>)e.getSource();
        PanelPlaneta.wybranaKategoria = (String)combo.getSelectedItem();
      }

}
