package com.projetEnsa.gestionAbsence.repositories;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetEnsa.gestionAbsence.entities.Administrateur;

@Repository // implémenter les couches d'accès aux données (@Repository qui communique avec  la base de donnée)
public interface UserRepository extends CrudRepository<Administrateur, Integer> {

	Administrateur findByEmailAdmin(String emailAdmin);

	Administrateur findByUserId(String userId);
}
