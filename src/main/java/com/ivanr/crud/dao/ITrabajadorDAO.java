package com.ivanr.crud.dao;

import com.ivanr.crud.entidades.Trabajador;
import org.springframework.data.repository.CrudRepository;

public interface ITrabajadorDAO extends CrudRepository<Trabajador, Long> {
}
