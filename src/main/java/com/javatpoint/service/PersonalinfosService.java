package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Personalinfos;
import com.javatpoint.repository.PersonalinfosRepository;

@Service
public class PersonalinfosService {
@Autowired
PersonalinfosRepository personalinfosRepository;
//getting all books record by using the method findaAll() of CrudRepository
public List<Personalinfos> getAllPersonalinfos() 
{
List<Personalinfos> personalinfos = new ArrayList<Personalinfos>();
personalinfosRepository.findAll().forEach(personalinfos1 -> personalinfos.add(personalinfos1));
return personalinfos;
}
//getting a specific record by using the method findById() of CrudRepository
public Personalinfos getPersonalinfosById(long id) 
{
return personalinfosRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Personalinfos personalinfos) 
{
personalinfosRepository.save(personalinfos);
}
}
