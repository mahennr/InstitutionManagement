package com.education.InstitutionManagement.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Institution")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Institute_Id")
    private Integer instituteId;

    @Column(name="Institution_Name")
    private String instituteName;

    @OneToOne(mappedBy = "institute")
    private InstitutionBranch branch;

}
