package com.education.InstitutionManagement.Controller;

import com.education.InstitutionManagement.Entity.InstitutionBranch;
import com.education.InstitutionManagement.Service.BranchService;
import com.education.InstitutionManagement.Service.InstituteService;
import com.education.InstitutionManagement.Entity.Institute;

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
    @GetMapping(value = "/get_all_institutions")
    public List<Institute> getAllInstitutions() {
        return instituteService.getAllInstitutions();
    }

    // Get Institution by Id
    @GetMapping(value = "/{instituteId}")
    public Institute getInstituteById(@PathVariable Integer instituteId) {
        return instituteService.getInstitutionById(instituteId);
    }

    @PostMapping(value = "/createInst")
    public void create(@RequestBody Institute myInst) {
        instituteService.saveInstitution(myInst);
    }

    @PutMapping(value = "/updateInst")
    public void update(@RequestBody Institute myInst) {
        instituteService.saveInstitution(myInst);
    }

    @DeleteMapping(value = "/delete_institution/{id}")
    public void deleteByInstId(@PathVariable Integer id) {
        instituteService.deleteInstById(id);
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
    /* **************Branch APIs**************************** */
    @GetMapping(value = "/getBranches")
    public List<InstitutionBranch> getAllBranches() {
        return branchService.getAllBranches();
    }
    @GetMapping(value = "/getBranchById/{id}")
    public Optional<InstitutionBranch> getBranchById(@PathVariable Integer id) {
        return branchService.getBranchById(id);
    }

    @PostMapping(value = "/createBranch")
    public void create(@RequestBody InstitutionBranch institutionBranch) {
        branchService.saveBranch(institutionBranch);
    }

    @PutMapping(value = "branch/updateContactNo")
    public void updateContactNo(@RequestBody InstitutionBranch myBranch) {
        branchService.saveBranch(myBranch);
    }
}

