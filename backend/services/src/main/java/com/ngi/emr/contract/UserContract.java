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
public class UserContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("password")
    private String password;

    @JsonProperty("status")
    private Integer status;

    @JsonProperty("createDate")
    private Date createDate;

    @JsonProperty("endDate")
    private Date endDate;

    @JsonProperty("lastLogin")
    private Date lastLogin;

    @JsonProperty("staffId")
    private Integer staffId;

    @JsonProperty("patientId")
    private Integer patientId;
}
