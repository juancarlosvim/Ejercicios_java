import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Almacenamiento {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs = new FileOutputStream("datos.obj");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(new Persona("paco", 40));
		os.close();
			
			

	}

}
