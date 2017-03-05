
public class TestHerencia2 {

	public static void main(String[] args) {
		
		Producto[] pds ={
					new Producto("4/06/2017", 25),
					new ProductoCongelado("15/07/2018",30,22.5),
					new ProductoFresco("14/08/2017", 14, "1/01/2016","ITALIA"),
					new ProductoRefrigerado("28/08/2019", 45,"ABC123")
		};
		
		for(Producto p: pds){
			System.out.println(p);
		}
		

	}

}
