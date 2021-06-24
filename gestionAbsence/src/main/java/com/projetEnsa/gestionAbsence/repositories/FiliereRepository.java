package com.projetEnsa.gestionAbsence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.projetEnsa.gestionAbsence.entities.Filliere;

@Repository
public interface FiliereRepository extends CrudRepository<Filliere, Long> {
	//FiliereEntity FindByLibelleFilliere(String LibelleFilliere);
	Filliere findById(long id);

}
