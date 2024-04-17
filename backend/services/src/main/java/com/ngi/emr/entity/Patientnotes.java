package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "patientnotes")
public class Patientnotes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "patientId")
    private Integer patientId;

    @Column(name = "note")
    private String note;

    @Column(name = "modifiedDate")
    private Date modifiedDate;

    @Column(name = "addedBy")
    private Integer addedBy;

}
