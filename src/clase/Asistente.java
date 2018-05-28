package clase;

import operacion.Interpretacion;

//public class Asistente extends Interpretar{
public class Asistente{
	
	private static final String USUARIO = "delucas";
	private String nameAsistente;
	private String nameUsuario = "@"+USUARIO;
	private Interpretacion interpretacion=null;
	
	public Asistente(String nameAsistente) {
		this.nameAsistente = "@"+nameAsistente;
		 interpretacion = new Interpretacion();
	}
	
	public String escuchar(String mensaje) {
		
		Pedido pedido = new Pedido(mensaje, nameUsuario, nameAsistente);
		return interpretacion.calcular(pedido);
	}

}
