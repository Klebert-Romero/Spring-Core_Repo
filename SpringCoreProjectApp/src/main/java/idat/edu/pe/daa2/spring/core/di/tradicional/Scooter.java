package idat.edu.pe.daa2.spring.core.di.tradicional;

import org.springframework.stereotype.Component;

@Component(value = "miPatin")
public class Scooter implements VehiculoI {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Viajando en un Patin");
		
	}

}
