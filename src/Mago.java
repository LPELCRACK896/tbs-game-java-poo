/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class Mago extends Protagonista{
	private double magiaRestante; 
	public Mago() {
		vida=100; 
		estadoJugador=true; 
		itemsParaCorrer=0; 
		escudo=false; 
		dano=1; 
		esquivar=false; 
	}
	/**
	 *
	 */
	@Override
	public String Atacar(Monstruo Monstruo) {
		// TODO Auto-generated method stub
		double danoARealizar=40*dano; 
		Monstruo.recibeAtaque(danoARealizar);
		return "Golpe de baston ("+danoARealizar+" de dano)";
	}
	/**
	 * @param Monstruo monstruo objetivo
	 * @return devuelve mensaje especificando el atqque realizado
	 */
	public String Confusion(Monstruo Monstruo) {
		if (Monstruo.nombre.equals("Pie grande")||Monstruo.nombre.equals("Mega pie grande")) {
			PieGrande pieGrande= (PieGrande)Monstruo; 
			pieGrande.setVidaZapatos(0);
			return "Haz hecho reflexionar ha pie grande sobre lo ridiculo que se ve con zapatos y los ha tirado lejos (pierde oportunidad de aplastarle con sus pies)"; }
		else if(Monstruo.nombre.equals("Politico corrupto")||Monstruo.nombre.equals("Presidente corrupto")) {
			PoliticoCorrupto politico= (PoliticoCorrupto)Monstruo;
			politico.setPresupuestoRobado(0);
			return "Has llamado a Arquero y ha robado todo el presupuesto a los politicos corruptos para entregarlo al pueblo";
		}else {
			return "Confusion no funciona contra COVID :'v";
		}
	}
	/**
	 * @param Monstruo monstruo objetivo
	 * @return devuelve mensaje especificando el atqque realizado
	 */
	public String Duplica(Monstruo Monstruo) {
		dano=dano*2; 
		return "Has duplicado tu dano de ataque"; 
	}
	/**
	 * @param Monstruo monstruo objetivo
	 * @return devuelve mensaje especificando el atqque realizado
	 */
	public String SombreroDeMago(Monstruo Monstruo) {// por tiempo no hace ralmente nada :(
		
		return "Has sacado un conejo del sombrero"; 
	}

}
