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
public class FacilityContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("street")
    private String street;

    @JsonProperty("address2")
    private String address2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zipCode")
    private String zipCode;

    @JsonProperty("logoRef")
    private String logoRef;
}
