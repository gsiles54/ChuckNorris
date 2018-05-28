package operacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import clase.Pedido;

public class ChuckNorrisFacts implements Operacion{

	private Operacion siguiente;
	private int i=0;
	
	@Override
	public void siguiente(Operacion siguiente) {
		this.siguiente = siguiente;		
	}


	@Override
	public String calcular(Pedido pedido) {
		String regex = ".*(?:chuck|chuck norris|norris|fact).*";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		Matcher matcher = pattern.matcher(pedido.getMensaje());
		while(matcher.find()) {
			if(matcher.matches()) {
				return pickChuckFact();
			}
		}
		return siguiente.calcular(pedido);
		// TODO Auto-generated method stub
								
		//	return resultado;
	}
	
	private String pickChuckFact() {
		String[] facts = {"Chuck Norris puede desreferenciar null.",
						  "Chuck Norris una vez se comio un cubo de rubik, y lo cago resuelto.",
						  "Chuck Norris termino un loop infinito.",
						  "Chuck Norris puede hacer un testear una apliacion entera en un solo Assert.",
						  "Chuck Norris puede acceder a metodos privados.",
						  "Chuck Norris construyo el hospital donde nacio.",
						  "El pulso de Chuck Norris se mide en la escala Ritcher.",
						  "Chuck Norris gano una ruleta rusa con el cargador entero.",
						  "Chuck Norris puede dividir por 0",
						  "Chuck Norris puede recordar el futuro.",
						  "El codigo ejecuta mas rapido cuando Chuck Norris lo mira.",
						  "Chuck Norris puede hacer fuego usando dos cubos de hielo."};
		
		
		if(i<facts.length) {
			return facts[i++];
		}else {
			i=0;
			return facts[0];
		}
		
	}

}
