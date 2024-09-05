
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		PurchaseOrder order = new PurchaseOrder("OD1","Sony",1,8000.0);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("output.txt")));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"))) {
					
			out.writeObject(order);
			System.out.println("serializing...");
			System.out.println("done");
			
			System.out.println("deserializing...");
			PurchaseOrder ref = (PurchaseOrder) in.readObject();
			System.out.println(ref.toString());
			
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
