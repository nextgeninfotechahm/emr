package com.ngi.emr.service;

import com.ngi.emr.contract.PatientContract;
import com.ngi.emr.entity.Patients;
import com.ngi.emr.repo.PatientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientsRepo repo;
    public void addPatient(PatientContract patientContract)
    {
        Patients p = new Patients();
        p.setLastname(patientContract.getLastname());
        p.setFirstname(patientContract.getFirstname());
        p.setMiddleInitial(patientContract.getMiddleInitial());
        p.setStreet(patientContract.getStreet());
        p.setAddress2(patientContract.getAddress2());
        p.setCity(patientContract.getCity());
        p.setState(patientContract.getState());
        p.setZipcode(patientContract.getZipcode());
        p.setDob(patientContract.getDob());
        p.setGenderId(patientContract.getGenderId());
        p.setEthnicityId(patientContract.getEthnicityId());
        p.setRaceId(patientContract.getRaceId());
        p.setPrimaryPhone(patientContract.getPrimaryPhone());
        p.setSecondaryPhone(patientContract.getSecondaryPhone());
        p.setEmail(patientContract.getEmail());
        p.setContactName(patientContract.getContactName());
        p.setContactPhone(patientContract.getContactPhone());
        p.setContactEmail(patientContract.getContactEmail());
        p.setContactAddress(patientContract.getContactAddress());
        p.setSmsConsent(patientContract.getSmsConsent());
        p.setEmailConsent(patientContract.getEmailConsent());
        p.setIdType(patientContract.getIdType());
        p.setIdValue(patientContract.getIdValue());
        p.setIdDocRef(patientContract.getIdDocRef());
        p.setStatusId(patientContract.getStatusId());
        p.setOther(patientContract.getOther());
        repo.save(p);
    }

    public void removePatient(int patientId)
    {
        Optional<Patients> p = repo.findById(patientId);
        if(!p.isEmpty()){
            repo.delete(p.get());
        }
    }

    public void updatePatient(int PatientId, PatientContract patientContract) {
        Optional<Patients> p = repo.findById(PatientId);
        if (!p.isEmpty()) {
            p.get().setLastname(patientContract.getLastname());
            p.get().setFirstname(patientContract.getFirstname());
            p.get().setMiddleInitial(patientContract.getMiddleInitial());
            p.get().setStreet(patientContract.getStreet());
            p.get().setAddress2(patientContract.getAddress2());
            p.get().setCity(patientContract.getCity());
            p.get().setState(patientContract.getState());
            p.get().setZipcode(patientContract.getZipcode());
            p.get().setDob(patientContract.getDob());
            p.get().setGenderId(patientContract.getGenderId());
            p.get().setEthnicityId(patientContract.getEthnicityId());
            p.get().setRaceId(patientContract.getRaceId());
            p.get().setPrimaryPhone(patientContract.getPrimaryPhone());
            p.get().setSecondaryPhone(patientContract.getSecondaryPhone());
            p.get().setEmail(patientContract.getEmail());
            p.get().setContactName(patientContract.getContactName());
            p.get().setContactPhone(patientContract.getContactPhone());
            p.get().setContactEmail(patientContract.getContactEmail());
            p.get().setContactAddress(patientContract.getContactAddress());
            p.get().setSmsConsent(patientContract.getSmsConsent());
            p.get().setEmailConsent(patientContract.getEmailConsent());
            p.get().setIdType(patientContract.getIdType());
            p.get().setIdValue(patientContract.getIdValue());
            p.get().setIdDocRef(patientContract.getIdDocRef());
            p.get().setStatusId(patientContract.getStatusId());
            p.get().setOther(patientContract.getOther());
            repo.save(p.get());
        }
    }

        public List<PatientContract> getPatients(){
            List<PatientContract> patients = new ArrayList<>();
            for(Patients p:repo.findAll())
            {
                patients.add(new PatientContract(p.getId(), p.getLastname(), p.getFirstname(), p.getMiddleInitial(), p.getStreet(),
                p.getAddress2(), p.getCity(), p.getState(), p.getZipcode(), p.getDob(), p.getGenderId(), p.getEthnicityId(),
                        p.getRaceId(), p.getPrimaryPhone(), p.getSecondaryPhone(), p.getEmail(), p.getContactName(),
                        p.getContactPhone(), p.getContactEmail(), p.getContactAddress(), p.getSmsConsent(), p.getEmailConsent(),
                        p.getIdType(), p.getIdValue(), p.getIdDocRef(), p.getStatusId(), p.getOther()));
            }
            return patients;
        }

        public PatientContract findByName(String firstname, String lastname) {
            for (Patients p : repo.findAll()) {
                if (firstname.equals(p.getFirstname()) && lastname.equals(p.getLastname())) {
                    return new PatientContract(p.getId(), p.getLastname(), p.getFirstname(), p.getMiddleInitial(), p.getStreet(),
                            p.getAddress2(), p.getCity(), p.getState(), p.getZipcode(), p.getDob(), p.getGenderId(), p.getEthnicityId(),
                            p.getRaceId(), p.getPrimaryPhone(), p.getSecondaryPhone(), p.getEmail(), p.getContactName(),
                            p.getContactPhone(), p.getContactEmail(), p.getContactAddress(), p.getSmsConsent(), p.getEmailConsent(),
                            p.getIdType(), p.getIdValue(), p.getIdDocRef(), p.getStatusId(), p.getOther());
                }

            }
            return null;
        }
    }

