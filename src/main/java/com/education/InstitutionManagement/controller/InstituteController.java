package com.education.InstitutionManagement.controller;

import com.education.InstitutionManagement.Service.InstituteService;
import com.education.InstitutionManagement.entity.Institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/institute_api")
public class InstituteController {
    @Autowired
    public InstituteService instituteService;

    // Get all Institutions
    @GetMapping(value="/get_all_institutions")
    public List<Institute> getAllInstitutions(){
        return instituteService.getAllInstitutions();
    }

    @GetMapping(value="/{instituteId}")
    public Optional<Institute> getInstituteById(@PathVariable Integer instituteId) {
        return instituteService.getInstitutionById(instituteId);
    }

    @PostMapping(value = "/createInst")
    public void create(@RequestBody Institute myInst) {
            instituteService.saveInstitution(myInst);
    }

    @PutMapping(value="/updateInst")
    public void update(@RequestBody Institute myInst) {
        instituteService.saveInstitution(myInst);
    }

    @DeleteMapping(value="/delete/{id}")
    public void deleteInstById(@PathVariable Integer id) {
        instituteService.deleteInstById(id);
       // return "ID: " + id;
        // Added to git hub
    }
}

