package com.Spring.jdbc;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails {
int empno1;
public int getEmpno() {
	return empno1;
}
public String getEname() {
	return ename1;
}
public String getJob() {
	return job1;
}
public int getMgr() {
	return mgr1;
}
public Date getHiredate() {
	return hiredate1;
}
public int getSal() {
	return sal1;
}
public int getComm() {
	return comm1;
}
public int getDeptno() {
	return deptno1;
}
public void setEmpno(int empno) {
	this.empno1 = empno;
}
public void setEname(String ename) {
	this.ename1 = ename;
}
public void setJob(String job) {
	this.job1 = job;
}
public void setMgr(int mgr) {
	this.mgr1 = mgr;
}
public void setHiredate(Date hiredate) {
	this.hiredate1 = hiredate;
}
public void setSal(int sal) {
	this.sal1 = sal;
}
public void setComm(int comm) {
	this.comm1 = comm;
}
public void setDeptno(int deptno) {
	this.deptno1 = deptno;
}
String ename1;
String job1;
int mgr1;
Date hiredate1;
int sal1;
int comm1;
int deptno1;


}
