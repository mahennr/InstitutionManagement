package com.education.InstitutionManagement.Repository;

import com.education.InstitutionManagement.Entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;



public interface InstituteRepository extends JpaRepository <Institute,Integer> {
    // Institute findByInstitutionName(String instituteName);
    // Institute findByInstitutionLocation(String instituteLocation);
}
