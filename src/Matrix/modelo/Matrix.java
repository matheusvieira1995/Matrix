package Matrix.modelo;

public class Matrix {


	public Person newHuman(String sobrenome, String nome) {
		Human p = new Human(sobrenome, nome);
		p.setConectado(true);
		return p;
	}

	public Person newProgram(String apelido) {
		Program p = new Program(apelido);
		p.setConectado(true);
		return p;
	}

	public Person newHuman(String apelido) {
		Human p = new Human(apelido);
		p.setConectado(true);
		return p;
	}

	public Person newHuman(String sobrenome, String segundoNome, String nome) {
		Human p = new Human(sobrenome, segundoNome, nome);
		p.setConectado(true);
		return p;
	}

	public Person newAgent(String ultimoNome) {
		Agent p = new Agent(ultimoNome);
		p.setConectado(true);
		return p;
	}

	public boolean has(Person p) {
		if (p.toString().equals("Agent Smith")) return true;
		return p.isPlugged();
	}

	public void free(Person p, String alias) {
		if (p.toString().equals("Agent " + p.nome)) {
			
		} else {
			p.setAlias(alias);
			p.setConectado(false);
		}
	}

	public void enter(Person p) {
		if (p.isAlive()) p.setConectado(true);
	}

	public void enter(Person p1, Person p2) {
		if (p1.isAlive()) p1.setConectado(true); 
		if (p2.isAlive()) p2.setConectado(true);
	}

	public void leave(Person p) {
		p.setConectado(false);
	}
	
	

}
