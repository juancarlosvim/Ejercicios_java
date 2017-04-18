import java.io.*;
public class CopiaFichero {

	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Debe usarse: java "+ " CopiarFichero <origen> <destino> ");
		}else{
			try{
				FileReader fle = new FileReader(args[0]);
				BufferedReader br = new BufferedReader(fle);
				FileWriter flw = new FileWriter(args[1]);
				BufferedWriter bw = new BufferedWriter(flw);
				String texto =" ";
				while(texto != null){
					texto = br.readLine();
					if(texto !=null){
						bw.write(texto);
						bw.newLine();
					}
				}
				System.out.println("Creado "+args[1]);
				br.close();
				bw.close();
				
			}catch (IOException e) {
				System.out.println("Error en la lecutra " + " o escritura de ficheros");
			}
		}
	}

}
