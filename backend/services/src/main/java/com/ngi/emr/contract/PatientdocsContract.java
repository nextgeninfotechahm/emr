package com.ngi.emr.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
@AllArgsConstructor()
@NoArgsConstructor
@Getter @Setter
public class PatientdocsContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("patientId")
    private Integer patientId;

    @JsonProperty("docType")
    private String docType;

    @JsonProperty("docPath")
    private String docPath;

    @JsonProperty("comments")
    private String comments;
}
