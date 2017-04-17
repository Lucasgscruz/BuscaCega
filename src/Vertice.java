import java.util.ArrayList;

public class Vertice {
	
	private int id;
	private int miss;
	private int can;
	private int miss1;
	private int can1;
	private int barco;
	private int pai;
	private ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();
	private boolean explorado;
	
	public Vertice(int id, int miss, int can, int miss1, int can1, int barco){
		this.id = id;
		this.miss = miss;
		this.can = can;
		this.miss1 = miss1;
		this.can1 = can1;
		this.barco = barco;
		this.pai = 0;
		this.explorado = false;
	}

	public boolean isExplorado() {
		return explorado;
	}

	public void setExplorado(boolean explorado) {
		this.explorado = explorado;
	}

	public ArrayList<Vertice> getVizinhos() {
		return vizinhos;
	}

	public void addVizinhos(Vertice v) {
		this.vizinhos.add(v);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMiss() {
		return miss;
	}

	public void setMiss(int miss) {
		this.miss = miss;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getMiss1() {
		return miss1;
	}

	public void setMiss1(int miss1) {
		this.miss1 = miss1;
	}

	public int getCan1() {
		return can1;
	}

	public void setCan1(int can1) {
		this.can1 = can1;
	}

	public int getBarco() {
		return barco;
	}

	public void setBarco(int barco) {
		this.barco = barco;
	}

	public int getPai() {
		return pai;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}
}
