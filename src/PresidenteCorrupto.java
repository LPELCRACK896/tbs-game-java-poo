/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class PresidenteCorrupto extends PoliticoCorrupto{
	public PresidenteCorrupto () {
		nombre="Presidente corrupto";
		vida=50; 		
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String SubeImpuestos(Protagonista prota) {
		prota.recibeAtaque(10);
		return "Recibe ataque por subida de impuestos innecesaria del presidente"; 
		
	}
}
