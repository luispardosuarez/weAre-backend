package dev.luispardo.wearepeoplesoftware.controller;

import dev.luispardo.wearepeoplesoftware.Solicitud;
import dev.luispardo.wearepeoplesoftware.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @PostMapping
    public ResponseEntity<Solicitud> createSolicitud(@RequestBody Solicitud solicitud) {
        Solicitud newSolicitud = solicitudService.save(solicitud);
        return new ResponseEntity<>(newSolicitud, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Solicitud> getAllSolicitudes() {
        return solicitudService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Solicitud> updateSolicitud(@PathVariable Long id, @RequestBody Solicitud solicitud) {
        Solicitud updatedSolicitud = solicitudService.update(solicitud);
        return new ResponseEntity<>(updatedSolicitud, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSolicitud(@PathVariable Long id) {
        solicitudService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
