package com.ngi.emr.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.ngi.emr.entity.Ethnicities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
@AllArgsConstructor()
@NoArgsConstructor
@Getter @Setter
public class EthnicityContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /*public static EthnicityContract from(Ethnicities e){
        return new EthnicityContract(e.getId(),e.getName(),e.getDescription());
    }*/

}
