import java.util.ArrayList;
import java.util.Scanner;

public class Algoritmo {
	public static void buscaLargura(ArrayList<Vertice> grafo){
		ArrayList<Vertice> estadoAtual = new ArrayList<Vertice>();
		ArrayList<Vertice> caminho = new ArrayList<Vertice>();
		grafo.get(0).setExplorado(true);
		estadoAtual.add(grafo.get(0));
		while(!estadoAtual.isEmpty()){
			if(estadoAtual.get(0).getMiss1() == 3 && estadoAtual.get(0).getCan1() == 3){
				System.out.println("Solução encontrada, printando caminho...");
				retornaCaminho(grafo, estadoAtual.get(0), caminho);
				return;
			}
			for (Vertice w : estadoAtual.get(0).getVizinhos()) {
				w.setPai(estadoAtual.get(0).getId());
				if(w.isExplorado() == false){
					w.setExplorado(true);
					if(isValido(w) == true){
						estadoAtual.add(w);
					}
				}
			}
			estadoAtual.remove(0);
		}
	}
	
	public static void retornaCaminho(ArrayList<Vertice> grafo, Vertice v, ArrayList<Vertice> caminho){
		caminho.add(v);
		Vertice aux = v;
		int saida = 0;
		while(saida == 0){
			if((v.getPai()-1) != 0){
				v = grafo.get(v.getPai() - 1);
			}else{
				v = grafo.get(v.getPai() - 1);
				caminho.add(v);
				break;
			}
			if(v.getId() != 1){
				caminho.add(v);
			}else if(v.getId() == 1){
				caminho.add(v);
				saida = 1;
			}
		}
		//Barco bit, 0 sinaliza que o barco esta do lado esquerdo, bit 1 barco esta do lado direito
		System.out.println("Padrão: M C | M C B");
		for (int i = (caminho.size()-1); i >= 0 ; i--) {
			System.out.println("Estado - ID "+ caminho.get(i).getId() + ": " +caminho.get(i).getMiss()+ " " + caminho.get(i).getCan()
					+ " | " + caminho.get(i).getMiss1() + " " + caminho.get(i).getCan1() + " " + 
					caminho.get(i).getBarco());
		}
	}
	
	public static boolean isValido(Vertice v){
		if(v.getMiss() != 0 && v.getCan() != 0 && v.getCan() < v.getMiss() && v.getMiss1() != 0){
			return false;
		}
		if(v.getCan() == 0 && v.getMiss() != 0 && v.getMiss1() != 0){
			return false;
		}
		if(v.getMiss() != 0 && v.getCan() > v.getMiss()){
			return false;
		}
		return true;
	}
}
