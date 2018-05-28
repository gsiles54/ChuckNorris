package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clase.Asistente;

public class RFTestChuck {

	public final static String USUARIO = "delucas";

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}
	
	@Test
	public void testChuck() {
		String[] mensajes = {
				"¿me decis algo de Chuck Norris, @jenkins?",
				"@jenkins, tirame un dato del chuck",
				"decite algo del norris @jenkins?"
		};
		
			Assert.assertEquals(
					 "Chuck Norris puede desreferenciar null.",
					jenkins.escuchar(mensajes[0])
			);
			Assert.assertEquals(
					 "Chuck Norris una vez se comio un cubo de rubik, y lo cago resuelto.",
					jenkins.escuchar(mensajes[1])
			);
			Assert.assertEquals(
					 "Chuck Norris termino un loop infinito.",
					jenkins.escuchar(mensajes[2])
			);
	
		
	}
}
