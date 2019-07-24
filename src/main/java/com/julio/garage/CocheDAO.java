package com.julio.garage;

import org.springframework.data.jpa.repository.JpaRepository;
import com.julio.garage.Coche;

public interface CocheDAO extends JpaRepository<Coche, Integer> {

}
