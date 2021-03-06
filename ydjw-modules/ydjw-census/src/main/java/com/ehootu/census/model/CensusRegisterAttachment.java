package com.ehootu.census.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/12/28 10:27
 * @Description: 户籍登记附件表
 */
public class CensusRegisterAttachment {


    private Integer id;
    /**
     * 监护人书面申请
     */
    private String guardianWrittenApplication;
    /**
     * 医学证明
     */
    private String medicalProof;
    /**
     * 生育服务证明
     */
    private String birthCertificate;
    /**
     * 婴儿血型单
     */
    private String babyBloodType;
    /**
     * 父母双方的户口本
     */
    private String parentsAccount;
    /**
     * 父母双方结婚证
     */
    private String parentsMarriageCertificate;
    /**
     * 被投靠人书面申请
     */
    private String patronWrittenApplication;
    /**
     * 结婚证
     */
    private String marriedCertificate;
    /**
     * 双方（投靠人，被投靠人）户口原件或户籍证明
     */
    private String borthCensusRegister;
    /**
     * 双方（投靠人，被投靠人）身份证复印件
     */
    private String borthCard;
    /**
     * 死亡证明
     */
    private String deathCertificate;
    /**
     * 户口本原件
     */
    private String censusRegister;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 删除标志：0、未删除，1、已删除
     */
    private Integer deleteFlag;
    /**
     * 备用字段1
     */
    private Integer spareField1;
    /**
     * 备用字段2
     */
    private String spareField2;
    /**
     * 备用字段3
     */
    private String spareField3;


    public CensusRegisterAttachment(InputCensus inputCensus) {

        this.guardianWrittenApplication = inputCensus.getGuardianWrittenApplication();
        this.medicalProof = inputCensus.getMedicalProof();
        this.birthCertificate = inputCensus.getBirthCertificate();
        this.babyBloodType = inputCensus.getBabyBloodType();
        this.parentsAccount = inputCensus.getParentsAccount();
        this.parentsMarriageCertificate = inputCensus.getParentsMarriageCertificate();
        this.patronWrittenApplication = inputCensus.getPatronWrittenApplication();
        this.marriedCertificate = inputCensus.getMarriedCertificate();
        this.borthCensusRegister = inputCensus.getBorthCensusRegister();
        this.borthCard = inputCensus.getBorthCard();
        this.deathCertificate = inputCensus.getDeathCertificate();
        this.censusRegister = inputCensus.getCensusRegister();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuardianWrittenApplication() {
        return guardianWrittenApplication;
    }

    public void setGuardianWrittenApplication(String guardianWrittenApplication) {
        this.guardianWrittenApplication = guardianWrittenApplication == null ? null : guardianWrittenApplication.trim();
    }

    public String getMedicalProof() {
        return medicalProof;
    }

    public void setMedicalProof(String medicalProof) {
        this.medicalProof = medicalProof == null ? null : medicalProof.trim();
    }

    public String getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(String birthCertificate) {
        this.birthCertificate = birthCertificate == null ? null : birthCertificate.trim();
    }

    public String getBabyBloodType() {
        return babyBloodType;
    }

    public void setBabyBloodType(String babyBloodType) {
        this.babyBloodType = babyBloodType == null ? null : babyBloodType.trim();
    }

    public String getParentsAccount() {
        return parentsAccount;
    }

    public void setParentsAccount(String parentsAccount) {
        this.parentsAccount = parentsAccount == null ? null : parentsAccount.trim();
    }

    public String getParentsMarriageCertificate() {
        return parentsMarriageCertificate;
    }

    public void setParentsMarriageCertificate(String parentsMarriageCertificate) {
        this.parentsMarriageCertificate = parentsMarriageCertificate == null ? null : parentsMarriageCertificate.trim();
    }

    public String getPatronWrittenApplication() {
        return patronWrittenApplication;
    }

    public void setPatronWrittenApplication(String patronWrittenApplication) {
        this.patronWrittenApplication = patronWrittenApplication == null ? null : patronWrittenApplication.trim();
    }

    public String getMarriedCertificate() {
        return marriedCertificate;
    }

    public void setMarriedCertificate(String marriedCertificate) {
        this.marriedCertificate = marriedCertificate == null ? null : marriedCertificate.trim();
    }

    public String getBorthCensusRegister() {
        return borthCensusRegister;
    }

    public void setBorthCensusRegister(String borthCensusRegister) {
        this.borthCensusRegister = borthCensusRegister == null ? null : borthCensusRegister.trim();
    }

    public String getBorthCard() {
        return borthCard;
    }

    public void setBorthCard(String borthCard) {
        this.borthCard = borthCard == null ? null : borthCard.trim();
    }

    public String getDeathCertificate() {
        return deathCertificate;
    }

    public void setDeathCertificate(String deathCertificate) {
        this.deathCertificate = deathCertificate == null ? null : deathCertificate.trim();
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister == null ? null : censusRegister.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getSpareField1() {
        return spareField1;
    }

    public void setSpareField1(Integer spareField1) {
        this.spareField1 = spareField1;
    }

    public String getSpareField2() {
        return spareField2;
    }

    public void setSpareField2(String spareField2) {
        this.spareField2 = spareField2 == null ? null : spareField2.trim();
    }

    public String getSpareField3() {
        return spareField3;
    }

    public void setSpareField3(String spareField3) {
        this.spareField3 = spareField3 == null ? null : spareField3.trim();
    }
}