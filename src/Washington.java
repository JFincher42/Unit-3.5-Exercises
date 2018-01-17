
public class Washington {
	public static void main(String[] args) {
	    String s = "Washington";
	    int x = s.indexOf("s"); 		// x is 2
	    int y = s.indexOf("hing"); 		// y is 3
	    int z = s.indexOf("j"); 		//  z is -1
	    
	    //System.out.println(x+y+z);
	    
//	    s = "pancake";
//	    System.out.println(s.substring(3));
//	    System.out.println(s.substring(3,7));
	    
	    s = "Awake Now!";
	    System.out.println(s.substring(6));
	    System.out.println(s.substring(6,10));
	}
}
