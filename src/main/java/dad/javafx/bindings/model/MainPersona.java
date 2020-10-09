package dad.javafx.bindings.model;

import java.time.LocalDate;

public class MainPersona {

	public static void main(String[] args) {
		PersonaFX andres = new PersonaFX();
		andres.setNombre("Andrés");
		andres.setSexo(Sexo.HOMBRE);
		andres.setFechaNacimiento(LocalDate.of(1997, 10, 2));
		
		System.out.println(andres.getEdad());
		
		andres.setFechaNacimiento(LocalDate.of(1995, 10, 2));

		System.out.println(andres.getEdad());
		
	}

}
