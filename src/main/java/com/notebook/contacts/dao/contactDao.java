package com.notebook.contacts.dao;

import com.notebook.contacts.domain.Contacto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Repositorio para la entidad Contacto
 *
 * @author Luis Romero Cuello <exadom21@gmail.com>
 * @version 1.0.0 2022-05-02
 * @since 1.0.0
 *
 * esta clase fue tomada Julian Lasso <julian.lasso@sofka.com.co>
 * modificada a conveniencia
 */
public interface contactDao extends CrudRepository<Contacto, Integer> {
    /**
     * Actualiza el nombre de un contacto basado en su identificador
     *
     * @param id Identificador del contacto
     * @param name Nuevo nombre del contacto
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Modifying
    @Query("update Contacto con set con.name=:name where con.id=:id")
    public void updateName(@Param(value = "id") Integer id,
                           @Param(value = "name") String name);

    /**
     * Actualiza el Telefóno de un contacto basado en su identificador
     *
     * @param id Identificador del contacto
     * @param telephone Nuevo nombre del contacto
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Modifying
    @Query("update Contacto con set con.telephone=:telephone where con.id=:id")
    public void updateTelephone(@Param(value = "id") Integer id,
                                @Param(value = "telephone") String telephone);

    /**
     * Actualiza el correo de un contacto basado en su identificador
     *
     * @param id Identificador del contacto
     * @param email Nuevo nombre del contacto
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Modifying
    @Query("update Contacto con set con.email=:email where con.id=:id")
    public void updateEmail(@Param(value = "id") Integer id,
                            @Param(value = "email") String email);

    /**
     * Actualiza fecha de nacimiento de un contacto basado en su identificador
     *
     * @param id Identificador del contacto
     * @param born Nuevo nombre del contacto
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Modifying
    @Query("update Contacto con set con.born=:born where con.id=:id")
    public void updateBorn(@Param(value = "id") Integer id,
                           @Param(value = "born") String born);

    /**
     * Actualiza el estado de un contacto basado en su identificador
     *
     * @param id Identificador del contacto
     * @param status Nuevo nombre del contacto
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Modifying
    @Query("update Contacto con set con.status=:status where con.id=:id")
    public void updateStatus(@Param(value = "id") Integer id,
                             @Param("status") String status);

    /**
     * selecciona lista de contactos basado estado
     *
     * @param status del contacto
     *
     *
     * @author Luis Romero Cuello <exadom21@gmail.com>
     * @version 1.0.0 2022-05-02
     * @since 1.0.0
     *
     * Fue tomada Julian Lasso <julian.lasso@sofka.com.co>
     * modificada a conveniencia
     */
    @Query("select c from Contacto c where c.status=:status")
    public List<Contacto> getList2(@Param("status") String status);

}
