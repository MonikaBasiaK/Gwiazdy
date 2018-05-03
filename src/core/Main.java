package core;

import gui.Window;

public class Main {

	public static Window w = null;
	
	public static void main(String[] args) throws Exception {

		w = new Window();
		//Utilities.getInstance().odczytZPlikuJson("gwiazdy.txt");
		//new DatabaseMain();
		SQLiteJDBC.select();
		}

}
