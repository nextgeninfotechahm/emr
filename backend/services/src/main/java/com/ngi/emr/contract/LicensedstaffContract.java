package com.ngi.emr.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonComponent;

import java.sql.Date;

@JsonComponent
@AllArgsConstructor()
@NoArgsConstructor
@Getter @Setter
public class LicensedstaffContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("staffId")
    private Integer staffId;

    @JsonProperty("licenseId")
    private String licenseId;

    @JsonProperty("licenseState")
    private String licenseState;

    @JsonProperty("startDate")
    private Date startDate;

    @JsonProperty("endDate")
    private Date endDate;

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("inclusions")
    private String inclusions;

    @JsonProperty("exclusions")
    private String exclusions;

    @JsonProperty("canPrescribe")
    private Boolean canPrescribe;

    @JsonProperty("canDiagnose")
    private Boolean canDiagnose;
}
