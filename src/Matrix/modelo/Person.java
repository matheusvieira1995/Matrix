package Matrix.modelo;

abstract public class Person  {

	final protected String nome;
	final protected String sobrenome;
	final protected String segundoNome;
	protected boolean conectado = false;
	protected String alias;
	protected boolean tripulado = false;
	protected boolean vivo = true;
	
	public Person(String sobrenome, String segundoNome, String nome) {
		this.nome = nome;
		this.segundoNome = segundoNome;
		this.sobrenome = sobrenome;
	}
	
	
	public Person(String sobrenome, String nome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.segundoNome = null;
	}
	
	public Person(String nome) {
		this.nome = nome;
		this.sobrenome = null;
		this.segundoNome = null;
	}
	
	public boolean isTripulado() {
		return tripulado;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public void setTripulado(boolean tripulado) {
		this.tripulado = tripulado;
	}
	
	
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	public boolean isPlugged() {
		return (this.conectado ? true : false);
	}
	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getAlias() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getMiddleName() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isCaptainOf(Ship s) {
		if (s.getCaptain().equals(this)) return true;
		return false;
	}


	public void becameCaptainOf(Ship s) {
		s.setCaptain(this);
	}


	public boolean isCrewOf(Ship s) {
		if (s.has(this)) return true;
		return false;
	}


	public void leaveShip(Ship s) {
		s.removeCrew(this);
	}


	public void join(Ship s) {
		s.recruit(this);
	}


	public void plug() {
		this.conectado = true;
	}


	public void unplug() {
		this.conectado = false;
	}


	public boolean isAlive() {
		if (vivo) return true;
		return false;
	}


	public void unplug(Person p) {
		if (p.isPlugged()) {
			p.setConectado(false);
			p.setVivo(false);
		}
		
	}


	public void kill(Person p) {
		if (this.vivo) {
			if (p.toString().equals("Agent Smith")) {
				p.conectado = false;
			}
			if (this.conectado && p.conectado) {
				p.vivo = false;
				p.conectado = false;
			}
			if (!this.conectado && !p.conectado) {
				p.vivo = false;
				p.conectado = false;
			}
		}
	}


	public void free(Person p, String alias) {
		
	}


	



	
	

}
