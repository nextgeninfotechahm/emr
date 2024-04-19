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
public class PatientAllergyContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("patientId")
    private Integer patientId;

    @JsonProperty("allergyId")
    private Integer allergyId;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("startDate")
    private Date startDate;

    @JsonProperty("endDate")
    private Date endDate;

    @JsonProperty("verified")
    private Boolean verified;

    @JsonProperty("verifiedBy")
    private Integer verifiedBy;

    @JsonProperty("verifiedDate")
    private Date verifiedDate;
}
