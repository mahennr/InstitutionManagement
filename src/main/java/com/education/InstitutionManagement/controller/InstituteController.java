package com.education.InstitutionManagement.Controller;

import com.education.InstitutionManagement.Service.BranchService;
import com.education.InstitutionManagement.Service.InstituteService;
import com.education.InstitutionManagement.Entity.Institute;
import com.education.InstitutionManagement.Entity.InstituteBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/institute_api")
public class InstituteController {
    @Autowired
    public InstituteService instituteService;

    @Autowired
    public BranchService branchService;

    // Get all Institutions
    @GetMapping(value="/get_all_institutions")
    public List<Institute> getAllInstitutions(){
        return instituteService.getAllInstitutions();
    }

    // Get Institution by Id
    @GetMapping(value="/{instituteId}")
    public Optional<Institute> getInstituteById(@PathVariable Integer instituteId) {
        return instituteService.getInstitutionById(instituteId);
    }
  /*  // Get Institution by its Name
    @GetMapping(value="/{instituteName}")
    public String getInstituteByName(@PathVariable String instituteName) {
        instituteService.getInstitutionByName(instituteName);
        return instituteName;
    }

    // Get Institution by its city (location)
    @GetMapping(value="/{city}")
        public String getInstituteByLocation(@PathVariable String city){
            instituteService.getInstitutionByLocation(city);
            return city;
    } */

    @PostMapping(value = "/createInst")
    public void create(@RequestBody Institute myInst) {
            instituteService.saveInstitution(myInst);
    }

    @PutMapping(value="/updateInst")
    public void update(@RequestBody Institute myInst) {
        instituteService.saveInstitution(myInst);
    }

    @DeleteMapping(value="/delete_institution/{id}")
    public void deleteByInstId(@PathVariable Integer id) {
        instituteService.deleteInstById(id);
    }
/* **************Branch APIs**************************** */

       @GetMapping(value="/getAllBranches")
       public List<InstituteBranch> getAllSubInstitutions(){
           return branchService.getAllSubInstitutions();
       }

        @PutMapping(value="branch/updateContactNo")
        public void updateContactNo(@RequestBody InstituteBranch myBranch) {
            branchService.saveBranch(myBranch);
        }
}

