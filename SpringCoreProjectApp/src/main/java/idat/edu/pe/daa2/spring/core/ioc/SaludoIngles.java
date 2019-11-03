package idat.edu.pe.daa2.spring.core.ioc;

import org.springframework.stereotype.Component;

@Component
public class SaludoIngles implements SaludoI {

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Good night my buddy : " + nombre;
	}

}
