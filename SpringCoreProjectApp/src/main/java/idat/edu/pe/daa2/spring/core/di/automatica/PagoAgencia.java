package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoAgencia implements PagoI {
	
	@Autowired
	public DAOBaseI repositorio;

	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		
		repositorio.Conectar();

	}

}
