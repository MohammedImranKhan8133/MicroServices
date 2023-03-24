package com.imran.userservice.service;

import com.imran.userservice.entity.UserDetail;
import com.imran.userservice.repository.UserRepo;
import com.imran.userservice.vo.Department;
import com.imran.userservice.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    RestTemplate restTemplate;

    public UserDetail saveUser(UserDetail UserDetail) {
        return userRepo.save(UserDetail);
    }

    public ResponseTemplateVO getUserWithDepartment(int id) {
        UserDetail UserDetail = userRepo.findByUserId(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + UserDetail.getDepartmentId(), Department.class);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        responseTemplateVO.setUserDetail(UserDetail);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
