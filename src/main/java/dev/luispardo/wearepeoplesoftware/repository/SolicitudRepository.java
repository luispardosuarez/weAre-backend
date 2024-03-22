package dev.luispardo.wearepeoplesoftware.repository;

import dev.luispardo.wearepeoplesoftware.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
   
}