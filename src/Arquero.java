/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class Arquero extends Protagonista{
	private int flechasRestantes; 
	public Arquero() {
		vida=100; 
		estadoJugador=true; 
		itemsParaCorrer=0; 
		escudo=false; 
		dano=1; 
		esquivar=false; 
		flechasRestantes=10; 
	}
	@Override
	public String Atacar(Monstruo Monstruo) {
		// TODO Auto-generated method stub
		double danoARealizar=10*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "Le has dado un golpe directo con tu arco("+danoARealizar+" puntos de dano realizado)";
	}
	/**
	 * @param Monstruo ingresa el objetivo del ataque
	 * @return devuelve mensajes indicando especificaciones del atqeu
	 */
	public String TiroDeArco(Monstruo Monstruo) {
		double danoARealizar;
		if (flechasRestantes!=0) {
			danoARealizar=25*dano; 
			Monstruo.recibeAtaque(danoARealizar);
			return "Has lanzado flecha al pecho, y realizado "+danoARealizar+" puntos de dano";
		}else { 
			danoARealizar=10*dano; 
			Monstruo.recibeAtaque(danoARealizar);
			return "Upsss, te has quedado sin flechas, has realizado jab derecho ("+ danoARealizar+" puntos de dano)"; }
	}
	/**
	 * @return devuelve mensajes indicando especificaciones del movimiento
	 */
	public String Esquivar() {
		esquivar=!esquivar;
		
		if (esquivar==true) {
			dano=0.2; 
			return "Esquivo activado (no puede recibir dano en este estado, solo hace 20% de dano)";}
		else {
			if (escudo==true) dano=1; 
			else {dano=0.5;}
			return "desactiva modo evasivo"; }
	}
	/**
	 * @param Monstruo ingresa el objetivo del ataque
	 * @return devuelve mensajes indicando especificaciones del atqeu
	 */
	public String RobinHood(Monstruo Monstruo) {
		if(Monstruo.getNombre().equals("Politico corrupto")||Monstruo.getNombre().equals("Presidente corrupto")) {
			Monstruo.recibeAtaque(Monstruo.getVida());
			return "Arquero ha usado Robin Hood en monstruo funcionario, el monstruo es despojado de las riquezas acumulado y con ello pierde toda su esencia (muere)";
		}else
		return "Robin Hood no funciona con mosntruos no funcionarios"; 
	}
}
