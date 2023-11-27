package in.co.Practice;

public class Businessman  implements Richman ,SocialWorker{

	@Override
	public void helptoothers() {
		System.out.println("helptoother");
		
		
	}

	@Override
	public void earnMoney(){
 
		System.out.println("earnMoney");
		
	}

	@Override
	public void donation() {
	System.out.println("party");
		
	}

	@Override
	public void party() {
		System.out.println("donation");
		
	}
	

}
