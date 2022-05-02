package com.notebook.contacts.service;

import com.notebook.contacts.dao.contactDao;
import com.notebook.contacts.domain.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de la libreta
 *
 * @author Luis Romero Cuello <exadom21@gmail.com.co>
 * @version 1.0.0 2022-05-02
 * @since 1.0.0
 *
 * esta clase fue tomada Julian Lasso <julian.lasso@sofka.com.co>
 * modificada a conveniencia
 */
@Service
public class LibretaService implements ILibreta {

    /**
     * Repositorio de Contacto
     */
    @Autowired
    private contactDao contactDao;

    @Override
    @Transactional(readOnly = true)
    public Optional<Contacto> findContact(Contacto contact) {
        return contactDao.findById(contact.getId());
    }

    /**
     * Devuelve una lista de Contactos con todos contactos del sistema
     *
     * @return
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * <p>
     * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getList() {

        return (List<Contacto>) contactDao.findAll();
    }

    /**
     * Devuelve una lista de Contactos solo los activos
     *
     * @return
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     */
    @Transactional(readOnly = true)
    public List<Contacto> getList2() {

        return contactDao.getList2("activado");
    }

    /**
     * Crea un contacto en el sistema
     *
     * @param contact Objeto del contacto a crear
     * @return Objeto del contacto creado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Override
    @Transactional
    public Contacto createContact(Contacto contact) {

        return contactDao.save(contact);
    }

    /**
     * Actualiza el nombre de un contacto
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Transactional
    public void updateName(Integer id, Contacto contact) {

        contactDao.updateName(id, contact.getName());
    }

    /**
     * Actualiza el numero telefóno de un contacto
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Transactional
    public void updateTelephone(Integer id, Contacto contact) {

        contactDao.updateTelephone(id, contact.getTelephone());
    }

    /**
     * Actualiza el Email de un contacto
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Transactional
    public void updateEmail(Integer id, Contacto contact) {

        contactDao.updateEmail(id, contact.getEmail());
    }

    /**
     * Actualiza el nombre de un contacto
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Transactional
    public void updateBorn(Integer id, Contacto contact) {

        contactDao.updateBorn(id, contact.getBorn());
    }

    /**
     * Actualiza el estado de un contacto para aplicar
     * borrado logico
     *
     * @param id      Identificador del contacto a actualizar
     * @param status estado del contacto a "eliminar"
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Transactional
    public void updateStatus(Integer id, String status) {

        contactDao.updateStatus(id, status);
    }

    /**
     * Actualiza una tupla completa de un contacto
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Override
    public Contacto updateContact(Integer id, Contacto contact) {
        contact.setId(id);
        return contactDao.save(contact);
    }

    /**
     * borra una tupla completa de un contacto(borrado fisio)
     *
     * @param id      Identificador del contacto a actualizar
     * @param contact Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @since 1.0.0
     * *
     * * fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * * modificada a conveniencia
     */
    @Override
    public void deleteContact(Contacto contact) {

        contactDao.delete(contact);
    }


}
