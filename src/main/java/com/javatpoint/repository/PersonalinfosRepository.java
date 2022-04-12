package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Personalinfos;

public interface PersonalinfosRepository extends CrudRepository <Personalinfos, Long> {

}
