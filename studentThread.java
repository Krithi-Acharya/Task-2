package Task2java;

public class studentThread extends Thread {
	studentDetails student;
	Scorelogger logger;
	
	public studentThread(studentDetails student,Scorelogger logger) {
		this.student=student;
		this.logger=logger;
	}
	public void run() {
		logger.writefile(student);
		System.out.println(student.name+" has submitted marks.");
	}
}
