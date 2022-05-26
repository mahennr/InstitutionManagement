package com.education.InstitutionManagement.Service;

import com.education.InstitutionManagement.Repository.BranchRepository;
import com.education.InstitutionManagement.Entity.InstituteBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    BranchRepository branchRepository;

    //	get all Institutions info

    public List<InstituteBranch> getAllSubInstitutions() {
        return branchRepository.findAll();
    }

    // get Institution branch by Id
    public Optional<InstituteBranch> getSubInstitutionById(Integer instId) {
        //find an Institution by id
        return branchRepository.findById(instId);
    }

    public InstituteBranch saveBranch(InstituteBranch b1) {
        return branchRepository.save(b1);
    }

}
