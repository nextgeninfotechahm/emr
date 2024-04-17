package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private Integer status;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "lastLogin")
    private Date lastLogin;

    @Column(name = "staffId")
    private Integer staffId;

    @Column(name = "patientId")
    private Integer patientId;

}
