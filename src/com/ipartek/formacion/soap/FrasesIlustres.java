package com.ipartek.formacion.soap;

import java.util.ArrayList;

public class FrasesIlustres {
private int contador=0;
	private ArrayList<String> frases;
	
	public FrasesIlustres() {
		super();
		crearFrases();
	}
	
	

	private void  crearFrases() {
		
		frases=new ArrayList<String>();
		frases.add("Un plato es un plato");
		frases.add("Somos sentimientos y tenemos seres humanos ");
		frases.add("Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para m� el suyo, beneficio pol�tico.");
		frases.add("Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.");
		frases.add("Espa�a es una gran naci�n y los espa�oles muy espa�oles y mucho espa�oles.");
		frases.add("�Ustedes piensan antes de hablar o hablan tras pensar?");
		frases.add("Quiero transmitir a los espa�oles un mensaje de esperanza. ETA es una gran naci�n; Espa�a, perd�n, es una gran naci�n.");
		frases.add("Las decisiones se toman en el momento de tomarse.");
		frases.add("A veces la mejor decisi�n es no tomar ninguna decisi�n, que tambi�n es tomar una decisi�n.");
		frases.add("Vamos a ver, eeeh, uuum� �Medidas para crear empleo? Bueno, la verdad es que me ha pasado una cosa verdaderamente notable, que lo he escrito aqu� y no entiendo mi letra.");
		frases.add("Como dec�a Galileo, el movimiento siempre se acelera cuando se va a detener.");
		frases.add("A veces estamos pensando siempre en lo material, y al final los seres humanos somos sobre todo personas.");
		frases.add("Tenemos que fabricar m�quinas que nos permitan seguir fabricando m�quinas, porque lo que no van a hacer nunca las m�quinas es fabricar m�quinas a su vez.");
		frases.add("No es lo mismo que gobierne uno que que gobierne otro. No es lo mismo. Dicho de otra manera: es muy distinto, muy diferente.");
		frases.add("Todo lo que se refiere a m� y a los compa�eros del partido no es cierto, salvo alguna cosa que han publicado los medios.");
		frases.add("Me gustan los catalanes porque hacen cosas.");
		frases.add("Da gusto hablar bien de quien se merece que hablen bien de uno, y de aquel del que uno quiere hablar bien porque se lo merece.");
		frases.add("Tanto el laicismo como los fundamentalismos religiosos son enemigos de la libertad y, si logran imponerse, conducen inexorablemente al totalitarismo.");
		frases.add("Siempre estar� detr�s de ti, o delante, o a un lado.");
		frases.add("Quiero decir s� a los chiringuitos. Nos gustan los chiringuitos. Queremos los chiringuitos. Forman parte de nuestro ser, y mientras este partido exista, habr� chiringuitos en M�laga y en Pontevedra tambi�n.");
		frases.add("Esto no es como el agua que cae del cielo, sin que se sepa exactamente por qu�.");
		frases.add("Cuanto m�s sep�is de todo, mejor. Por saber much�simo no os va a pasar nada malo, luego ya veremos. Si uno es ingeniero o futbolista, se le abren todas las puertas del mundo.");
		frases.add("Por las carreteras tienen que ir coches y de los aeropuertos tienen que salir aviones.");
		frases.add("Yo de este asunto s� poco, pero mi primo, que supongo que sabr�, claro, y entonces dijo: �Oiga, he tra�do aqu� a diez de los m�s importantes cient�ficos del mundo, y ninguno me ha garantizado el tiempo que iba a hacer ma�ana en Sevilla�. �C�mo alguien puede decir lo que va a pasar en el mundo dentro de 300 a�os?� No lo s�, es decir, no lo s�; es un asunto al hay que estar muy atentos pero, en fin, tampoco lo podemos convertir en el gran problema mundial. Hay otros problemas m�s importantes, como los problemas del sector energ�tico, los problemas de las emisiones y otros problemas muy importantes.");
		frases.add("Una Espa�a a la que 75 millones de espa�oles vienen cada a�o. Por algo ser�.");
		frases.add("Yo prefiero no subir el IVA en 2013 pero tambi�n le digo que si en ese momento es bueno subir el IVA lo har� y har� cualquier cosa aunque no me guste y haya dicho que no lo voy a hacer.");
		frases.add("Una cosa es ser solidario, y otra es serlo a cambio de nada.");
		frases.add("Si hay una agencia o alguien que dice que este fin de semana vamos a pedir el rescate como dicen ellos, caben dos posibilidades, que esa agencia tenga raz�n y mejor informaci�n que yo, lo cual es muy posible, o que no sea as�, lo cual pues a lo mejor tambi�n es posible o no que m�s da. Pero si a usted le sirve de algo lo que yo pueda decirle y si le parece lo que yo pueda decirle es m�s importante que esa filtraci�n, le dir� que no; pero vamos a�n as� puede usted pensar lo que estime oportuno y conveniente porque adem�s a lo mejor acierta, �sea que�");
		frases.add("La cer�mica de Talavera no es cosa menor, dicho de otra forma: es cosa mayor.");
	}
	

	
	/**
	 * Metodo public para exponer en el WSDL,si fuera private no estaria expusto
	 * @return
	 */
	public String llenateDeGloria() {
		
		if(contador==frases.size()) {
			
			contador=0;
		}
		
	
		String frase = frases.get(contador);
		contador++;
		return frase;
	}
	
	
}
