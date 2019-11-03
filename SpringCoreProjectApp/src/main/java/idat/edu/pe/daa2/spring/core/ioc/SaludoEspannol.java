package idat.edu.pe.daa2.spring.core.ioc;

import org.springframework.stereotype.Component;

@Component
public class SaludoEspannol implements SaludoI {

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Buenas noches mi amigo" + nombre;
	}

}
