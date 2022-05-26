package com.education.InstitutionManagement.Service;

import com.education.InstitutionManagement.Entity.InstitutionBranch;
import com.education.InstitutionManagement.Repository.BranchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    BranchRepository branchRepository;

    //	get all Institutions info

    public List<InstitutionBranch> getAllSubInstitutions() {
        return branchRepository.findAll();
    }

    // get Institution branch by Id
    public Optional<InstitutionBranch> getSubInstitutionById(Integer instId) {
        //find an Institution by id
        return branchRepository.findById(instId);
    }

    public InstitutionBranch saveBranch(InstitutionBranch b1) {
        return branchRepository.save(b1);
    }

}
