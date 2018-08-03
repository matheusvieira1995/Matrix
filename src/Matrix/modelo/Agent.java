package Matrix.modelo;

public class Agent extends Person {

	public Agent(String nome) {
		super(nome);
		super.conectado = true;
	}

	
	@Override
	public String getLastName() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Agent " + this.nome;
	}
	
	@Override
	public boolean isPlugged() {
		if (super.conectado) return true;
		return false;
	} 
	
}
