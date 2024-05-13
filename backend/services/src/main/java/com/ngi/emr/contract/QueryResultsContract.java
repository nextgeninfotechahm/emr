package com.ngi.emr.contract;

import java.util.List;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@JsonComponent
@Setter @Getter
public class QueryResultsContract<T> {
    @JsonProperty("totalPages")
    private int totalPages;
    @JsonProperty("pageNo")
    private int pageNo;
    @JsonProperty("results")
    private List<T> results;
}
