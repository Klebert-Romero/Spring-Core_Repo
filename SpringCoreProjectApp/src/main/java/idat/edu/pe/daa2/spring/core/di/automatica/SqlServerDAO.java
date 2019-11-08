package idat.edu.pe.daa2.spring.core.di.automatica;

import org.springframework.stereotype.Repository;

@Repository
public class SqlServerDAO implements DAOBaseI {

	@Override
	public void Conectar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy conectado a un servidor : My SQL Server");

	}

}
