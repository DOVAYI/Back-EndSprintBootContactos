package com.notebook.contacts.service;

import com.notebook.contacts.domain.Contacto;

import java.util.List;
import java.util.Optional;


public interface ILibreta {

    //ojo Contacto es del domain
    public List<Contacto> getList();

    public Contacto createContact(Contacto contacto);

    public Contacto updateContact(Integer id, Contacto contacto);

    public void deleteContact(Contacto contact);

    public Optional<Contacto> findContact(Contacto contact);


}
