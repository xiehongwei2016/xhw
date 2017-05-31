package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileStreamTest {

	public static void main(String[] args) {
		
		try {
			byte by[] = {11,21,3,40,5};
			OutputStream os = new FileOutputStream("C:/outfile.txt");
			for(int x=0; x<by.length; x++){
				os.write(by[x]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
