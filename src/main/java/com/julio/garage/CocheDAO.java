package com.julio.garage;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.julio.garage.Coche;

@RepositoryRestResource (path="/coches")
public interface CocheDAO extends JpaRepository<Coche, Integer> {
	List<Coche> findCocheByMarca (String marca);

}
