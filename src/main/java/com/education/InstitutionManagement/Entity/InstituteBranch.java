package com.education.InstitutionManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Institute_Branch")
public class InstituteBranch {

    @Column(name="Sub_Institution_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer subInstituteId;

    @Column(name="Sub_Branch")
    private String subInstName;

    @Column(name="Contact_No")
    private String contactNo;

    @Column(name="Institute_SubLocation")
    private String instituteSubLocation;
}
