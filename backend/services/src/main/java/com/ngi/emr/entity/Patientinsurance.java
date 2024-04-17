package com.ngi.emr.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "patientinsurance")
public class Patientinsurance implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "primaryInsurceProvider")
    private String primaryInsurceProvider;

    @Column(name = "primaryPolicyTypeId")
    private Integer primaryPolicyTypeId;

    @Column(name = "groupCode")
    private String groupCode;

    @Column(name = "primaryPolicyName")
    private String primaryPolicyName;

    @Column(name = "subscriberId")
    private String subscriberId;

    @Column(name = "subscriberName")
    private String subscriberName;

    @Column(name = "subscriberDob")
    private Date subscriberDob;

    @Column(name = "primaryInsurancePhone")
    private String primaryInsurancePhone;

    @Column(name = "hasSecondary")
    private Boolean hasSecondary;

    @Column(name = "secInsurceProvider")
    private String secInsurceProvider;

    @Column(name = "secPolicyTypeId")
    private Integer secPolicyTypeId;

    @Column(name = "secGroupCode")
    private String secGroupCode;

    @Column(name = "secSubscriberId")
    private String secSubscriberId;

    @Column(name = "secSubscriberName")
    private String secSubscriberName;

    @Column(name = "secSubscriberDob")
    private Date secSubscriberDob;

    @Column(name = "secInsurancePhone")
    private String secInsurancePhone;

}
