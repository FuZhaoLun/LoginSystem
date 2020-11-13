package com.wistron.picturerecognition.entity;

import java.io.Serializable;
import java.util.Objects;

public class WX_Account implements Serializable {
    private static final long serialVersionUID = -2079782040731460995L;
    private String empNo;
    private String password;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WX_Account that = (WX_Account) o;
        return Objects.equals(empNo, that.empNo) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, password);
    }

    @Override
    public String toString() {
        return "WX_Account{" +
                "empNo='" + empNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
