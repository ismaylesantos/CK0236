package defensiveProgramming.aula17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemplosExceções2 {

	public List<String> recuperarTexto (String fileName) throws IOException{
		FileInputStream stream;
		try {
			stream = new FileInputStream(fileName); // pode causar FileNotFoundException			
			stream.close(); // pode causar IOException			
		} catch (FileNotFoundException e) {
			Logger logger = Logger.getAnonymousLogger();
			logger.log(Level.SEVERE, "Arquivo não encontrado");			
			
		} 
		return new ArrayList<String>();
	}
}
