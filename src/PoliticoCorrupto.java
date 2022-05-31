/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class PoliticoCorrupto extends Monstruo{
	private int presupuestoRobado; 
	public PoliticoCorrupto() {
		nombre= "Politico corrupto";
		vida=50; 
		presupuestoRobado=5; 
		
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String Ladron(Protagonista prota) {
		prota.recibeAtaque(5);
		presupuestoRobado=presupuestoRobado+1; 
		return "El politico te ha robado y quitado 5 puntos de vida"; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String Discurso(Protagonista prota) {
		if(presupuestoRobado!=0) {prota.recibeAtaque(10);
		return "El poliico te ha lavado el cerebro con su discurso y aprovecho el momento para orbarte 10 puntos de vida";}
		else {
			prota.recibeAtaque(1);
			return "Y que ha pasado con el presupuesto???? Habra que robar de nuevo :D\nComo no queda de otra te muerde como ataque (pierde uno de vida)";
		}
		
	}
	/**
	 * @return devuelve el presupesto del cpolitoc
	 */
	public int getPresupuestoRobado() {
		return presupuestoRobado;
	}
	/**
	 * @param presupuestoRobado ingresa el presupuesto del politico
	 */
	public void setPresupuestoRobado(int presupuestoRobado) {
		this.presupuestoRobado = presupuestoRobado;
	}
}
