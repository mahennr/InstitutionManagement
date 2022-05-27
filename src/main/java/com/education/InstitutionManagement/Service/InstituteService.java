package com.education.InstitutionManagement.Service;

import com.education.InstitutionManagement.Repository.InstituteRepository;
import com.education.InstitutionManagement.Entity.Institute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituteService {
    // This means to get the bean which is auto-generated by Spring,We will use it to handle the data
    @Autowired
    InstituteRepository myInstRepo;

    //	get all Institutions info
    public List<Institute> getAllInstitutions() {
        return myInstRepo.findAll();
    }

    // get Institution by Id
    public Institute getInstitutionById(Integer instId)
    {
        return myInstRepo.findById(instId).orElse(null);
    }

    // save an Institution
    public void saveInstitution(Institute myInst) {
        myInstRepo.save(myInst);
    }

    //delete institution by Id
    public void deleteInstById(Integer instId) {
        if (instId == null) {
            throw new RuntimeException("Institution not found");
        }
        myInstRepo.deleteById(instId);
    }
   /* // get Institution by Name
   public Institute getInstitutionByName(String instName){
        return myInstRepo.findByInstitutionName(instName);
    }

    // get Institution by Location
    public Institute getInstitutionByLocation(String instLocation) {
        return myInstRepo.findByInstitutionLocation(instLocation);
    }*/
}

