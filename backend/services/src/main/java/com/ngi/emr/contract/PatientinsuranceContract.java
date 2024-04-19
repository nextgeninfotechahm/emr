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
public class PatientinsuranceContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("primaryInsuranceProvider")
    private String primaryInsuranceProvider;

    @JsonProperty("primaryPolicyTypeId")
    private Integer primaryPolicyTypeId;

    @JsonProperty("groupCode")
    private String groupCode;

    @JsonProperty("primaryPolicyName")
    private String primaryPolicyName;

    @JsonProperty("subscriberId")
    private String subscriberId;

    @JsonProperty("subscriberName")
    private String subscriberName;

    @JsonProperty("subscriberDob")
    private Date subscriberDob;

    @JsonProperty("primaryInsurancePhone")
    private String primaryInsurancePhone;

    @JsonProperty("hasSecondary")
    private Boolean hasSecondary;

    @JsonProperty("secInsuranceProvider")
    private String secInsuranceProvider;

    @JsonProperty("secPolicyTypeId")
    private Integer secPolicyTypeId;

    @JsonProperty("secGroupCode")
    private String secGroupCode;

    @JsonProperty("secSubscriberId")
    private String secSubscriberId;

    @JsonProperty("secSubscriberName")
    private String secSubscriberName;

    @JsonProperty("secSubscriberDob")
    private Date secSubscriberDob;

    @JsonProperty("secInsurancePhone")
    private String secInsurancePhone;
}
