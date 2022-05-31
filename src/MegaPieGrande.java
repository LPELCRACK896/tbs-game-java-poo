/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class MegaPieGrande extends PieGrande {
	public MegaPieGrande () {
		nombre="Mega pie grande";
		vida=80; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String DosPasos(Protagonista prota) {
		int dano;
		if (vidaZapatos<=0) {
			dano=10;
			prota.recibeAtaque(dano);
			return "Pie grande ha intentando dar un pisoton sobre ti (Movimiento:\'Dos pasos\'), pero ha perdido sus zapatos "
					+ " asi que solo te mordio\nPierde "+dano+" puntos de vida";
		}else {
		dano=60; 
		prota.recibeAtaque(dano);
		return "Pie grande ha dado dos pisotones sobre ti (Movimiento:\'Dos pasos\') \nPierde "+dano+" puntos de vida"; } 
	}
}
