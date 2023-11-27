import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContest {

	public static void main(String[] args) {
		
		ArrayList <Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ram","8982730677"));
		list.add(new Contestant("abhi","9685577531"));
		list.add(new Contestant("kank","9752516152"));
		list.add(new Contestant("mahi","9039159909"));
		list.add(new Contestant("uday","9926836695"));
		list.add(new Contestant("anish","4567891237"));
		list.add(new Contestant("bharti","1234567891"));
		list.add(new Contestant("rupali","3456789217"));
		list.add(new Contestant("sakshi","9098765432"));
		
		System.out.println("winners !!");
		
  list.stream().map(e->e.phone).filter(e-> e.length()== 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{
	Collections.shuffle(e);
	return e.stream();
	 
	
})).limit(3).forEach(e->{
				System.out.println(e);
				

});
	}
}
