import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		ArrayList<Vertice> grafo = new ArrayList<Vertice>();
		Leitura.leitura(args[0],grafo);
		Algoritmo.buscaLargura(grafo);
	}
}
