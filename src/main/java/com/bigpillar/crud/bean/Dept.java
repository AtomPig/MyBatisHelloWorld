package com.bigpillar.crud.bean;

public class Dept {
	private int id;
	private int deptno;
	private String deptname;
	private String loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptno=" + deptno + ", deptname=" + deptname + ", loc=" + loc + "]";
	}

}
