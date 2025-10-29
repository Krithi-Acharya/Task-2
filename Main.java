package Task2java;

public class Main {
	public static void main(String[] args) {
		Scorelogger logger = new Scorelogger("finalScores.csv");
		studentDetails s1 = new studentDetails("Krithi",11,92);
		studentDetails s2 = new studentDetails ("Ritika",12,85);
		
		studentThread t1 = new studentThread(s1,logger);
		studentThread t2 = new studentThread(s2,logger);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Students have submitted their marks successfully!");
	}
}
