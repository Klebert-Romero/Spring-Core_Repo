package idat.edu.pe.daa2.spring.core.ioc;

import org.springframework.stereotype.Component;

@Component(value="saludoBrasilero")
public class SaludoPortugues implements SaludoI {

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Boa noite me amigo : " + nombre;
	}

}
