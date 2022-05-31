import java.util.Scanner;
import java.util.Random; 

/**
 * 
 */

/**
 * @author Fualp
 *
 */
public class main {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		Controlador miJuego;
		Protagonista miProtagonista = null;  
		String res; 
		String opcionElegida;
		String mostrar; 
		Monstruo monstruo=null; 
		boolean salir; 
		Random r = new Random();
		while(true) {
			boolean jefeDerrotado=false; 
			System.out.println("Presione cualquier tecla para juga (y después enter) \n Presione tecla s para salir");
			res=lector.nextLine();
			if(res.equals("s")||res.equals("S")) {
				System.out.println("Adios");
				break;} 
			String posibleHeroe;
		while (true) {	
		while(true) {
			System.out.println("Bienvenido a este minujuego RPG");
			System.out.println("Existen tres opciones para el tiepo de personje que será protagonista");
			System.out.println("1. Mago\n"
							+ "2. Arquero\n"
							+ "3. Guerrero");
			System.out.println("Ver detalles de... (ingresa indice)");
			res=lector.nextLine();
			salir= ((res.equals("1"))||(res.equals("2"))||(res.equals("3")))?true:false;  
			if(salir) { 
				opcionElegida=res.equals("1")?"Mago":res.equals("2")?"Arquero":"Guerrero"; 
				posibleHeroe=opcionElegida;
				break;
			}else System.out.println("Ingrese una opción válida");
			}
		mostrar=
			(opcionElegida.equals("Mago"))?
					"1. Atacar: Golpe basico"
					+ "\n2. Activa Escudo : que reduce el dano recibido al 50% pero disminuye el daño propio en la misma proporcion"
					+ "\n3. Curarte: Regenera la vida al 100, o en 30 punto si ya teien 100 puntos"
					+ "\n4. Duplicar: duplica dano de ambos rivales "
					+ "\n5. Confusion: De forma ingeniosa roba recursos de rival"
					+ "\n6. Sombrero de Mago: Saca conejo de su sumbrero (no hace nada, pero es muy bonito)"
					
			:(opcionElegida.equals("Arquero"))?
					"1. Atacar: Golpe basico"
					+ "\n2. Activa Escudo: que reduce el dano recibido al 50% pero disminuye el daño propio en la misma proporcion"
					+ "\n3. Curar: Regenera la vida al 100, o en 30 punto si ya teien 100 puntos"
					+ "\n4. Tiro de arco: Tira una felcha con esplendida punteria"
					+ "\n5. Esquivar: Evita todo tipo de golpse per o resulta tirando ataques con dano muy reducido"
					+ "\n6. RObin Hood: Roba a los politicos corruptos y acabo con su malvado reinado de un solo \'Golpe\'"
					
				   :		
					   "1. Atacar: Golpe basico"
					+ "\n2. Activa Escudo que reduce el dano recibido al 50% pero disminuye el daño propio en la misma proporcion"
					+ "\n3. Curar: Regenera la vida al 100, o en 30 punto si ya teien 100 puntos"
					+ "\n4. Tira su lanza al enemigo con toda rabia"
					+ "\n5. Espadachin: Se lanza a pelear con su maravillosa espada"
					+ "\n6. Grito De guerra: Llama a su ejercito a que aplaste a sus enemigos"
					+ "\n En realida este es el peor personajes de todos";
		System.out.println(mostrar);

		 while(true) {
		 System.out.println("\n\n1. Seleccionar\n"
		 				  + "2. Regresar ");
			res=lector.nextLine();
			salir= ((res.equals("1"))||(res.equals("2")))?true:false;  
			if(salir) { 
				opcionElegida=res; 
				break;
			}else System.out.println("Ingrese una opción válida");
		 }
		 if(opcionElegida.equals("1"))break; 
		 }
		 if(opcionElegida.equals("1")) {
			 miProtagonista = posibleHeroe.equals("Mago")? new Mago():posibleHeroe.equals("Arquero")? new Arquero(): new Guerrero();
			 System.out.println("Heroe guardado como: "+posibleHeroe);
			 
		 }
		 miJuego= new Controlador(miProtagonista);
		 while(true) {
				if(miProtagonista.getVida()==0) {
					System.out.println("Has muerto!\n F");
					break; 
				}
		if(jefeDerrotado==true) {
			System.out.println("Felicidades, has ganado!!!!");
			break; 
			
		}

		 System.out.println("El juego acaba hasta que se derrota a 2 monstruos y al jefe!!!");
		 System.out.println("Comienza la aventura....");
		 System.out.println("* jugador camina *");
		 switch(miJuego.AcontecimientoAleatorio()) {
		 case(0):{//Llego un monstruo
			 System.out.println("Ha llegado un monstruo!!!!!");
			 monstruo=miJuego.ApareceMonstruo();
			 boolean turno=true; //true=turno jugador   false= turno monstruo
			 System.out.println("Vida: "+monstruo.getVida());
			 while(monstruo.getVida()!=0&&miProtagonista.getVida()!=0) {
				 System.out.println(monstruo.getNombre()+" tiene "+monstruo.getVida()+" puntos de vida");
				 System.out.println("Tu vida actual: "+miProtagonista.getVida());
				 if (turno==true) {
				while(true) {
				 System.out.println("Es tú turno\n ¿Que deseas hacer?");
				 System.out.println("1. Atacar\n2. Activar Escudo\n3. Curarte");
				 switch(posibleHeroe) {
				 case("Mago"):{
					 System.out.println("4. Confusion\n5. Duplica\n6. Sombrero de mago");
					 break; 
				 }
				 case("Arquero"):{
					 System.out.println("4. Tiro de arco\n5. Esquivar\n6. Robin Hood");
					 break; 
				 }
				 case("Guerrero"):{
					 System.out.println("4. Tiro de lanza\n5. Espadachin\n6. Grito de guerra");
					 break;
				 }
				 case ("Conejo"):{
					 System.out.println("4. Comer Zanahoria\n5. Mordida\n6. Mordida (pero en el puesto 6 XD)");
					 break; 
				 }
				 
				 
				 }
				 
				 res=lector.nextLine();
				 salir= ((res.equals("1"))||(res.equals("2"))||(res.equals("3"))||(res.equals("4"))||(res.equals("5"))||(res.equals("6")))?true:false;  
					if(salir) { 
						opcionElegida=res; 
						break;
					}else System.out.println("Ingrese una opción válida");

				}
				
				 switch(posibleHeroe) {
				 case("Mago"):{
					 Mago HeroeMago=(Mago)miProtagonista; 
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeMago.Atacar(monstruo));
						 break; }
					 case("2"):{
						 System.out.println(HeroeMago.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeMago.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeMago.Confusion(monstruo));
						 break; }
					 case("5"):{
						 System.out.println(HeroeMago.Duplica(monstruo));
						 break; }
					 case("6"):{
						 System.out.println(HeroeMago.SombreroDeMago(monstruo));
						 break; }
					 }
					 break; 
				 }
				 case("Arquero"):{
					 Arquero HeroeArquero=(Arquero)miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeArquero.Atacar(monstruo));
						 break; }
					 case("2"):{
						 System.out.println(HeroeArquero.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeArquero.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeArquero.TiroDeArco(monstruo));
						 break; }
					 case("5"):{
						 System.out.println(HeroeArquero.Esquivar());
						 break; }
					 case("6"):{
						 System.out.println(HeroeArquero.RobinHood(monstruo));
						 break; }
					 }
					 break; 
				 }
				 case("Guerrero"):{
					 Guerrero HeroeGuerrero=(Guerrero)miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeGuerrero.Atacar(monstruo));
						 break; }
					 case("2"):{
						 System.out.println(HeroeGuerrero.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeGuerrero.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeGuerrero.TiroDeLanza(monstruo));
						 break; }
					 case("5"):{
						 System.out.println(HeroeGuerrero.EspadaChin(monstruo));
						 break; }
					 case("6"):{
						 System.out.println(HeroeGuerrero.GritoDeGuerra(monstruo));
						 break; }
					 }
					 break;
				 }
				 case ("Conejo"):{
					 Conejo HeroeConejo=(Conejo) miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeConejo.Atacar(monstruo));
						 break; }
					 case("2"):{
						 System.out.println(HeroeConejo.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeConejo.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeConejo.ComeZanahoria());
						 break; }
					 default:{
						 System.out.println(HeroeConejo.Mordida(monstruo));
						 break; }
					 }
					 break; 
				 }
				 default:{
					 System.out.println("Esperando");
				 }
				 
				 
				 }
				 }else {
					 System.out.println("Es turno del monstruo");
					 if(monstruo.getNombre().equals("Pie grande")) {
						 PieGrande monstruo1=(PieGrande)monstruo;
						 int decision=r.nextInt(1-0+1);
						 if(decision==0) System.out.println(monstruo1.LeyendaUrbana(miProtagonista));
						 else System.out.println(monstruo1.PelajeDeAcero(miProtagonista));
						 
					 }else 	 if(monstruo.getNombre().equals("Mega pie grande")) {
						 MegaPieGrande monstruo1=(MegaPieGrande)monstruo;
						 int decision=r.nextInt(2-0+1);
						 if(decision==0) System.out.println(monstruo1.LeyendaUrbana(miProtagonista));
						 else if(decision==1) System.out.println(monstruo1.PelajeDeAcero(miProtagonista));
						 else System.out.println(monstruo1.DosPasos(miProtagonista));
						 
					 }else 	 if(monstruo.getNombre().equals("Politico corrupto")) {
						 PoliticoCorrupto monstruo1=(PoliticoCorrupto)monstruo;
						 int decision=r.nextInt(1-0+1);
						 if(decision==0) System.out.println(monstruo1.Ladron(miProtagonista));
						 else System.out.println(monstruo1.Discurso(miProtagonista));
						 
						 
					 }else {
						 PresidenteCorrupto monstruo1=(PresidenteCorrupto)monstruo;
						 int decision=r.nextInt(2-0+1);
						 if(decision==0) System.out.println(monstruo1.Ladron(miProtagonista));
						 else if(decision==1) System.out.println(monstruo1.Discurso(miProtagonista));
						 else System.out.println(monstruo1.SubeImpuestos(miProtagonista));
						 }
				 }
					 
					 
				turno=!turno;	 
			 }if(monstruo.getVida()==0) {
			 System.out.println("************************\n************************\nMonstruo derrotado\n************************\n************************");
			 miJuego.DerrotaEnemigo();}
			 break; 
		 }
		 
		 case(1):{//item gratis
			 System.out.println("Parece que has encontrado un item para correr");
			 miJuego.ItemCorrer(miProtagonista);
			 break; 
		 }
		 case(2):{//Llega boss
			 Covid Jefe= new Covid(); 
			 System.out.println("Ha aparecido el jefe!!!!");
			 boolean turno=true;//true es para jugador 
			 while(Jefe.getVida()!=0&&miProtagonista.getVida()!=0) {
				 System.out.println(Jefe.getNombre()+" tiene "+Jefe.getVida()+" puntos de vida");
				 System.out.println("Tu vida actual: "+miProtagonista.getVida());
				 if (turno==true) {
				while(true) {
				 System.out.println("Es tú turno\n ¿Que deseas hacer?");
				 System.out.println("1. Atacar\n2. Activar Escudo\n3. Curarte");
				 switch(posibleHeroe) {
				 case("Mago"):{
					 System.out.println("4. Confusion\n5. Duplica\n6. Sombrero de mago");
					 break; 
				 }
				 case("Arquero"):{
					 System.out.println("4. Tiro de arco\n5. Esquivar\n6. Robin Hood");
					 break; 
				 }
				 case("Guerrero"):{
					 System.out.println("4. Tiro de lanza\n5. Espadachin\n6. Grito de guerra");
					 break;
				 }
				 case ("Conejo"):{
					 System.out.println("4. Comer Zanahoria\n5. Mordida\n6. Mordida (pero en el puesto 6 XD)");
					 break; 
				 }
				 
				 
				 }
				 
				 res=lector.nextLine();
				 salir= ((res.equals("1"))||(res.equals("2"))||(res.equals("3"))||(res.equals("4"))||(res.equals("5"))||(res.equals("6")))?true:false;  
					if(salir) { 
						opcionElegida=res; 
						break;
					}else System.out.println("Ingrese una opción válida");

				}
				
				 switch(posibleHeroe) {
				 case("Mago"):{
					 Mago HeroeMago=(Mago)miProtagonista; 
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeMago.Atacar(Jefe));
						 break; }
					 case("2"):{
						 System.out.println(HeroeMago.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeMago.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeMago.Confusion(Jefe));
						 break; }
					 case("5"):{
						 System.out.println(HeroeMago.Duplica(Jefe));
						 break; }
					 case("6"):{
						 System.out.println(HeroeMago.SombreroDeMago(Jefe));
						 break; }
					 }
					 break; 
				 }
				 case("Arquero"):{
					 Arquero HeroeArquero=(Arquero)miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeArquero.Atacar(Jefe));
						 break; }
					 case("2"):{
						 System.out.println(HeroeArquero.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeArquero.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeArquero.TiroDeArco(Jefe));
						 break; }
					 case("5"):{
						 System.out.println(HeroeArquero.Esquivar());
						 break; }
					 case("6"):{
						 System.out.println(HeroeArquero.RobinHood(Jefe));
						 break; }
					 }
					 break; 
				 }
				 case("Guerrero"):{
					 Guerrero HeroeGuerrero=(Guerrero)miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeGuerrero.Atacar(Jefe));
						 break; }
					 case("2"):{
						 System.out.println(HeroeGuerrero.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeGuerrero.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeGuerrero.TiroDeLanza(Jefe));
						 break; }
					 case("5"):{
						 System.out.println(HeroeGuerrero.EspadaChin(Jefe));
						 break; }
					 case("6"):{
						 System.out.println(HeroeGuerrero.GritoDeGuerra(Jefe));
						 break; }
					 }
					 break;
				 }
				 case ("Conejo"):{
					 Conejo HeroeConejo=(Conejo) miProtagonista;
					 switch(opcionElegida) {
					 case("1"):{
						 System.out.println(HeroeConejo.Atacar(Jefe));
						 break; }
					 case("2"):{
						 System.out.println(HeroeConejo.Protegerse());
						 break; }
					 case("3"):{
						 System.out.println(HeroeConejo.Curar());
						 break; }
					 case("4"):{
						 System.out.println(HeroeConejo.ComeZanahoria());
						 break; }
					 default:{
						 System.out.println(HeroeConejo.Mordida(Jefe));
						 break; }
					 }
					 break; 
				 }
				 
				 
				 }
				 }else {
					 System.out.println("Turno de COVID!!");
					 int accion =r.nextInt(2);
					 if(accion==0) {
						 System.out.println(Jefe.Expansion(miProtagonista));
					 }else if(accion==1) {
						 System.out.println(Jefe.HijoDelMurcielago(miProtagonista));
					 }else {
						 System.out.println(Jefe.Infeccion(miProtagonista));
					 }
				 }
					 
					 
				turno=!turno;	 
				 
}jefeDerrotado=true; 
			 break; 
		 }
		 }
		 } 
		 
		}
		System.out.println("Fin del juego");
	}

}
