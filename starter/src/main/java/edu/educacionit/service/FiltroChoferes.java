package edu.educacionit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.educacionit.model.Chofer;
import edu.educacionit.repository.Choferes;

//tanto repository como service funcionan como @Component, pero son mas descriptivos
@Service
public class FiltroChoferes {

	private Choferes choferes;

	
	@Autowired
	public FiltroChoferes(Choferes choferes) {
		this.choferes = choferes;
	}

	public List<Chofer> getChoferesQueLesGustaSuTrabajoConAccidentes() {
		List<Chofer> choferesdevolver = new ArrayList<>();
		for (Chofer cho : choferes.getChoferes()) {
			if (cho.isLesGustaSuTrabajo()) {
				if (cho.getCantAccidentes() > 0) {
					choferesdevolver.add(cho);
				}
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Choferes que les gusta su trabajo y tuvieron accidentes:");
		mostrarChoferes(choferesdevolver);
		return choferesdevolver;
	}

	public List<Choferes> getChoferesQueNoLesGustaSuTrabajoConAccidentes() {
		List<Chofer> choferesdevolver = new ArrayList<>();
		for (Chofer cho : choferes.getChoferes()) {
			if (!cho.isLesGustaSuTrabajo()) {
				if (cho.getCantAccidentes() > 0) {
					choferesdevolver.add(cho);
				}
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Choferes que no les gusta su trabajo y tuvieron accidentes:");
		mostrarChoferes(choferesdevolver);
		return null;
	}

	public List<Choferes> getChoferesQueLesGustaSuTrabajoSinAccidentes() {
		List<Chofer> choferesdevolver = new ArrayList<>();
		for (Chofer cho : choferes.getChoferes()) {
			if (cho.isLesGustaSuTrabajo()) {
				if (!(cho.getCantAccidentes() > 0)) {
					choferesdevolver.add(cho);
				}
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Choferes que les gusta su trabajo y no tuvieron accidentes:");
		mostrarChoferes(choferesdevolver);
		return null;
	}

	public List<Choferes> getChoferesQueNoLesGustaSuTrabajoSinAccidentes() {

		List<Chofer> choferesdevolver = new ArrayList<>();
		for (Chofer cho : choferes.getChoferes()) {
			if (!cho.isLesGustaSuTrabajo()) {
				if (!(cho.getCantAccidentes() > 0)) {
					choferesdevolver.add(cho);
				}
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("Choferes que no les gusta su trabajo y no tuvieron accidentes:");
		mostrarChoferes(choferesdevolver);
		return null;
	}

	public void mostrarChoferes(List<Chofer> choferes) {
		for (Chofer cho : choferes) {
			
			System.out.println("Nombre: " + cho.getNombre());
			System.out.println("Apellido: " + cho.getApellido());
			System.out.println("Cant de Accidentes: " + cho.getCantAccidentes());
			System.out.println("ID: "+cho.getId());
			System.out.println("------------------------------------------------");
		}
	}

}// Fin de Clase
