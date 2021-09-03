package debugAssignments;

public class mainCounter {

	public static void main(String[] args) {
		System.out.println("Hello Debugging.....");
		counter counterObj = new counter();
		counterObj.count();
		System.out.println("We have counted " + counterObj.getResult());
	}
	
}
