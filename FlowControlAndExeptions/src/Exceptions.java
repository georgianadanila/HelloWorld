import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * 
 * @author Georgiana Danila
 *
 */
public class Exceptions {
	static int SIZE = 10;
	private static final Logger LOGGER = Logger.getLogger(Exceptions.class.getName());
	
	
	public void writeList() {
		PrintWriter out = null;
		Vector vector = new Vector(10);
		
		for (int i=0; i<SIZE; i++)
			vector.add(i);
		
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i=0; i<SIZE; i++)
				out.println("Value at: "+i+"= "+vector.elementAt(i));
		} catch (ArrayIndexOutOfBoundsException | IOException e) {
			LOGGER.info(e.getMessage());
		} finally {
			if (out != null) 
				out.close();
		}
		
	}
}
