package Matrix.modelo;

public class Program extends Person {

	public Program(String nome) {
		super(nome);
	}

	@Override
	public String getAlias() {
		return this.nome;
	}
	@Override
	public String toString() {
		return "The " + this.nome;
	}
	
	@Override
	public boolean isPlugged() {
		return true;
	}
	
}
