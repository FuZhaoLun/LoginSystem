package com.wistron.picturerecognition.entity;

import javax.print.attribute.standard.JobName;
import java.io.Serializable;
import java.util.Objects;

public class DL_Members implements Serializable {
    private static final long serialVersionUID = 7780495140088688956L;
    private String empNo;
     private String chName;
     private String enName;
     private String sex;
     private String deptCode;
     private String jobName;
     private String empType;
     private String resignDate;
     private String mail;
     private String supervisor;
     private String plantID;
     private String iDNo;
     private String hireDate;
     private String orgHireDate ;
     private String birthDate;
     private String education;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getResignDate() {
        return resignDate;
    }

    public void setResignDate(String resignDate) {
        this.resignDate = resignDate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getPlantID() {
        return plantID;
    }

    public void setPlantID(String plantID) {
        this.plantID = plantID;
    }

    public String getiDNo() {
        return iDNo;
    }

    public void setiDNo(String iDNo) {
        this.iDNo = iDNo;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getOrgHireDate() {
        return orgHireDate;
    }

    public void setOrgHireDate(String orgHireDate) {
        this.orgHireDate = orgHireDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DL_Members that = (DL_Members) o;
        return Objects.equals(empNo, that.empNo) &&
                Objects.equals(chName, that.chName) &&
                Objects.equals(enName, that.enName) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(deptCode, that.deptCode) &&
                Objects.equals(jobName, that.jobName) &&
                Objects.equals(empType, that.empType) &&
                Objects.equals(resignDate, that.resignDate) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(supervisor, that.supervisor) &&
                Objects.equals(plantID, that.plantID) &&
                Objects.equals(iDNo, that.iDNo) &&
                Objects.equals(hireDate, that.hireDate) &&
                Objects.equals(orgHireDate, that.orgHireDate) &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(education, that.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, chName, enName, sex, deptCode, jobName, empType, resignDate, mail, supervisor, plantID, iDNo, hireDate, orgHireDate, birthDate, education);
    }

    @Override
    public String toString() {
        return "DL_Members{" +
                "empNo='" + empNo + '\'' +
                ", chName='" + chName + '\'' +
                ", enName='" + enName + '\'' +
                ", sex='" + sex + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobName='" + jobName + '\'' +
                ", empType='" + empType + '\'' +
                ", resignDate='" + resignDate + '\'' +
                ", mail='" + mail + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", plantID='" + plantID + '\'' +
                ", iDNo='" + iDNo + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", orgHireDate='" + orgHireDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
