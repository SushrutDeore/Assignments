package debugAssignments;

public class counter {
	
	private int result = 0;

	  public int getResult() {
	    return result;
	  }

	  public void count() {
	    for (int i = 0; i < 5; i++) {
	      result += i + 1;
	    } 	   
	  }

}
