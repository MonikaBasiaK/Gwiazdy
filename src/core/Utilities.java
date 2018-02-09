package core;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.google.gson.Gson;

import zwyklamateria.obiekty.Gwiazda;
import zwyklamateria.obiekty.Kometa;
import zwyklamateria.obiekty.Meteoroid;
import zwyklamateria.obiekty.Obiekt;
import zwyklamateria.obiekty.Planeta;
import zwyklamateria.obiekty.PlanetaKarlowata;
import zwyklamateria.obiekty.Planetoida;
import zwyklamateria.obiekty.Satelita;
import zwyklamateria.struktury.Galaktyka;
import zwyklamateria.struktury.Gromada;
import zwyklamateria.struktury.Grupa;
import zwyklamateria.struktury.Gwiazdozbior;
import zwyklamateria.struktury.Struktura;
import zwyklamateria.struktury.SuperGromada;


public class Utilities {
	
	public static Gson gson = new Gson();
    public static JButton exit = new JButton("EXIT");
	public static JButton back = new JButton("<| BACK");
    public static JButton zapisz = new JButton("ZAPISZ");
	public static Font f = new Font("SansSerif", Font.BOLD, 20);
    public static Font i = new Font("Impact", Font.BOLD, 20);
    public static Font g = new Font("Gabriola", Font.BOLD, 20);
    public static String daneZPliku = new String("");
    public static int x;
	
        
	public Utilities()
	{
		x = centre()/4;;
	}
	
	
public static void odczytZPlikuJson(String file) throws ClassNotFoundException{
		
		int gdzieStart, gdzieEnd; 
		String typ;
		FileReader fr = null;
		String liniaJson = "";
		
		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader(file);
		   } catch (FileNotFoundException e) {
		       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   Obiekt Obj;
		   Struktura Struct;
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((liniaJson = bfr.readLine()) != null){
		    	 
		    	 daneZPliku += liniaJson+"\n";
		    	 
		    	  //1. odnajduje w linii jaka to kategoria(obiekt, struktura..?)
		    	 gdzieStart= liniaJson.indexOf("identity\":\"") + "identity\":\"".length();
		    	 gdzieEnd = liniaJson.indexOf(",", gdzieStart) - ",".length();
		    	 typ = liniaJson.substring(gdzieStart, gdzieEnd);
		    	 
		    	 if(typ.equals(Obiekt.GWIAZDA)){
		    		 Obj = gson.fromJson(liniaJson, Gwiazda.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.KOMETA)){
		    		 Obj = gson.fromJson(liniaJson, Kometa.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.METEOROID)){
		    		 Obj = gson.fromJson(liniaJson, Meteoroid.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.PLANETA)){
		    		 Obj = gson.fromJson(liniaJson, Planeta.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.PLANETA_KARLOWATA)){
		    		 Obj = gson.fromJson(liniaJson, PlanetaKarlowata.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.PLANETOIDA)){
		    		 Obj = gson.fromJson(liniaJson, Planetoida.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	 else if(typ.equals(Obiekt.SATELITA)){
		    		 Obj = gson.fromJson(liniaJson, Satelita.class);
		    		 Listy.obiekty.add(Obj);
		    	 	 } 
		    	
		    	else if(typ.equals(Struktura.GWIAZDOZBIOR)){
		    		 Struct = gson.fromJson(liniaJson, Gwiazdozbior.class);
		    		 Listy.struktury.add(Struct);
		    	 }
		    	else if(typ.equals(Struktura.GALAKTYKA)){
		    		 Struct = gson.fromJson(liniaJson, Galaktyka.class);
		    		 Listy.struktury.add(Struct);
		    	 }
		    	else if(typ.equals(Struktura.GRUPA)){
		    		 Struct = gson.fromJson(liniaJson, Grupa.class);
		    		 Listy.struktury.add(Struct);
		    	 }
		    	else if(typ.equals(Struktura.GROMADA)){
		    		 Struct = gson.fromJson(liniaJson, Gromada.class);
		    		 Listy.struktury.add(Struct);
		    	 }
		    	else if(typ.equals(Struktura.SUPERGROMADA)){
		    		 Struct = gson.fromJson(liniaJson, SuperGromada.class);
		    		 Listy.struktury.add(Struct);
		    	 }
		     }
		    } catch (IOException e) {
		        System.out.println("B£¥D ODCZYTU Z PLIKU!");
		        System.exit(2);
		   }

		   // ZAMYKANIE PLIKU
		   try {
		     fr.close();
		    } catch (IOException e) {
		         System.out.println("B£¥D PRZY ZAMYKANIU PLIKU!");
		         System.exit(3);
		        }
}

public static void zapisDoPlikuJson(String gdzieZapisac){
	FileWriter fw = null;
    try {
       fw = new FileWriter(gdzieZapisac);
          } catch (IOException e) { 
        e.printStackTrace();
     }
 
   BufferedWriter bw = new BufferedWriter(fw);
   String json;
   try {
	   for(Obiekt o: Listy.obiekty){
		   json = gson.toJson(o); 
		   bw.write(json);
		   bw.newLine();
	   }
	   for(Struktura s: Listy.struktury){
		   json = gson.toJson(s);
		   bw.write(json);
	       bw.newLine();
	   }
       
     } catch (IOException e) {
        e.printStackTrace();
     }

     try {
        bw.close();
        fw.close();
     } catch (IOException e) {
           e.printStackTrace();
     }
}
	
	//---------------------------------------------------
	//Background
    public static JLabel panelImgLab;
    public static ImageIcon panelImage;
    
    public static void setBackgroud(String s)
    {
	    	panelImage= new ImageIcon(s);
	        panelImgLab= new JLabel();
	        panelImgLab.setBounds(0, 0,panelImage.getIconWidth(),panelImage.getIconHeight());
	        panelImgLab.setIcon(panelImage);       
	}
    //---------------------------------------------------
	    
	public static int centre() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)(dimension.getWidth());
        dimension.getHeight();
        return x;
    	}
	}


