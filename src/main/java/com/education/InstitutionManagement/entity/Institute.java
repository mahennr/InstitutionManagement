package com.education.InstitutionManagement.entity;
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
    @Column(name="Institution_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer instituteId;

    @Column(name="institution_name")
    private String instituteName;

    @Column(name="Institute_Location")
    private String instituteLocation;

    public Institute(String instituteName, String instituteLocation) {
    }
}
