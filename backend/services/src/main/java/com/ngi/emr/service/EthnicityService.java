package com.ngi.emr.service;

import com.ngi.emr.AppConfig;
import com.ngi.emr.contract.EthnicityContract;
import com.ngi.emr.contract.QueryResultsContract;
import com.ngi.emr.entity.Ethnicities;
import com.ngi.emr.repo.EthnicitiesRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EthnicityService {
    
    @Autowired
    private EthnicitiesRepo repo;
    @Autowired
    private AppConfig appConfig;

    public void addEthnicity(EthnicityContract
                                     ethnicityContract){
        if(ethnicityContract.getName().isEmpty())
            throw new RuntimeException("Name is reuired");
        Ethnicities e= new Ethnicities();
        e.setDescription(ethnicityContract.getDescription());
        e.setName(ethnicityContract.getName());
        repo.save(e);
    }

    public void removeEthnicity(int ethnicityId){
        Optional<Ethnicities> e=repo.findById(ethnicityId);
        if(!e.isEmpty()){
            repo.delete(e.get());
        }
    }

    public void updateEthnicity(int ethnicityId,EthnicityContract ethnicityContract){
        Optional<Ethnicities> e=repo.findById(ethnicityId);
        if(!e.isEmpty()){
            e.get().setName(ethnicityContract.getName());
            e.get().setDescription(ethnicityContract.getDescription());
            repo.save(e.get());
        }
    }

    public QueryResultsContract<EthnicityContract>  getEthnicities(String query,boolean paged, int pageNo, String sortColumn, int sortOrder){
        List<EthnicityContract> ethinicities=new ArrayList<>();
        List<Ethnicities> result;

        Specification<Ethnicities> spec=
            (root,cquery,criteriaBuilder)->{
                if(sortOrder==0)
                    cquery.orderBy(criteriaBuilder.asc(root.get(sortColumn)));
                else
                    cquery.orderBy(criteriaBuilder.desc(root.get(sortColumn)));
                if(query!=null && query.length()>0)
                    return criteriaBuilder.or(
                    criteriaBuilder.like(
                        root.get("name"),"%"+query+"%"
                        ),
                    criteriaBuilder.like(root.get("description"),"%"+query+"%")
                    );
                else{
                    return null;
                }
        };
        int totalPages=1;
        if(appConfig.isPaged()){
            totalPages=(int)  Math.ceil((double)repo.count(spec)/appConfig.getPageSize());
            result=repo.findAll(spec,PageRequest.of(pageNo,appConfig.getPageSize())).toList();
        }else{
            result=repo.findAll(spec);
        }

        for(Ethnicities e:result){
            ethinicities.add(new EthnicityContract(e.getId(),e.getName(),e.getDescription()));
        }
        QueryResultsContract<EthnicityContract> resp=new QueryResultsContract<>();
        resp.setTotalPages(totalPages);
        resp.setPageNo(pageNo);
        resp.setResults(ethinicities);
        return resp;
    }
    
    public long getCount(){
        return repo.count();
    }

}
