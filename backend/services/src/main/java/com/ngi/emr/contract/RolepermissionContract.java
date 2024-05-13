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
public class RolepermissionContract {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("roleId")
    private Integer roleId;

    @JsonProperty("permissionId")
    private Integer permissionId;

    @JsonProperty("active")
    private Boolean active;
}
