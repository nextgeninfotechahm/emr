package com.ngi.emr.service;

import com.ngi.emr.contract.UserContract;
import com.ngi.emr.entity.Users;
import com.ngi.emr.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsersRepo repo;

    public void addUser(UserContract uc) {
        Users user = new Users();
        user.setUserId(uc.getUserId());
        user.setPassword(uc.getPassword());
        user.setStatus(uc.getStatus());
        user.setCreateDate(uc.getCreateDate());
        user.setEndDate(uc.getEndDate());
        user.setLastLogin(uc.getLastLogin());
        user.setStaffId(uc.getStaffId());
        user.setPatientId(uc.getPatientId());
        repo.save(user);
    }

    public void removeUser(int id) {
        Optional<Users> user = repo.findById(id);
        if(!user.isEmpty()) {
            repo.delete(user.get());
        }
    }

    public void updateUser(int  id, UserContract uc) {
        Optional<Users> user = repo.findById(id);
        if(!user.isEmpty()) {
            user.get().setUserId(uc.getUserId());
            user.get().setPassword(uc.getPassword());
            user.get().setStatus(uc.getStatus());
            user.get().setCreateDate(uc.getCreateDate());
            user.get().setEndDate(uc.getEndDate());
            user.get().setLastLogin(uc.getLastLogin());
            user.get().setStaffId(uc.getStaffId());
            user.get().setPatientId(uc.getPatientId());
            repo.save(user.get());
        }
    }

    public List<UserContract> getUsers() {
        List<UserContract> users = new ArrayList<>();
        for(Users user : repo.findAll()) {
            users.add(new UserContract(user.getId(), user.getUserId(), user.getPassword(), user.getStatus(),
                    user.getCreateDate(), user.getEndDate(), user.getLastLogin(), user.getStaffId(),
                    user.getPatientId()));
        }
        return users;
    }
}
