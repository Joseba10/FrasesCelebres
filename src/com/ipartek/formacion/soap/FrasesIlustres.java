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
		frases.add("Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para mí el suyo, beneficio político.");
		frases.add("Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.");
		frases.add("España es una gran nación y los españoles muy españoles y mucho españoles.");
		frases.add("¿Ustedes piensan antes de hablar o hablan tras pensar?");
		frases.add("Quiero transmitir a los españoles un mensaje de esperanza. ETA es una gran nación; España, perdón, es una gran nación.");
		frases.add("Las decisiones se toman en el momento de tomarse.");
		frases.add("A veces la mejor decisión es no tomar ninguna decisión, que también es tomar una decisión.");
		frases.add("Vamos a ver, eeeh, uuum… ¿Medidas para crear empleo? Bueno, la verdad es que me ha pasado una cosa verdaderamente notable, que lo he escrito aquí y no entiendo mi letra.");
		frases.add("Como decía Galileo, el movimiento siempre se acelera cuando se va a detener.");
		frases.add("A veces estamos pensando siempre en lo material, y al final los seres humanos somos sobre todo personas.");
		frases.add("Tenemos que fabricar máquinas que nos permitan seguir fabricando máquinas, porque lo que no van a hacer nunca las máquinas es fabricar máquinas a su vez.");
		frases.add("No es lo mismo que gobierne uno que que gobierne otro. No es lo mismo. Dicho de otra manera: es muy distinto, muy diferente.");
		frases.add("Todo lo que se refiere a mí y a los compañeros del partido no es cierto, salvo alguna cosa que han publicado los medios.");
		frases.add("Me gustan los catalanes porque hacen cosas.");
		frases.add("Da gusto hablar bien de quien se merece que hablen bien de uno, y de aquel del que uno quiere hablar bien porque se lo merece.");
		frases.add("Tanto el laicismo como los fundamentalismos religiosos son enemigos de la libertad y, si logran imponerse, conducen inexorablemente al totalitarismo.");
		frases.add("Siempre estaré detrás de ti, o delante, o a un lado.");
		frases.add("Quiero decir sí a los chiringuitos. Nos gustan los chiringuitos. Queremos los chiringuitos. Forman parte de nuestro ser, y mientras este partido exista, habrá chiringuitos en Málaga y en Pontevedra también.");
		frases.add("Esto no es como el agua que cae del cielo, sin que se sepa exactamente por qué.");
		frases.add("Cuanto más sepáis de todo, mejor. Por saber muchísimo no os va a pasar nada malo, luego ya veremos. Si uno es ingeniero o futbolista, se le abren todas las puertas del mundo.");
		frases.add("Por las carreteras tienen que ir coches y de los aeropuertos tienen que salir aviones.");
		frases.add("Yo de este asunto sé poco, pero mi primo, que supongo que sabrá, claro, y entonces dijo: “Oiga, he traído aquí a diez de los más importantes científicos del mundo, y ninguno me ha garantizado el tiempo que iba a hacer mañana en Sevilla”. ¿Cómo alguien puede decir lo que va a pasar en el mundo dentro de 300 años?” No lo sé, es decir, no lo sé; es un asunto al hay que estar muy atentos pero, en fin, tampoco lo podemos convertir en el gran problema mundial. Hay otros problemas más importantes, como los problemas del sector energético, los problemas de las emisiones y otros problemas muy importantes.");
		frases.add("Una España a la que 75 millones de españoles vienen cada año. Por algo será.");
		frases.add("Yo prefiero no subir el IVA en 2013 pero también le digo que si en ese momento es bueno subir el IVA lo haré y haré cualquier cosa aunque no me guste y haya dicho que no lo voy a hacer.");
		frases.add("Una cosa es ser solidario, y otra es serlo a cambio de nada.");
		frases.add("Si hay una agencia o alguien que dice que este fin de semana vamos a pedir el rescate como dicen ellos, caben dos posibilidades, que esa agencia tenga razón y mejor información que yo, lo cual es muy posible, o que no sea así, lo cual pues a lo mejor también es posible o no que más da. Pero si a usted le sirve de algo lo que yo pueda decirle y si le parece lo que yo pueda decirle es más importante que esa filtración, le diré que no; pero vamos aún así puede usted pensar lo que estime oportuno y conveniente porque además a lo mejor acierta, ósea que…");
		frases.add("La cerámica de Talavera no es cosa menor, dicho de otra forma: es cosa mayor.");
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
