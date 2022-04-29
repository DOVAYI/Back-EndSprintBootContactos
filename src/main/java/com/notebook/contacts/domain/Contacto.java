package com.notebook.contacts.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
@Table(name = "contacts")
public class Contacto implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "name", nullable = false, length = 50)
    private String name;


    @Column(name = "telephone", nullable = false, length = 50)
    private String telephone;


    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "born")
    private String born;

    @Column(name = "status", nullable = false, length = 10)
    private String status;

}
