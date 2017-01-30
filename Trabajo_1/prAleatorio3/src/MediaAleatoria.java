import java.util.Random;
public class MediaAleatoria {
	public static void main(String args[]){
		Random rnd= new Random();
		double sum =0;
		for(int i=0;i<10;i++)
		{
			sum = sum + rnd.nextDouble();
		}
		System.out.println("La media es = " + sum/10);
	}

}
