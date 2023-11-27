package in.co.Thread;

public class TestRacing {

public static void main(String[] args) {
	
	Racing t1 = new Racing ("abhi");
	
	Racing t2 = new Racing ("parmar");
	
	t1.start();
	t2.start();
	
	
	

}
}
