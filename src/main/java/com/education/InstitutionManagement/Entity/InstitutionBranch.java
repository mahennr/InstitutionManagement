package com.education.InstitutionManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Institution_Branch")
public class InstitutionBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "Branch_ID")
    private Integer branchId;

    @Column(name="Branch_Name")
    private String branchName;

    @Column(name="Contact_No")
    private String contactNo;

    @Column(name="City")
    private String city;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "Institute_Id")
    private Institute institute;
}
