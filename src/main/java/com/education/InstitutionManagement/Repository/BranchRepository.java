package com.education.InstitutionManagement.Repository;

import com.education.InstitutionManagement.Entity.InstitutionBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<InstitutionBranch,Integer> {
    // InstituteBranch findByInstitutionLocation(String subLocation);
}
