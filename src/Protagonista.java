/**
 * 
 */

/**
 * @author Fualp
 *
 */
public abstract class Protagonista {
	protected double vida; 
	protected boolean estadoJugador; 
	protected int itemsParaCorrer; 
	protected boolean escudo; 
	protected double dano; //cambio a double para usarlo con decimales
	protected boolean esquivar; 
	/**
	 * 
	 */
	public Protagonista() {
		vida=100; 
		estadoJugador=true; 
		itemsParaCorrer=0; 
		escudo=false; 
		dano=1; 
		esquivar=false; 
		
	}
	/**
	 * @param Monstruo monstruo objetivo
	 * @return devuelve mensaje especificando el atqque realizado
	 */
	public abstract String Atacar(Monstruo Monstruo);
	
	/**
	 * @return devulev emensaje indicando la accionn realizada
	 */
	public String Curar() {
		double restaruacion; 
		if (vida<90) {
			restaruacion= 100-vida; 
		}else restaruacion=30; 
		vida=vida+restaruacion;
		return "La vida del personaje ha sido restaurda "+restaruacion+" puntos (vida actual"+vida+")";
	}
	/**
	 * @return devulev emensaje indicando la accionn realizada
	 */
	public String Protegerse() {
		escudo=!escudo; 			
		if(escudo==true) { 
			dano=0.5; 
			return "Usted ha activado el escudo (daño a recibir reducido (50%) y daño a causar reducido (50%)";
	}else { 
		dano=1; 
		return "Usted ha desactivado el escudo (daño a recibir aumentado (50%) y daño a causar aumentado (50%)";}
	}
	/**
	 * @param danoRecibido ingresa el dano que se reduca a la vida
	 */
	public void recibeAtaque(int danoRecibido) {
		if (esquivar=true) {
		float danoRecibido2=danoRecibido;
		if (escudo==true) danoRecibido2= (float) (danoRecibido2*0.5); 
		if(vida-danoRecibido>0) vida=vida-danoRecibido;
		else vida=0; }
	
}

	/**
	 * @return devuelve la vida 
	 */
	public double getVida() {
		return vida;
	}

	/**
	 * @return devuleve si esta esquivando
	 */
	public boolean isEsquivar() {
		return esquivar;
	}

	/**
	 * @param esquivar ingresa si esat esquivando
	 */
	public void setEsquivar(boolean esquivar) {
		this.esquivar = esquivar;
	}

	/**
	 * @param vida ingresa la vida
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * @return devuelve el estado del jugador
	 */
	public boolean isEstadoJugador() {
		return estadoJugador;
	}

	/**
	 * @param estadoJugador ingreas el estado del jugador
	 */
	public void setEstadoJugador(boolean estadoJugador) {
		this.estadoJugador = estadoJugador;
	}

	/**
	 * @return devuelve los tiems de correr del jugador
	 */
	public int getItemsParaCorrer() {
		return itemsParaCorrer;
	}

	/**
	 * @param itemsParaCorrer ingresa items para correr
	 */
	public void setItemsParaCorrer(int itemsParaCorrer) {
		this.itemsParaCorrer = itemsParaCorrer;
	}

	/**
	 * @return devuelve su tiene activado el escudo
	 */
	public boolean isEscudo() {
		return escudo;
	}

	/**
	 * @param escudo cambia el estado del escudo
	 */
	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
	}

	/**
	 * @return revuleve el dano a realizar
	 */
	public double getDano() {
		return dano;
	}

	/**
	 * @param dano ingresa el dano a realaizar
	 */
	public void setDano(int dano) {
		this.dano = dano;
	}
}
