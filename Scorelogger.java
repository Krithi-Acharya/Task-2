package Task2java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scorelogger {
	String filename;
	
	public Scorelogger(String filename) {
		this.filename=filename;
	}
	public synchronized void writefile(studentDetails s) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true))){
			writer.write(s.toString()+"\n");
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			System.out.println("Error while writing!"+e.getMessage());
		}
	}
}
