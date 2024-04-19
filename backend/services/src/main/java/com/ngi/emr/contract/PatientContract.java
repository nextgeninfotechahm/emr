package com.ngi.emr.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonComponent;

import java.util.Date;

@JsonComponent
@AllArgsConstructor()
@NoArgsConstructor
@Getter @Setter
public class PatientContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("middleInitial")
    private String middleInitial;

    @JsonProperty("street")
    private String street;

    @JsonProperty("address2")
    private String address2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("dob")
    private Date dob;

    @JsonProperty("genderId")
    private Integer genderId;

    @JsonProperty("ethnicityId")
    private Integer ethnicityId;

    @JsonProperty("raceId")
    private Integer raceId;

    @JsonProperty("primaryPhone")
    private String primaryPhone;

    @JsonProperty("secondaryPhone")
    private String secondaryPhone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("contactName")
    private String contactName;

    @JsonProperty("contactPhone")
    private String contactPhone;

    @JsonProperty("contactEmail")
    private String contactEmail;

    @JsonProperty("contactAddress")
    private String contactAddress;

    @JsonProperty("smsConsent")
    private Boolean smsConsent;

    @JsonProperty("emailConsent")
    private Boolean emailConsent;

    @JsonProperty("idType")
    private Integer idType;

    @JsonProperty("idValue")
    private String idValue;

    @JsonProperty("idDocRef")
    private String idDocRef;

    @JsonProperty("statusId")
    private Integer statusId;

    @JsonProperty("other")
    private String other;
}
