package com.test.springbootdatasourse.bean;

import java.util.Date;

public class User {

    private Integer id;
    private String usn;
    private String pwd;
    private String email;
    private Date birthday;
    private String gender;
    private Double salary;

    public User() {
    }

    public User(String usn, String pwd, String email, Date birthday, String gender, Double salary) {
        this.usn = usn;
        this.pwd = pwd;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    public User(Integer id, String usn, String pwd, String email, Date birthday, String gender, Double salary) {
        this.id = id;
        this.usn = usn;
        this.pwd = pwd;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usn='" + usn + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
