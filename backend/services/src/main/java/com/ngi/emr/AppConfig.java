package com.ngi.emr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${app.paged}")
    private boolean paged;
    @Value("${app.pagesize}")
    private int pageSize;
    
    public boolean isPaged(){
        return this.paged;
    }
    
    public int getPageSize(){
        return this.pageSize;
    }
}
