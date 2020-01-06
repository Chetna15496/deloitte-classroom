package com.deloitte.emp;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

//@DiscriminatorValue("System Engg")
public class SysEngg extends Employee {
	//@Id
	//@PrimaryKeyJoinColumn(foreignKey=)
	//private int setId;
	private String lang;
	private String devProfile;
 public SysEngg() {
	// TODO Auto-generated constructor stub
}
public SysEngg(int setId, String lang, String devProfile) {
	super();
	//this.setId = setId;
	this.lang = lang;
	this.devProfile = devProfile;
}
//public int getSetId() {
//	return setId;
//}
//public void setSetId(int setId) {
//	this.setId = setId;
//}
public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
public String getDevProfile() {
	return devProfile;
}
public void setDevProfile(String devProfile) {
	this.devProfile = devProfile;
}
@Override
public String toString() {
	return "SysEngg [lang=" + lang + ", devProfile=" + devProfile + "]";
}
 

 
}
