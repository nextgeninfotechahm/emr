package com.ngi.emr.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "patient")
public class Patients implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "lastname")
    private String lastname;

    @Column(name= "firstname")
    private String firstname;

    @Column(name = "middleInitial")
    private String middleInitial;

    @Column(name = "street")
    private String street;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "genderId")
    private Integer genderId;

    @Column(name = "ethnicityId")
    private Integer ethnicityId;

    @Column(name = "raceId")
    private Integer raceId;

    @Column(name = "primaryPhone")
    private String primaryPhone;

    @Column(name = "secondaryPhone")
    private String secondaryPhone;

    @Column(name = "email")
    private String email;

    @Column(name = "contactName")
    private String contactName;

    @Column(name = "contactPhone")
    private String contactPhone;

    @Column(name = "contactEmail")
    private String contactEmail;

    @Column(name = "contactAddress")
    private String contactAddress;

    @Column(name = "smsConsent")
    private Boolean smsConsent;

    @Column(name = "emailConsent")
    private Boolean emailConsent;

    @Column(name = "idType")
    private Integer idType;

    @Column(name = "idValue")
    private String idValue;

    @Column(name = "idDocRef")
    private String idDocRef;

    @Column(name = "statusId")
    private Integer statusId;

    @Column(name = "other")
    private String other;
}
