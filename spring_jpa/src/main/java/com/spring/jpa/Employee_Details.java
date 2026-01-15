package com.spring.jpa;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee_Details {
	@Id
	@Column(name="empno")
	int empno1;
	public int getEmpno1() {
		return empno1;
	}
	public String getEname1() {
		return ename1;
	}
	public String getJob1() {
		return job1;
	}
	public int getMgr1() {
		return mgr1;
	}
	public Date getHiredate1() {
		return hiredate1;
	}
	public int getSal1() {
		return sal1;
	}
	public int getComm1() {
		return comm1;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setEmpno1(int empno1) {
		this.empno1 = empno1;
	}
	public void setEname1(String ename1) {
		this.ename1 = ename1;
	}
	public void setJob1(String job1) {
		this.job1 = job1;
	}
	public void setMgr1(int mgr1) {
		this.mgr1 = mgr1;
	}
	public void setHiredate1(Date hiredate1) {
		this.hiredate1 = hiredate1;
	}
	public void setSal1(int sal1) {
		this.sal1 = sal1;
	}
	public void setComm1(int comm1) {
		this.comm1 = comm1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	@Column(name="ename")
	String ename1;
	@Column(name="job")
	String job1;
	@Column(name="mgr")
	int mgr1;
	@Column(name="hiredate")
	Date hiredate1;
	@Column(name="sal")
	int sal1;
	@Column(name="comm")
	int comm1;
	@Column(name="deptno")
	int deptno1;
}
