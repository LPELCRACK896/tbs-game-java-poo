
/**
 * @author Fualp
 *
 */
public class Covid extends Monstruo{
	private int LLamadasABatman; 
	
	/**
	 * construtor 
	 */
	public Covid() {
		nombre="SRAS-CoV-2";
		vida=100;
		LLamadasABatman=4; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String Expansion(Protagonista prota) {
		int danoRecibido=28; 
		prota.recibeAtaque(danoRecibido);
		return "COvid se expande y hace 28 de dano"; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String HijoDelMurcielago(Protagonista prota) {
		if(LLamadasABatman>0)LLamadasABatman=LLamadasABatman-1; 
		
		int danoRecibido=25; 
		prota.recibeAtaque(danoRecibido);
		return "Covid ha llamado a su papa: ¡Batman! Y te ha dado una paliza (por que? Porque es batman)"; 
	}
	/**
	 * @param prota ingresa el protagonsita que ataca
	 * @return devuelve mensaje detallado del ataque realizado
	 */
	public String Infeccion(Protagonista prota) {
		int danoRecibido=35; 
		prota.recibeAtaque(danoRecibido);
		return "Has sido infectado y recibido 35 de dano"; 
	}
}
