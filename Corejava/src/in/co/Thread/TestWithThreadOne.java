package in.co.Thread;

public class TestWithThreadOne {
	public static void main(String[] args) {
		WithThreadOne t1 = new WithThreadOne("parents");
		
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 1; i <= 10; i++) {
			
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"main");
			
			
		}
	}

}
