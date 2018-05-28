package operacion;

import clase.Pedido;

public class Interpretacion implements Operacion{

	private Operacion siguiente;

	@Override
	public void siguiente(Operacion siguiente) {
		this.siguiente = siguiente;	
		
	}
	public Interpretacion() {
		Operacion NoDirigidoAsistente = new NoDirigidoAsistente();
		Operacion Saludar = new Saludar();
		Operacion Agradecer = new Agradecer();
		Operacion FechaActual = new FechaActual();
		Operacion FechaNoActual = new FechaNoActual();
		Operacion Calculo = new Calculo();
		Operacion Juego = new Juego();
		Operacion Convertir = new Convertir();
		Operacion LeyesRobotica = new LeyesRobotica();
		Operacion ChuckNorrisFacts = new ChuckNorrisFacts();
		Operacion Default = new Default();
		
		
		this.siguiente(NoDirigidoAsistente);
		NoDirigidoAsistente.siguiente(Saludar);
		Saludar.siguiente(Agradecer);
		Agradecer.siguiente(FechaActual);
		FechaActual.siguiente(FechaNoActual);		
		FechaNoActual.siguiente(Calculo);
		Calculo.siguiente(Juego);
		Juego.siguiente(Convertir);
		Convertir.siguiente(LeyesRobotica);
		LeyesRobotica.siguiente(ChuckNorrisFacts);
		ChuckNorrisFacts.siguiente(Default);
	}

	@Override
	public String calcular(Pedido pedido) {	
		return siguiente.calcular(pedido);
	}

}
