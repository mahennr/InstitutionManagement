package com.education.InstitutionManagement.Repository;

import com.education.InstitutionManagement.Entity.InstituteBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<InstituteBranch,Integer> {
    // InstituteBranch findByInstitutionLocation(String subLocation);
}
