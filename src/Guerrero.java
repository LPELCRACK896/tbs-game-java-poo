/**
 * 
 */

/**
 * @author Fualp
 *Fualp
 */
public class Guerrero extends Protagonista{
	public Guerrero() {		vida=100; 
	estadoJugador=true; 
	itemsParaCorrer=0; 
	escudo=false; 
	dano=1; 
	esquivar=false; }
	@Override
	public String Atacar(Monstruo Monstruo) {
		double danoARealizar=10*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "ESTO ES ESPARTA!!!!! Lo has pateado como en 300 ("+danoARealizar+" punto de dano realizado";
	}
	/**
	 * @param Monstruo ingresa el objetivo del ataque
	 * @return devuelve mensajes indicando especificaciones del atqeu
	 */
	public String TiroDeLanza(Monstruo Monstruo) {
		double danoARealizar=20*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "Has tirado tu lanza al enemigo"; 
	}
	/**
	 * @param Monstruo ingresa el objetivo del ataque
	 * @return devuelve mensajes indicando especificaciones del atqeu
	 */
	public String EspadaChin(Monstruo Monstruo) {
		double danoARealizar=30*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "Le has dado una serie de espadazos que nunca olvidara. Dano: "+danoARealizar; 
	}
	/**
	 * @param Monstruo ingresa el objetivo del ataque
	 * @return devuelve mensajes indicando especificaciones del atqeu
	 */
	public String GritoDeGuerra(Monstruo Monstruo) {
		double danoARealizar=25*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "Has llamado a tu ejercito y le han dado una paliza Dano: "+danoARealizar; 
	}
}

