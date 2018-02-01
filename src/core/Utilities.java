package core;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import javax.swing.ImageIcon;
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
	/*
	public static ArrayList<Obiekt> obiekty = new ArrayList<>();
	public static ArrayList<Struktura> struktury = new ArrayList<>();
	public static ArrayList<Obiekt> obiektyTest = new ArrayList<>();
	*/
	public static Gson gson = new Gson();
    
	public static void writeToFile(String file) {
	      ObjectOutputStream outStream = null;
	      try {
	         outStream = new ObjectOutputStream(new FileOutputStream(file, true));
	         if (file.equals("obiekty.txt"))
	         {
		         for (Obiekt p : Gwiazdy.obiekty) {
		            outStream.writeObject(p);
		         }
	         }
	         else if (file.equals("struktury.txt"))
	         {
		         for (Struktura p : Gwiazdy.struktury) {
		            outStream.writeObject(p);
		         }
	         }
	         
	      } catch (IOException ioException) {
	         System.err.println("Error opening file.");
	      } catch (NoSuchElementException noSuchElementException) {
	         System.err.println("Invalid input.");
	      } finally {
	         try {
	            if (outStream != null)
	               outStream.close();
	         } catch (IOException ioException) {
	            System.err.println("Error closing file.");
	         }
	      }
	   }
	
	public static void readFromFile(String file) {
		 ObjectInputStream inputStream = null;
	      try {
	         inputStream = new ObjectInputStream(new FileInputStream(file));
	         if (file.equals("obiekty.txt"))
	         {
			     while (true) 
			     {
			    	 Obiekt p = (Obiekt) inputStream.readObject();
			         //obiekty.add(p);
			         //TEST
			         Gwiazdy.obiektyTest.add(p);
			     }
		     }
	         else if (file.equals("struktury.txt")){
	        	 while (true) 
		         {
		        	 Struktura p = (Struktura) inputStream.readObject();
		        	 Gwiazdy.struktury.add(p);
			     }
	         }
	      } catch (EOFException eofException) {
	         return;
	      } catch (ClassNotFoundException classNotFoundException) {
	         System.err.println("Object creation failed.");
	      } catch (IOException ioException) {
	         System.err.println("Error opening file.");
	      } finally {
	         try {
	            if (inputStream != null)
	               inputStream.close();
	         } catch (IOException ioException) {
	            System.err.println("Error closing file.");
	         }
	      }
		//return obiekty;
	   }
	
	
	public static void zapisDoPliku(String gdzieZapisac){
		FileWriter fw = null;
	    try {
	       fw = new FileWriter(gdzieZapisac, true);
	          } catch (IOException e) { 
	        e.printStackTrace();
	     }
	 
	   BufferedWriter bw = new BufferedWriter(fw);
	   try {
		   //TEST
		   for(Obiekt o: Gwiazdy.obiektyTest){
		   //for(Obiekt o: Gwiazdy.obiekty){			   
		   bw.write(o.getClass().getName()+" "+ o.showDane());
	       bw.newLine();
		   }
		   for(Struktura s: Gwiazdy.struktury){
			   bw.write(s.getClass().getName()+" "+ s.showDane());
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
	
	/*public static void zapisDoPliku(String linia){  
		
		InputStream istream;
		OutputStream ostream=null;
		int c;
		istream = System.in;
		File outFile =  new File("Data.txt");		 
		System.out.println("Type characters to write in File – Press Ctrl+z to end ");
		try {
			ostream = new FileOutputStream(outFile);
			while ((c = istream.read()) != EOF)
				ostream.write(c);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				istream.close();
				ostream.close();
			} catch (IOException e) {
				System.out.println("File did not close");
			}
		} */
		
		/*
		try {
			FileOutputStream fileOut = new FileOutputStream("myfile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obiekty);
			out.close();
			fileOut.close();
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		/*
		FileWriter fw = null;
		    try {
		       fw = new FileWriter("gwiazdy.txt", true);
		          } catch (IOException e) { 
		        e.printStackTrace();
		     }
		 
		   BufferedWriter bw = new BufferedWriter(fw);
		   try {
			   bw.write(linia);
		       bw.newLine();
		       
		     } catch (IOException e) {
		        e.printStackTrace();
		     }

		     try {
		        bw.close();
		        fw.close();
		     } catch (IOException e) {
		           e.printStackTrace();
		     }
	}*/
	
	public static String daneZPliku = new String("");
	
	public static void odczytZPliku(String file) throws ClassNotFoundException{
		
		int gdzieStart, gdzieEnd; 
		int rozmiar = 0;
		String roar, typ, object;
		FileReader fr = null;
		   String linia = "";

		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader(file);
		   } catch (FileNotFoundException e) {
		       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((linia = bfr.readLine()) != null){
		    	 //1. odnajduje w linii jaka to klasa(obiekt, struktura..?)
		    	 gdzieStart= linia.indexOf(".");
		    	 gdzieEnd = linia.indexOf(".", gdzieStart+1);
		    	 typ = linia.substring(gdzieStart+1, gdzieEnd);
		 
		    	 if(typ.equals(Obiekt.OBIEKT)) rozmiar = Obiekt.ROZMIAR;
		    	 else if(typ.equals(Struktura.STRUKTURA)) rozmiar = Struktura.ROZMIAR;
		    	 String[] tempObj= new String[rozmiar];
		 		
		    	 //2. odnajduje w linii inf o tym jaki to typ klasy(Gwiazda, Grupa.. itd?)
		    	 gdzieStart = gdzieEnd+1;
		    	 gdzieEnd= linia.indexOf(" ");
		    	 object = linia.substring(gdzieStart, gdzieEnd);
		    	 
		    	 //3. wyszukuje w linii kolejne dane obiektu(nazwa, masa itd) i dodaje je do tablicy danych tymczasowych
		    	 	 for(int i = 0; i<tempObj.length; i++){
			    	 gdzieStart= linia.indexOf(":");
			    	 gdzieEnd= linia.indexOf(",");
			    	 tempObj[i] = linia.substring(gdzieStart+1, gdzieEnd);
			    	 linia = linia.substring(gdzieEnd+1);
			        }
		    	 	 
		    	 //4. Maj¹c powy¿sze dane tworze nowy obiekt i dodaje go do odpowiedniej listy
		    	 
		    	 if(typ.equals(Obiekt.OBIEKT)){
		    		 Obiekt Obj = null;
		    	 	 if(object.equals(Obiekt.GWIAZDA))  Obj = new Gwiazda();
			    	 else if(object.equals(Obiekt.KOMETA)) Obj = new Kometa();
		    		 else if(object.equals(Obiekt.METEOROID)) Obj = new Meteoroid();
		    		 else if(object.equals(Obiekt.PLANETA)) Obj = new Planeta();
			    	 else if(object.equals(Obiekt.PLANETA_KARLOWATA)) Obj = new PlanetaKarlowata();
		    		 else if(object.equals(Obiekt.PLANETOIDA)) Obj = new Planetoida();
		    		 else if(object.equals(Obiekt.SATELITA)) Obj = new Satelita();
		    		 
		    	 	 Obj.setName(tempObj[Obiekt.NAZWA]);
	    			 Obj.setMasa(Float.parseFloat(tempObj[Obiekt.MASA]));
	    			 Obj.setSrednica(Double.parseDouble(tempObj[Obiekt.SREDNICA]));
	    			 Obj.setWiek(Integer.parseInt(tempObj[Obiekt.WIEK]));
	    			 Obj.setOGlowny(tempObj[Obiekt.OBIEKT_GLOWNY]);
	    			 Obj.setOObiegu(Float.parseFloat(tempObj[Obiekt.OKRES_OBIEGU]));
	    			 
	    			 Gwiazdy.obiekty.add(Obj);
		    	 	 } 
		    	 
		    	 else if(typ.equals(Struktura.STRUKTURA)){
		    		 Struktura Struct = null;
		    		 if(object.equals(Struktura.GWIAZDOZBIOR)) 
		    		 {
		    			 Struct = new Gwiazdozbior();
		    		 }
			    	 else if(object.equals(Struktura.GALAKTYKA)) 
		    		 {
			    		 Struct = new Galaktyka();
		    		 }
			    	 else if(object.equals(Struktura.GRUPA)) 
		    		 {
			    		 Struct = new Grupa();
		    		 }
			    	 else if(object.equals(Struktura.GROMADA)) 
		    		 {
			    		 Struct = new Gromada();
		    		 }
			    	 else if(object.equals(Struktura.SUPERGROMADA)) 
		    		 {
			    		 Struct = new SuperGromada();
		    		 }
		    		 Struct.setName(tempObj[Struktura.NAZWA]);
		    		 Gwiazdy.struktury.add(Struct);
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
		/*
		ArrayList<String> arraylist= new ArrayList<String>();
		try {
			FileInputStream fileIn = new FileInputStream("myfile.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			System.out.println("Deserialized Data: \n" + in.readObject().toString());
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 */
		/* FileReader fr = null;
		   String linia = "";

		   // OTWIERANIE PLIKU:
		   try {
		     fr = new FileReader("gwiazdy.txt");
		   } catch (FileNotFoundException e) {
		       System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
		       System.exit(1);
		   }

		   BufferedReader bfr = new BufferedReader(fr);
		   // ODCZYT KOLEJNYCH LINII Z PLIKU:
		   try {
		     while((linia = bfr.readLine()) != null){
		        System.out.println(linia);
		        daneZPliku += linia+"\n";
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
		   return daneZPliku;
		   */
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
        int y = (int) (dimension.getHeight());
        return x;
    }
	}
