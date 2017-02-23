
public class TestJarras {
	public static void main(String[] args){
		Jarra jarraA = new Jarra();
		jarraA.Jarra(5);
		Jarra jarraB = new Jarra();
		jarraB.Jarra(7);
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		jarraB.llena(); //lleno la jarra B
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		jarraA.llenaDesde(jarraB);
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		jarraA.vacia();
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("\n");
		jarraA.llenaDesde(jarraB);
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		jarraB.llena();
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		jarraA.llenaDesde(jarraB);
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		
		jarraA.vacia();
		jarraA.llenaDesde(jarraB);
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		
		jarraB.llena();
		jarraA.llenaDesde(jarraB);
		
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		
		jarraA.vacia();
		jarraA.llenaDesde(jarraB);
		
		System.out.println("Jarra A  vale => " +jarraA.toString());
		System.out.println("Jarra B  vale => " +jarraB.toString());
		System.out.println("\n");
		
		
	}

}
