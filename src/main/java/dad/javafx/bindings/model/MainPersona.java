package dad.javafx.bindings.model;

import java.time.LocalDate;

public class MainPersona {

	public static void main(String[] args) {
		
		PersonaFX andres = new PersonaFX();
		andres.setNombre("Andrés");
		andres.setSexo(Sexo.HOMBRE);
		
		andres.edadProperty().addListener((o, ov, nv) -> System.out.println("edad=" + nv));
		andres.nombreCompletoProperty().addListener((o, ov, nv) -> System.out.println("nombre completo=" + nv));
		

		andres.setFechaNacimiento(LocalDate.of(1995, 10, 2));
		
		andres.setFechaNacimiento(LocalDate.of(1997, 10, 2));

		System.out.println(andres.getNombreCompleto());
		
		andres.setApellidos("González");
		
		System.out.println(andres.getNombreCompleto());
	}

}
