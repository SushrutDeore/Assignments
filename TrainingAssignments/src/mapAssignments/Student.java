package mapAssignments;

public class Student {
	public String name;
	public int rollNo;
	
	public Student(String name,int roll)
	{
		this.name=name;
		this.rollNo=roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
