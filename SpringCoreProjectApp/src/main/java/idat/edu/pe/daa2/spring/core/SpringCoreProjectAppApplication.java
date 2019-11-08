package idat.edu.pe.daa2.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import idat.edu.pe.daa2.spring.core.di.automatica.PagoAgencia;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoAgente;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoI;
import idat.edu.pe.daa2.spring.core.di.automatica.PagoInternet;
import idat.edu.pe.daa2.spring.core.di.tradicional.Automovil;
import idat.edu.pe.daa2.spring.core.di.tradicional.Tractor;
import idat.edu.pe.daa2.spring.core.di.tradicional.VehiculoI;
import idat.edu.pe.daa2.spring.core.di.tradicional.ViajarVehiculo;
import idat.edu.pe.daa2.spring.core.ioc.SaludoEspannol;
import idat.edu.pe.daa2.spring.core.ioc.SaludoI;
import idat.edu.pe.daa2.spring.core.ioc.SaludoIngles;
import idat.edu.pe.daa2.spring.core.ioc.SaludoPortugues;

@SpringBootApplication
public class SpringCoreProjectAppApplication {

	public static void main(String[] args) {
		
		
		//String nombre = "Christian Castillo";
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreProjectAppApplication.class, args);
		
		/*PagoI servicioPago = ctx.getBean(PagoInternet.class);
		
		servicioPago.realizarPago();
		
		SaludoI saludo1 = (SaludoEspannol)cxt.getBean("saludoEspannol");
		System.out.println("saludo 1 en español : " + saludo1.saludar(nombre));		
				
	    SaludoI saludo2 = (SaludoIngles)cxt.getBean("saludoIngles");
	    System.out.println("saludo 2 en ingles : " + saludo2.saludar(nombre));		
	    
	    SaludoI saludo3 = (SaludoPortugues)cxt.getBean("saludoBrasilero");
	    System.out.println("saludo 3 en portugues : " + saludo3.saludar(nombre));*/
		
		/*ViajarVehiculo viaje = new ViajarVehiculo();
		
		// Viajando en Automovil
		viaje.setVehiculo(cxt.getBean(Automovil.class));
		viaje.empezarAcelerar();
		
		// Viajando en motocicleta
		viaje.setVehiculo((VehiculoI)cxt.getBean("motocicleta"));
		viaje.empezarAcelerar();
		
		// Viajado en Scooter
		viaje.setVehiculo((VehiculoI)cxt.getBean("miPatin"));
		viaje.empezarAcelerar();
		
		// Viajando en Tractor
		viaje.setVehiculo(cxt.getBean(Tractor.class));
		viaje.empezarAcelerar();*/
		
		/*PagoI servicioPago2 = ctx.getBean(PagoAgencia.class);
		servicioPago2.realizarPago();*/
		
		PagoI servicioPago3 = ctx.getBean(PagoAgente.class);
		servicioPago3.realizarPago();
		
		
	}

}
