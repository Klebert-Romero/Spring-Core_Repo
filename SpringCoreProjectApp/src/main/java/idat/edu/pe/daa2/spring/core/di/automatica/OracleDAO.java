package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class OracleDAO implements DAOBaseI {

	@Override
	public void Conectar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy conectado a un servidor : Oracle");

	}

}
