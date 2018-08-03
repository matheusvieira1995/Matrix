package Lista;

import Randomizer.MiddleSquareRandomizer;
import Randomizer.Randomizer;

public class List implements IList {
	
	private Object[] lista = new Object[5];
	private Randomizer r = new MiddleSquareRandomizer();
	
	
	
	@Override
	public void append(Object o) {
		testEspaco();
		lista[count()] = o;

	}
	
	private boolean testIndex (int index) {
		if (index > count() - 1 || index < 0) {
			return false;
		} 
		return true;
	}

	private void addEspaco() {
		Object[] lista = new Object[this.lista.length * 2];
		for (int i = 0; i < this.lista.length; i++) {
			lista[i] = this.lista[i];
		}
		this.lista = lista;
	}
	
	private void testEspaco() {
		if (lista[lista.length-1] != null) addEspaco();
	}

	@Override
	public void prepend(Object o) {
		testEspaco();
		for (int i = count()-1; i >= 0; i--) {
			lista[i+1] = lista[i];
		}
		lista[0] = o;

	}

	@Override
	public boolean insert(Object o, int index) {
		testEspaco();
		if (index > count() || index < 0) return false;
		if (index == count()) {
			lista[index] = o;
			return true;
		}
		for (int i = count(); i > index; i--) {
			lista[i] = lista[i-1]; 
		}
		lista[index] = o;
		return true;
	}

	@Override
	public Object get(int index) {
		if (testIndex(index) == false) return null; 
		if (lista[index] != null) {
			return lista[index];
		}else{
			return null;
		}
	}

	@Override
	public Object getFirst() {
		return get(0);
	}

	@Override
	public Object getLast() {
		if (count() == 0) {
			return null;
		}
		return lista[count() - 1];
	}

	@Override
	public Object getSample() {
		int n2 = r.randomInt(count()) - 1;
		if (lista[n2] != null) {
			return lista[n2];
		}else {
			return null;
		}
	}

	@Override
	public Object drop(int index) {
		Object r = lista[index];
		if (delete(index)) return r;
		return null;
	}

	@Override
	public boolean delete(int index) {
		if (testIndex(index) == false) return false; 
		for (int i = index; i < count() - 1; i++) {
			lista[i] = lista[i+1];
		}
		lista[count() - 1] = null;

		return true;
	}

	@Override
	public boolean remove(Object o) {
		boolean r = false;
		int index = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == o) {
				r = true;
				index = i;
			}	
		}
		if (r) {
			delete(index);
		}
		return r;
	}

	@Override
	public void reset() {
		int c = count();
		for (int i = 0; i < c; i++) {
			lista[i] = null;
		}
	}

	@Override
	public int count() {
		int c = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				c++;
			}
			
		}
		return c;
	}

	@Override
	public boolean has(Object o) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == o) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				return false;
			}
			
		}
		return true;
	}

	@Override
	public int indexOf(Object o) {
		int r = -1;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == o) {
				r = i;
			}
		}
		return r;
	}

}
