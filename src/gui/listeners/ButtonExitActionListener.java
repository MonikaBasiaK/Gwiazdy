package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import core.SQLiteJDBC;
import core.Utilities;

public class ButtonExitActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
     	Utilities.getInstance().zapisDoPlikuJson("gwiazdy.txt");
		try {
			Utilities.getInstance().dbConnection.close();
		} catch (SQLException e1) {
			System.out.println("Program mi się wywalił maksymalnie");
		}
		System.exit(0);
	}

}
