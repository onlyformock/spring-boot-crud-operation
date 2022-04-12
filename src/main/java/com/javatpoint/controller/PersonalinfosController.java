package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Personalinfos;
import com.javatpoint.service.PersonalinfosService;

@RestController
public class PersonalinfosController {
@Autowired
PersonalinfosService personalinfosService;
@GetMapping("/personalinfo")
private List<Personalinfos> getAllPersonalinfos()
{
return personalinfosService.getAllPersonalinfos();
}
//creating a get mapping that retrieves the detail of a specific pinfo
@GetMapping("/personalinfo/{phonenoid}")
private Personalinfos getPersonalinfos(@PathVariable("phonenoid") long phonenoid)
{
return personalinfosService.getPersonalinfosById(phonenoid);
}
@PostMapping("/personalinfos")
private long savePersonalinfo(@RequestBody Personalinfos personalinfos)
{
personalinfosService.saveOrUpdate(personalinfos);
return personalinfos.getPhonenoid();
}
}