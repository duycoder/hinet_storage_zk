/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
@Entity
@Table(name = "regency")
public class Regency {

    private Integer id;
    private String regencyCode;
    private String regencyName;
    private Date dateCreate;
    private Date dateModify;
    private Integer userCreate;
    private Integer userModify;
    private Boolean isDelete;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "regency_code ")
    public String getRegencyCode() {
        return regencyCode;
    }

    public void setRegencyCode(String regencyCode) {
        this.regencyCode = regencyCode;
    }

    @Column(name = "regency_name")
    public String getRegencyName() {
        return regencyName;
    }

    public void setRegencyName(String regencyName) {
        this.regencyName = regencyName;
    }

    @Column(name = "date_create")
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Column(name = "date_modify")
    public Date getDateModify() {
        return dateModify;
    }

    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    @Column(name = "user_create")
    public Integer getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Integer userCreate) {
        this.userCreate = userCreate;
    }

    @Column(name = "user_modify")
    public Integer getUserModify() {
        return userModify;
    }

    public void setUserModify(Integer userModify) {
        this.userModify = userModify;
    }

    @Column(name = "is_delete")
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}
