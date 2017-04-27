import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Recuperacion {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs = new FileInputStream("datos.obj");
		ObjectInputStream os = new ObjectInputStream(fs);
		
		Persona p = (Persona) os.readObject();
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		os.close();

	}

}
