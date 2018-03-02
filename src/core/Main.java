package core;

import gui.Window;
import zwyklamateria.obiekty.Planeta;

public class Main {

	public static Window w = null;
	
	public static void main(String[] args) throws Exception {

		w = new Window();
		Utilities.getInstance().odczytZPlikuJson("gwiazdy.txt");
		//new DatabaseMain();
		SQLiteJDBC.select();
		}

}
