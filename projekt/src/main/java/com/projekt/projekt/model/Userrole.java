package com.projekt.projekt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userrole")
public class Userrole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iduserrole;
	private int idrole;
	private int iduser;

	public Long getIduserrole() {
		return iduserrole;
	}

	public void setIduserrole(Long iduserrole) {
		this.iduserrole = iduserrole;
	}

	public int getIdrole() {
		return idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

}