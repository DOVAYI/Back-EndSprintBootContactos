package com.notebook.contacts.service;

import com.notebook.contacts.dao.contactDao;
import com.notebook.contacts.domain.Contacto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;


@Service
public class LibretaService implements ILibreta {


    @Autowired
    private contactDao contactDao;

    @Override
    @Transactional(readOnly = true)
    public Optional<Contacto> findContact(Contacto contact) {
        return contactDao.findById(contact.getId());
    }


    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getList() {

        return (List<Contacto>) contactDao.findAll();
    }


    @Override
    @Transactional
    public Contacto createContact(Contacto contact) {

        return contactDao.save(contact);
    }

    @Transactional
    public void updateName(Integer id, Contacto contact) {

        contactDao.updateName(id, contact.getName());
    }

    @Transactional
    public void updateTelephone(Integer id, Contacto contact) {

        contactDao.updateTelephone(id, contact.getTelephone());
    }

    @Transactional
    public void updateEmail(Integer id, Contacto contact) {

        contactDao.updateEmail(id, contact.getEmail());
    }

    @Transactional
    public void updateBorn(Integer id, Contacto contact) {

        contactDao.updateBorn(id, contact.getBorn());
    }

    @Transactional
    public void updateStatus(Integer id, Contacto contact) {

        contactDao.updateStatus(id, contact.getStatus());
    }


    @Override
    public Contacto updateContact(Integer id, Contacto contact) {
        contact.setId(id);
        return contactDao.save(contact);
    }


    @Override
    public void deleteContact(Contacto contact) {

        contactDao.delete(contact);
    }


}
