package in.co.Practice;

import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws Exception{
		
		String str ="11/11/2023";
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Person p = new Person();
		
		p.setId(10);
		p.setName("abhi");
		
		p.setDob(sdf.parse(str));
		
		System.out.println(p.getid());
		System.out.println(p.getName());
		
		
		System.out.println(sdf.format(p.getDob()));
		
	}


}
