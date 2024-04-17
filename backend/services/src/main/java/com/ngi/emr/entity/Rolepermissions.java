package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "rolepermissions")
public class Rolepermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleId")
    private Integer roleId;

    @Column(name = "permissionId")
    private Integer permissionId;

    @Column(name = "active")
    private Boolean active;

}
