package edu.educacionit.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import edu.educacionit.model.Chofer;

//tanto repository como service funcionan como @Component, pero son mas descriptivos
@Repository
public class Choferes {


	private List<Chofer> choferes;

	public List<Chofer> getChoferes() {

		return choferes;
	}

	public void addChofer(Chofer cho) {
		choferes.add(cho);
	}

	public Choferes() {
		choferes = new ArrayList<Chofer>();
		
		Chofer cho1 = new Chofer();
		cho1.setApellido("Perez");
		cho1.setNombre("Juan");
		cho1.setCantAccidentes(0);
		cho1.setLesGustaSuTrabajo(false);
		choferes.add(cho1);
		
		Chofer cho2 = new Chofer();
		cho2.setApellido("Pastor");
		cho2.setNombre("Jaminez");
		cho2.setCantAccidentes(0);
		cho2.setLesGustaSuTrabajo(true);
		choferes.add(cho2);
		
		Chofer cho3 = new Chofer();
		cho3.setApellido("Pereira");
		cho3.setNombre("Juan");
		cho3.setCantAccidentes(28);
		cho3.setLesGustaSuTrabajo(false);
		choferes.add(cho3);
		
		Chofer cho4 = new Chofer();
		cho4.setApellido("Dominguez");
		cho4.setNombre("Domingo");
		cho4.setCantAccidentes(30);
		cho4.setLesGustaSuTrabajo(true);
		choferes.add(cho4);
		

		Chofer cho5 = new Chofer();
		cho5.setApellido("Ramirez");
		cho5.setNombre("Pedro");
		cho5.setCantAccidentes(30);
		cho5.setLesGustaSuTrabajo(false);
		choferes.add(cho5);
		

		Chofer cho6 = new Chofer();
		cho6.setApellido("Dirext");
		cho6.setNombre("Domacio");
		cho6.setCantAccidentes(0);
		cho6.setLesGustaSuTrabajo(true);
		choferes.add(cho6);
		

		Chofer cho7 = new Chofer();
		cho7.setApellido("Ramirez");
		cho7.setNombre("Domingo");
		cho7.setCantAccidentes(0);
		cho7.setLesGustaSuTrabajo(false);
		choferes.add(cho7);
		

		Chofer cho8 = new Chofer();
		cho8.setApellido("Zangano");
		cho8.setNombre("Zinhuenai");
		cho8.setCantAccidentes(24);
		cho8.setLesGustaSuTrabajo(false);
		choferes.add(cho8);
	}

}
