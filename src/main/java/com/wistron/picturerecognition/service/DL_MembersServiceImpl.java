package com.wistron.picturerecognition.service;

import com.wistron.picturerecognition.dao.DL_MembersDao;
import com.wistron.picturerecognition.entity.DL_Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DL_MembersServiceImpl implements DL_MembersService {
    @Autowired
    private DL_MembersDao dl_membersDao;
    @Override
    public Map<String, Object> queryInformation(String empNoParam) {
        DL_Members dl_members = dl_membersDao.queryInformation(empNoParam);
        String empNo = dl_members.getEmpNo();
        String chName = dl_members.getChName();
        String enName = dl_members.getEnName();
        String sex = dl_members.getSex();
        String deptCode = dl_members.getDeptCode();
        String jobName = dl_members.getJobName();
        String empType = dl_members.getEmpType();
        String resignDate = dl_members.getResignDate();
        String mail = dl_members.getMail();
        String supervisor = dl_members.getSupervisor();
        String plantID = dl_members.getPlantID();
        String iDNo = dl_members.getiDNo();
        String hireDate = dl_members.getHireDate();
        String orgHireDate = dl_members.getOrgHireDate();
        String birthDate = dl_members.getBirthDate();
        String education = dl_members.getEducation();

        Map<String,Object> map = new HashMap<>();
        map.put("EmpNo",empNo);
        map.put("ChName",chName);
        map.put("EnName",enName);
        map.put("Sex",sex);
        map.put("DeptCode",deptCode);
        map.put("JobName",jobName);
        map.put("EmpType",empType);
        map.put("ResignDate",resignDate);
        map.put("Mail",mail);
        map.put("Supervisor",supervisor);
        map.put("PlantID",plantID);
        map.put("IDNo",iDNo);
        map.put("HireDate",hireDate);
        map.put("OrgHireDate",orgHireDate);
        map.put("BirthDate",birthDate);
        map.put("Education",education);
        return map;
    }
}
