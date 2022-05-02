package com.notebook.contacts.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidad del Contacto
 *
 * @author Luis Romero Cuello <exadom21@gmail.com.co>
 * @version 1.0.0 2022-05-02
 * @since 1.0.0
 *
 * esta clase fue tomada Julian Lasso <julian.lasso@sofka.com.co>
 * modificada a conveniencia
 */
@Data
@Entity
@Table(name = "contacts")
public class Contacto implements Serializable{

    /**
     * Variable usada para manejar el tema del identificador de la tupla (consecutivo)
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identificador de la tupla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * Nombre del contacto
     */
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    /**
     * Telefóno del contacto
     */
    @Column(name = "telephone", nullable = false, length = 50)
    private String telephone;

    /**
     * correo del contacto
     */
    @Column(name = "email", nullable = false, length = 50)
    private String email;

    /**
     * Fecha nacimiento del contacto
     */
    @Column(name = "born")
    private String born;

    /**
     * estado del contacto
     */
    @Column(name = "status", nullable = false, length = 20)
    private String status;

}
