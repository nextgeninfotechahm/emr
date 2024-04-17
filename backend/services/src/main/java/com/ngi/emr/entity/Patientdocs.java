package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "patientdocs")
public class Patientdocs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "patientId")
    private Integer patientId;

    @Column(name = "docType")
    private String docType;

    @Column(name = "docPath")
    private String docPath;

    @Column(name = "comments")
    private String comments;

}
