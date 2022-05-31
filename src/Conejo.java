/**
 * 
 */

/**
 * @author Usuario
 *
 */
public class Conejo extends Protagonista{
	public Conejo() {
		vida=100; 
		estadoJugador=true; 
		itemsParaCorrer=0; 
		escudo=false; 
		dano=1; 
		esquivar=false; 
	}
	
	@Override
	public String Atacar(Monstruo Monstruo) {
		// TODO Auto-generated method stub
		return "Hola, soy un conejo, no entiendo a que re refieres con atacar??? Quieres que lo muerda?";
	}
	public String ComeZanahoria() {
		vida =vida+10; 
		return "Conejo ha comido una zanahoria y ha regenerado 10 puntos de vida"; 
	} 
	public String Mordida(Monstruo Monstruo) {
		Monstruo.recibeAtaque(8);
		return "Conejo ha mordido y realizado 8 punto de dano"; 
	}
}
