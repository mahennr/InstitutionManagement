package com.education.InstitutionManagement.Repository;

import com.education.InstitutionManagement.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;



public interface InstituteRepository extends JpaRepository <Institute,Integer> {
}
