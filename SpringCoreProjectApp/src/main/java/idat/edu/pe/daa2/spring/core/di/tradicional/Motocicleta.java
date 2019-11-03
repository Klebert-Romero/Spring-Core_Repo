package idat.edu.pe.daa2.spring.core.di.tradicional;

import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements VehiculoI {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Viajando en una Moto");
	}

}
