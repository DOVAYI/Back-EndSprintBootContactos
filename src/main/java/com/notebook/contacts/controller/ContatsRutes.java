package com.notebook.contacts.controller;

import com.notebook.contacts.domain.Contacto;
import com.notebook.contacts.service.LibretaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController

public class ContatsRutes {

    @Autowired
    private LibretaService libretaService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/contact/contacts")
    public List<Contacto> index() {
        return libretaService.getList();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/contact")
    public ResponseEntity<Contacto> create(@RequestBody Contacto contact) {

        libretaService.createContact(contact);

        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<Contacto> delete(  Contacto contact) {

        libretaService.deleteContact(contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<Contacto> update(Contacto contact,
                                           @PathVariable("id") Integer id) {

        libretaService.updateContact(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @PatchMapping(path = "/contact/name/{id}")
    public ResponseEntity<Contacto> updateName(Contacto contact,
                                               @PathVariable("id") Integer id) {
        libretaService.updateName(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/telephone/{id}")
    public ResponseEntity<Contacto> updateTelephone(Contacto contact,
                                                    @PathVariable("id") Integer id) {
        libretaService.updateTelephone(id, contact);

        return new ResponseEntity<>(contact, HttpStatus.OK);

    }

    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<Contacto> updateEmail(Contacto contact,
                                                @PathVariable("id") Integer id) {
        libretaService.updateEmail(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/born/{id}")
    public ResponseEntity<Contacto> updateBorn(Contacto contact,
                                               @PathVariable("id") Integer id) {
        libretaService.updateBorn(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/status/{id}")
    public ResponseEntity<Contacto> updateStatus(Contacto contact,
                                                 @PathVariable("id") Integer id) {
        libretaService.updateStatus(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }


}
