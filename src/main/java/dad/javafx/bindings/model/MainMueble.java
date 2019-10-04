package dad.javafx.bindings.model;

import java.time.LocalDate;

public class MainMueble {

	public static void main(String[] args) {
		MuebleFX mecedora = new MuebleFX();
		mecedora.setFabricante("Conforama");
		mecedora.setModelo("Mecedora Súper 2000");
		mecedora.setTipo(TipoMueble.SILLA);
		mecedora.setFechaFabricacion(LocalDate.of(1990, 8, 15));
		
		System.out.println(mecedora.getFabricante());
		System.out.println(mecedora.getAntiguedad());
	}

}
