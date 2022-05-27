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

    //	get all Branches
    public List<InstitutionBranch> getAllBranches() {
        return branchRepository.findAll();
    }

    // get Institution branch by Branch Id


    public InstitutionBranch saveBranch(InstitutionBranch institutionBranch) {
        return branchRepository.save(institutionBranch);
    }


    public Optional<InstitutionBranch> getBranchById(Integer instId) {
        return branchRepository.findById(instId);
    }
}
