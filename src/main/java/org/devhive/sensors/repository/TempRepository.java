package org.devhive.sensors.repository;

import org.devhive.sensors.model.Temp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<Temp, Long> {

}
