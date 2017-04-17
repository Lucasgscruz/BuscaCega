import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Leitura {
	public static void leitura(String dir,ArrayList<Vertice> grafo){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Lendo o arquivo...");
		try{
			Scanner lerArq = new Scanner(new FileReader(dir));
			
			//Logica de leitura do arquivo abaixo
			
			//Le quantidade de vertices e arestas para fazer o loop
			int numVertices = lerArq.nextInt();
			int numArestas = lerArq.nextInt();
			lerArq.nextLine();
			//Termino
			
			//Inicio da leitura de vertices
			
			for(int i = 0; i < numVertices; i++){
				grafo.add(new Vertice(lerArq.nextInt(),lerArq.nextInt(),
						lerArq.nextInt(),lerArq.nextInt(),lerArq.nextInt(),lerArq.nextInt()));
				
			}
			//Fim leitura de vertices
			
			//Inicio leitura de arestas
			int vert,vert1;
			for (int i = 0; i < numArestas; i++) {
				if(lerArq.hasNextInt()){
					vert = lerArq.nextInt();
					vert1 = lerArq.nextInt();
					grafo.get(vert-1).addVizinhos(grafo.get(vert1-1));
				}
			}
			//Fim leitura de arestas

			//Fim da logica de leitura do arquivo
		}catch (IOException e){
			System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage() );
		}
		
		System.out.println("Arquivo lido com sucesso...");
	}
}
