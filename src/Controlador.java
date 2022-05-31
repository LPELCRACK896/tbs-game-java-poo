import java.util.Random;

/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class Controlador {
	private Protagonista protagonista;
	private Monstruo monstruo;
	private int cantidadeDeMonstrusoDerrotados;
	private Random r;
	public Controlador (Protagonista protagonista) {
		this.protagonista=protagonista;
		r = new Random();
		
	}
	/**
	 * @return deuvelve numero aleaotrio que indica el acontencimeinto aleatorio
	 */
	public int AcontecimientoAleatorio() {
		if(cantidadeDeMonstrusoDerrotados<2) {
		return r.nextInt(1);}
		else return 2; 
		
	}
	/**
	 * @return genera monstruo aleatorioi
	 */
	public Monstruo ApareceMonstruo() {
		int random =r.nextInt(3-0+1);
		while (true) {
			if (random==0||random==1||random==2||random==3) break; 
			else random =r.nextInt(3-0+1);}
		Monstruo monstruo = (random==0)? new MegaPieGrande(): (random==1)? new PieGrande():(random==2)? new PoliticoCorrupto():
			new PresidenteCorrupto();
		return monstruo;
	}
	/**
	 * @param prota ingresa al protagonista ganador del item
	 */
	public void ItemCorrer(Protagonista prota) {
		prota.setItemsParaCorrer(prota.getItemsParaCorrer()+1);
	}
	/**
	 * Cambia la cantida dde enemigos derrotados
	 */
	public void DerrotaEnemigo() {
		cantidadeDeMonstrusoDerrotados=cantidadeDeMonstrusoDerrotados+1; 
	}
}
