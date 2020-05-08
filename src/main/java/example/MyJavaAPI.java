package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * Small example Java API. In reality what I need to call is a much bigger thing.
 *
 */
public class MyJavaAPI {
	
	public void doit(Reader in, Writer out) {
		BufferedReader br = new BufferedReader(in);
		String line = "";
		try {
			line = br.readLine();
			out.write(line.trim() + "," + "myValue\n");
			line = br.readLine();
			while ( line != null ) {
				out.write( line.trim() + "," + line.split(",")[0].length() + "\n" );
				line = br.readLine();
			} 
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
