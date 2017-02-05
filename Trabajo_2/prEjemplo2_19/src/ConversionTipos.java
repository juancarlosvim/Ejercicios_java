
public class ConversionTipos {

	public static void main(String[] args) {
		int x = 3;
		double y =5.0;
		float z;
		
		z = (float)(200 * y + x);
		System.out.println("\n El valor de float es => " +z);
		System.out.println("\n El valor de double es => " + (double)z);
		System.out.println("\n El valor de integer es => " + (int)z);
		System.out.println("\n El valor de bytes es => " + (byte)z);

	}

}
