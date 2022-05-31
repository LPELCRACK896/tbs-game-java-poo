/**
 * 
 */

/**
 * @author Fualp
 *
 */
public abstract class Monstruo {
	protected String nombre;
	protected double vida;
	/**
	 * @return devuleve el nombre del monstruo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre ingresa el nombre del monstruo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return devuelve la vidal monstruo
	 */
	public double getVida() {
		return vida;
	}
	/**
	 * @param vida ingresa la vida del monstruo
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}
	/**
	 * @param danoRecibidoingresa el dano a recibir
	 */
	public void recibeAtaque(double danoRecibido) {
		if(vida-danoRecibido>0) vida=vida-danoRecibido;
		else vida=0; 
	}
	
}
