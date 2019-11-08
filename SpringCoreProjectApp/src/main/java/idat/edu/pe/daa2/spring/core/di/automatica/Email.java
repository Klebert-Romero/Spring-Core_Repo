package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.stereotype.Component;

@Component
public class Email implements ComunicacionI {

	@Override
	public void enviar() {
		// TODO Auto-generated method stub
		System.out.println("Enviando Email.....   ");
	}

}
