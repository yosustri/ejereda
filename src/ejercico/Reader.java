package ejercico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
	
public class Reader {

		//#######################################################
		//Atributos
		//#######################################################
		private String archivoEn;		//Indica la ruta donde esta el archvio de texto

		//#######################################################
		//Constructor
		//#######################################################
		public	Reader(){
			setArchivoEn();				//Se establece la ubicacion del archvio de texto
		}
		
		//#######################################################
		//Leer palabras
		//#######################################################
		public ArrayList<String> leerArchivo(){
			ArrayList<String> palabras = new ArrayList<String>();
			
			File archivoen = null;
			FileReader fr = null;
			BufferedReader br = null;
			
			try{
				archivoen = new File(getArchivoEn());
				fr = new FileReader(archivoen);
				br = new BufferedReader(fr);
				String fila;
				while((fila=br.readLine())!=null){
					this.leerLineaDeArchivo(palabras, fila);
				}
			 }catch(Exception e){
				e.printStackTrace();
			 }finally{
				try{
						fr.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			 }
			
			return palabras;
	 
		}
		
		private void leerLineaDeArchivo(ArrayList<String> pPalabras, String pLinea){
			StringTokenizer tokens=new StringTokenizer(pLinea, ";");
		        while(tokens.hasMoreTokens()){
		            String str=tokens.nextToken();
		            str.trim();
		        }
		}
		
		//#######################################################
		//Ruta del fichero Get and Set
		//#######################################################
		public void setArchivoEn(){
			JFileChooser hh = new JFileChooser();
			hh.showOpenDialog(hh);
			this.archivoEn = hh.getSelectedFile().getAbsolutePath().toString();
		}
		
		private String getArchivoEn(){
			return this.archivoEn;
		}
		
}


