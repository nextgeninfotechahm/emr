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
public class StaffContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("staffId")
    private String staffId;

    @JsonProperty("fname")
    private String fname;

    @JsonProperty("lname")
    private String lname;

    @JsonProperty("jobId")
    private Integer jobId;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("startDate")
    private Date startDate;

    @JsonProperty("endDate")
    private Date endDate;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("licensed")
    private Boolean licensed;
}
