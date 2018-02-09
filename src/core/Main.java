package core;

import org.json.JSONException;
import gui.Window;

public class Main {

	public static Window w = null;
	
	public static void main(String[] args) throws JSONException, ClassNotFoundException {

		w = new Window();
		Utilities.odczytZPlikuJson("gwiazdy.txt");
	}

}
