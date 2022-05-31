/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class PieGrande extends Monstruo {
	protected int vidaZapatos; 
	protected boolean pelaje; //anado atributo para poder aplicar escudo con segundo movimiento 
	public PieGrande() {
		pelaje=false; 
		nombre="Pie grande";
		vida=50; 
		vidaZapatos=3; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String LeyendaUrbana(Protagonista prota) {
		int dano;
		if (vidaZapatos<=0) {
			dano=10; 
			prota.recibeAtaque(dano);
			return "Pie grande ha intentando dar un pisoton sobre ti (Movimiento:\'Leyenda urbana\'), pero ha perdido sus zapatos"
					+ " asi que solo te mordio\nPierde "+dano+" puntos de vida";
		}else {
		dano=20; 
		prota.recibeAtaque(dano);
		return "Pie grande ha dado un pisoton sobre ti (Movimiento:\'Leyenda urbana\') \n Pierde "+dano+" puntos de vida"; }
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String PelajeDeAcero(Protagonista prota) {
		
		if(pelaje==true) {
			pelaje=!pelaje; 
			return "Pie grande ha desactivado su pelaje  de acero (el dano a recibir disminuye)";
		}else {
			return "Pie grande ha desactivado su pelaje  de acero (que tonto)";
		}
		
	}
	/**
	 * @return devuelve la vida de los zapatos 
	 */
	public int getVidaZapatos() {
		return vidaZapatos;
	}
	/**
	 * @param vidaZapatos ingresa la vida de lso zapatos
	 */
	public void setVidaZapatos(int vidaZapatos) {
		this.vidaZapatos = vidaZapatos;
	}
	/**
	 * @return indica el estado del pelaje
	 */
	public boolean isPelaje() {
		return pelaje;
	}
	/**
	 * @param pelaje ingresa el estado del pelaje
	 */
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
}
