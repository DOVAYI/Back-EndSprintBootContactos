package com.notebook.contacts.dao;

import com.notebook.contacts.domain.Contacto;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface contactDao extends CrudRepository<Contacto, Integer> {

    @Modifying
    @Query("update Contacto con set con.name=:name where con.id=:id")
    public void updateName(@Param(value = "id") Integer id,
                           @Param(value = "name") String name);

    @Modifying
    @Query("update Contacto con set con.telephone=:telephone where con.id=:id")
    public void updateTelephone(@Param(value = "id") Integer id,
                                @Param(value = "telephone") String telephone);

    @Modifying
    @Query("update Contacto con set con.email=:email where con.id=:id")
    public void updateEmail(@Param(value = "id") Integer id,
                            @Param(value = "email") String email);

    @Modifying
    @Query("update Contacto con set con.born=:born where con.id=:id")
    public void updateBorn(@Param(value = "id") Integer id,
                           @Param(value = "born") String born);

    @Modifying
    @Query("update Contacto con set con.status=:status where con.id=:id")
    public void updateStatus(@Param(value = "id") Integer id,
                             @Param(value = "status") String status);

}
