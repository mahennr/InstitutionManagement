package com.education.InstitutionManagement.Repository;


import com.education.InstitutionManagement.Entity.InstitutionBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<InstitutionBranch,Integer> {
    // InstituteBranch findByInstitutionLocation(String subLocation);
}
