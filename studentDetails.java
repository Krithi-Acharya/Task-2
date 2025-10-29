package Task2java;

public class studentDetails {
	String name;
	int rollnum;
	int marks;
	
	public studentDetails(String name,int rollnum,int marks) {
		this.name=name;
		this.rollnum=rollnum;
		this.marks=marks;
	}
	public String toString() {
		return name + ","+ rollnum + ","+marks;
	}
}
