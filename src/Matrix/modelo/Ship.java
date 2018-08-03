package Matrix.modelo;

import Lista.*;

public class Ship {
	
	final private String nome;
	private IList crew = new List();
	private Person capitao;
	
	public Ship(String nome) {
		this.nome = nome;
	}

	public int crewCount() {
		int r = crew.count();
		return r;
	}

	public Object getCaptain() {
		return capitao;
	}

	public void recruit(Person p) {
		if (!p.isTripulado()) {
			crew.append(p);
			p.setTripulado(true);
			if (capitao == null) capitao = p;
		}
		 
	}

	public void setCaptain(Person p) {
		if (crew.has(p)) capitao = p;
		
	}
	
	public boolean has(Person p) {
		if (crew.has(p)) return true;
		return false;
	}

	public void removeCrew(Person p) {
		crew.remove(p);
		p.setTripulado(false);
	}

	public void destroy() {
		for (int i = 0; i < crew.count(); i++) {
			Object j = crew.get(i);
			((Person) j).setVivo(false);
		}
	}
}
