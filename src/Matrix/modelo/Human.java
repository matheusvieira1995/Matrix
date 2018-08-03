package Matrix.modelo;

public class Human extends Person {
	
	public Human(String sobrenome, String nome) {
		super(sobrenome, nome);
		
	}

	public Human(String nome) {
		super(nome);
		super.alias = nome;
	}

	public Human(String sobrenome, String segundoNome, String nome) {
		super(sobrenome, segundoNome, nome);
	}
	
	
	@Override
	public String getFirstName() {
		return (this.isPlugged() ? this.nome : null);
	}
	
	@Override 
	public String getLastName() {
		return (this.isPlugged() ? this.sobrenome : null);
	}
	
	@Override 
	public String getFullName() {
		return (this.isPlugged() ? this.nome + (this.segundoNome == null ? "" : " " + this.segundoNome) + " " + this.sobrenome : null);
	}

	@Override
	public String getMiddleName() {
		return (this.isPlugged() ? this.segundoNome : null);
	}
	
	@Override
	public String getAlias() {
		return (this.isPlugged() ? null : this.alias);
	}
	
	@Override
	public String toString() {
		return (this.isPlugged() ? "Mr. " + super.sobrenome : this.getAlias());
	}
	
	@Override
	public boolean isPlugged() {
		return (this.conectado ? true : false);
	}
	
	@Override
	public void free(Person p, String alias) {
		try {
			if (this.getAlias().equals("Neo")) {
				if (p.toString().equals("Agent " + p.nome)) {
					
				} else {
					p.setAlias(alias);
					p.setConectado(false);
				}
			}
		} catch (NullPointerException e) {
			if (this.getFirstName().equals("Tomas")) {
				if (p.toString().equals("Agent " + p.nome)) {
					
				} else {
					p.setAlias(alias);
					p.setConectado(false);
				}
			}
		}
		
	}
}
