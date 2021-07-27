package com.ivanr.crud.controladores;

import com.ivanr.crud.dao.ITrabajadorDAO;
import com.ivanr.crud.dto.TrabajadorDTO;
import com.ivanr.crud.entidades.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {

    @Autowired
    private ITrabajadorDAO trabajadorRepository;

    @GetMapping("/trabajadores")
    public ResponseEntity devolverTrabajadores() {
        return new ResponseEntity(trabajadorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/trabajadores/{id}")
    public ResponseEntity devolverTrabajador(@PathVariable(value = "id") long trabajadorId) {
        return new ResponseEntity(trabajadorRepository.findById(trabajadorId), HttpStatus.OK);
    }

    @PostMapping("/trabajadores")
    public ResponseEntity crearTrabajador(@RequestBody TrabajadorDTO trabajadorDTO) {
        Trabajador t = new Trabajador();
        t.setNombre(trabajadorDTO.getNombre());
        t.setApellido(trabajadorDTO.getApellido());
        t.setTelefono(trabajadorDTO.getTelefono());
        t.setEmail(trabajadorDTO.getEmail());
        return new ResponseEntity(this.trabajadorRepository.save(t), HttpStatus.CREATED);
    }

    @DeleteMapping("/trabajadores/{id}")
    public ResponseEntity eliminarTrabajador(@PathVariable(value = "id") long trabajadorId) {
        trabajadorRepository.deleteById(trabajadorId);
        return new ResponseEntity("Eliminado", HttpStatus.OK);
    }

    @PutMapping("/trabajadores/{id}")
    public ResponseEntity modificarTrabajador(@PathVariable(value = "id") long trabajadorId,
                                              @RequestBody TrabajadorDTO trabajadorDTO)
            throws Exception{
        Trabajador t = this.trabajadorRepository.findById(trabajadorId).orElseThrow(() -> new Exception("Recurso no encontrado"));
        t.setNombre(trabajadorDTO.getNombre());
        t.setApellido(trabajadorDTO.getApellido());
        t.setTelefono(trabajadorDTO.getTelefono());
        t.setEmail(trabajadorDTO.getEmail());
        final Trabajador trabajadorActualizado = this.trabajadorRepository.save(t);
        return new ResponseEntity(trabajadorActualizado, HttpStatus.OK);
    }

}