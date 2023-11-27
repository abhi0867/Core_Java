import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.rays.io.Person;

public class TestWriteExternalizable {
public static void main(String[] args)throws Exception {
	
	Person p = new Person();
	p.id = 1;
	p.name=null;
	p.address="indore";
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\IO\\Object.txt");
	
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	out.writeObject(p);
	
	out.close();
	file.close();
	
	System.out.println("Object write successfully...!!!");
	
	
	
	
}
}
