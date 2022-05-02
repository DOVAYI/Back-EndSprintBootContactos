package com.notebook.contacts.controller;

import java.util.List;
import com.notebook.contacts.domain.Contacto;
import com.notebook.contacts.service.LibretaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Controlador para la libreta
 *
 * @author Luis Romero Cuello <exadom21@gmail.com>
 * @version 1.0.0 2022-05-02
 * @since 1.0.0
 *
 * esta clase fue tomada Julian Lasso <julian.lasso@sofka.com.co>
 * modificada a conveniencia
 */
@RestController
public class ContatsRutes {

    /**
     * Servicio para el manejo de la libreta
     */
    @Autowired
    private LibretaService libretaService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/contacts")
    public List<Contacto> index() {
        return libretaService.getList();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/")
    public List<Contacto> index2() {

        return libretaService.getList2();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/contact")
    public ResponseEntity<Contacto> create(@RequestBody Contacto contact) {

        libretaService.createContact(contact);

        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<Contacto> delete(Contacto contact) {

        libretaService.deleteContact(contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<Contacto> update(
            @RequestBody Contacto contact, @PathVariable("id") Integer id) {

        libretaService.updateContact(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @PatchMapping(path = "/contact/name/{id}")
    public ResponseEntity<Contacto> updateName(
            Contacto contact, @PathVariable("id") Integer id) {
        libretaService.updateName(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/telephone/{id}")
    public ResponseEntity<Contacto> updateTelephone(
            Contacto contact, @PathVariable("id") Integer id) {
        libretaService.updateTelephone(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<Contacto> updateEmail(
            Contacto contact, @PathVariable("id") Integer id) {
        libretaService.updateEmail(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/born/{id}")
    public ResponseEntity<Contacto> updateBorn(
            Contacto contact, @PathVariable("id") Integer id) {
        libretaService.updateBorn(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PatchMapping(path = "/contact/status/{id}")
    public ResponseEntity<String> updateStatus(
            @PathVariable("id") Integer id) {
        libretaService.updateStatus(id, "desactivado");
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
