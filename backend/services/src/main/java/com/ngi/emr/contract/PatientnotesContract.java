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
public class PatientnotesContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("patientId")
    private Integer patientId;

    @JsonProperty("note")
    private String note;

    @JsonProperty("modifiedDate")
    private Date modifiedDate;

    @JsonProperty("addedBy")
    private Integer addedBy;
}
