package com.notebook.contacts.service;

import com.notebook.contacts.domain.Contacto;
import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de Libreta
 *
 * @author Luis Romero Cuello <exadom21@gmail.com.co>
 * @version 1.0.0 2022-05-02
 * @since 1.0.0
 *
 * esta interfaz fue tomada Julian Lasso <julian.lasso@sofka.com.co>
 * modificada a conveniencia
 */


public interface ILibreta {

    //ojo Contacto es del domain
    /**
     * Devuelve una lista de Contactos con todos contactos del sistema
     *
     * @return
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     *  fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    public List<Contacto> getList();
    /**
     * Crea un contacto en el sistema
     *
     * @param contacto Objeto del contacto a crear
     * @return Objeto del contacto creado
     *
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     *  fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    public Contacto createContact(Contacto contacto);
    /**
     * Actualiza una tupla completa de un contacto
     *
     * @param id Identificador del contacto a actualizar
     * @param contacto Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     *
     * @author Luis Romero Cuello <exadom21@gmail.com.co>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     *  fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    public Contacto updateContact(Integer id, Contacto contacto);

    /**
     * Borra un contacto del sistema
     *
     * @param contact  contacto a borrar
     * @return Objeto del contacto borrado
     *
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public void deleteContact(Contacto contact);

    public Optional<Contacto> findContact(Contacto contact);


}
