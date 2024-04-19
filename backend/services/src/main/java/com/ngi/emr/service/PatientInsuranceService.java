package com.ngi.emr.service;

import com.ngi.emr.contract.PatientinsuranceContract;
import com.ngi.emr.entity.Patientinsurance;
import com.ngi.emr.repo.PatientinsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientInsuranceService {
    @Autowired
    private PatientinsuranceRepo repo;

    public void addPatientInsurance(PatientinsuranceContract pic)
    {
        Patientinsurance pi = new Patientinsurance();
        pi.setPrimaryInsuranceProvider(pic.getPrimaryInsuranceProvider());
        pi.setPrimaryPolicyTypeId(pic.getPrimaryPolicyTypeId());
        pi.setGroupCode(pic.getGroupCode());
        pi.setPrimaryPolicyName(pic.getPrimaryPolicyName());
        pi.setSubscriberId(pic.getSubscriberId());
        pi.setSubscriberName(pic.getSubscriberName());
        pi.setSubscriberDob(pic.getSubscriberDob());
        pi.setPrimaryInsurancePhone(pic.getPrimaryInsurancePhone());
        pi.setHasSecondary(pic.getHasSecondary());
        pi.setSecInsuranceProvider(pic.getSecInsuranceProvider());
        pi.setSecPolicyTypeId(pic.getSecPolicyTypeId());
        pi.setSecGroupCode(pic.getSecGroupCode());
        pi.setSecSubscriberId(pic.getSecSubscriberId());
        pi.setSecSubscriberName(pic.getSecSubscriberName());
        pi.setSecSubscriberDob(pic.getSecSubscriberDob());
        pi.setSecInsurancePhone(pic.getSecInsurancePhone());
        repo.save(pi);
    }

    public void removePatientInsurance(int patientInsuranceId) {
        Optional<Patientinsurance> pi = repo.findById(patientInsuranceId);
        if(!pi.isEmpty())
        {
            repo.deleteById(patientInsuranceId);
        }
    }

    public void updatePatientInsurance(int patientInsuranceId, PatientinsuranceContract pic)
    {
        Optional<Patientinsurance> pi = repo.findById(patientInsuranceId);
        if(!pi.isEmpty())
        {
            pi.get().setPrimaryInsuranceProvider(pic.getPrimaryInsuranceProvider());
            pi.get().setPrimaryPolicyTypeId(pic.getPrimaryPolicyTypeId());
            pi.get().setGroupCode(pic.getGroupCode());
            pi.get().setPrimaryPolicyName(pic.getPrimaryPolicyName());
            pi.get().setSubscriberId(pic.getSubscriberId());
            pi.get().setSubscriberName(pic.getSubscriberName());
            pi.get().setSubscriberDob(pic.getSubscriberDob());
            pi.get().setPrimaryInsurancePhone(pic.getPrimaryInsurancePhone());
            pi.get().setHasSecondary(pic.getHasSecondary());
            pi.get().setSecInsuranceProvider(pic.getSecInsuranceProvider());
            pi.get().setSecPolicyTypeId(pic.getSecPolicyTypeId());
            pi.get().setSecGroupCode(pic.getSecGroupCode());
            pi.get().setSecSubscriberId(pic.getSecSubscriberId());
            pi.get().setSecSubscriberName(pic.getSecSubscriberName());
            pi.get().setSecSubscriberDob(pic.getSecSubscriberDob());
            pi.get().setSecInsurancePhone(pic.getSecInsurancePhone());
            repo.save(pi.get());
        }
    }

    public List<PatientinsuranceContract> getPatientInsurances(){
        List<PatientinsuranceContract> pics = new ArrayList<>();
        for(Patientinsurance pi : repo.findAll())
        {
            pics.add(new PatientinsuranceContract(pi.getId(), pi.getPrimaryInsuranceProvider(), pi.getPrimaryPolicyTypeId(),
                    pi.getGroupCode(), pi.getPrimaryPolicyName(), pi.getSubscriberId(), pi.getSubscriberName(), pi.getSubscriberDob(),
                    pi.getPrimaryInsurancePhone(), pi.getHasSecondary(), pi.getSecInsuranceProvider(), pi.getSecPolicyTypeId(),
                    pi.getSecGroupCode(), pi.getSecSubscriberId(), pi.getSecSubscriberName(), pi.getSecSubscriberDob(),
                    pi.getSecInsurancePhone()));
        }
        return pics;
    }
}
