package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "patienthealthcondition")
public class Patienthealthcondition implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "patientId")
    private Integer patientId;

    @Column(name = "conditionId")
    private Integer conditionId;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "verified")
    private Boolean verified;

    @Column(name = "verifiedBy")
    private Integer verifiedBy;

    @Column(name = "verifiedDate")
    private Date verifiedDate;

}
