package com.ehootu.census.model;

import java.util.Date;
/**
 * @Author: KongXiaoPing
 * @Date: 2017/12/28 10:27
 * @Description: 户籍登记表
 */
public class CensusRegister {


    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 出生日期
     */
    private Date birthDate;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 现在户口所在地
     */
    private String currentCensusRegisterPlace;
    /**
     * 性别（0 女 1男）
     */
    private String gender;
    /**
     * 配偶姓名
     */
    private String spouseName;
    /**
     * 结婚时间
     */
    private Date marriedTime;
    /**
     * 新生儿姓名
     */
    private String newbornName;
    /**
     * 新生儿性别（0 女 1男）
     */
    private String newbornGender;
    /**
     * 新生儿出生时间
     */
    private Date newbornBirthDate;
    /**
     * 与死亡人员关系
     */
    private String relation;
    /**
     * 注销人姓名
     */
    private String cancelledPersonName;
    /**
     * 注销人出生时间
     */
    private Date cancelledPersonBirthDate;
    /**
     * 注销人身份证号
     */
    private String cancelledPersonIdNumber;
    /**
     * 注销人死亡原因
     */
    private String cancelledPersonCauseDeath;
    /**
     * 附件表关联id
     */
    private Integer attachmentId;
    /**
     * 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销
     */
    private Integer currentCensusType;
    /**
     * 状态：0-迁入入户;1-迁出2-迁移3-注销
     */
    private Integer currentCensusStatus;
    /**
     * 登录用户（操作人）
     */
    private Integer userId;
    /**
     * 提交时间
     */
    private Date submitTime;
    /**
     * 警员id
     */
    private Integer policeId;
    /**
     * 所属派出所
     */
    private String policeStation;
    /**
     * 所属警务室
     */
    private String policeOffice;
    /**
     * 所属工作站
     */
    private String workStation;
    /**
     * 所属行政区划
     */
    private String administrativeDivision;
    /**
     * 操作来源（1 微信端 2 户政大厅 保留字段，目前不用）
     */
    private String operationType;
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

    public CensusRegister() {
    }

    public CensusRegister(InputCensus inputCensus) {
        this.name = inputCensus.getName();
        this.birthDate = inputCensus.getBirthDate();
        this.idNumber = inputCensus.getIdNumber();
        this.currentCensusRegisterPlace = inputCensus.getCurrentCensusRegisterPlace();
        this.gender = inputCensus.getGender();
        this.spouseName = inputCensus.getSpouseName();
        this.marriedTime = inputCensus.getMarriedTime();
        this.newbornName = inputCensus.getNewbornName();
        this.newbornGender = inputCensus.getNewbornGender();
        this.relation = inputCensus.getRelation();
        this.cancelledPersonName = inputCensus.getCancelledPersonName();
        this.cancelledPersonBirthDate = inputCensus.getCancelledPersonBirthDate();
        this.cancelledPersonIdNumber = inputCensus.getCancelledPersonIdNumber();
        this.cancelledPersonCauseDeath = inputCensus.getCancelledPersonCauseDeath();



        this.newbornBirthDate = inputCensus.getNewbornBirthDate();
        this.attachmentId = inputCensus.getAttachmentId();
        this.currentCensusType = inputCensus.getCurrentCensusType();
        this.currentCensusStatus = inputCensus.getCurrentCensusStatus();
        this.userId = inputCensus.getUserId();
        this.submitTime = inputCensus.getSubmitTime();
        this.policeId = inputCensus.getPoliceId();
        this.policeStation = inputCensus.getPoliceStation();
        this.policeOffice = inputCensus.getPoliceOffice();
        this.workStation = inputCensus.getWorkStation();
        this.administrativeDivision = inputCensus.getAdministrativeDivision();
        this.operationType = inputCensus.getOperationType();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getCurrentCensusRegisterPlace() {
        return currentCensusRegisterPlace;
    }

    public void setCurrentCensusRegisterPlace(String currentCensusRegisterPlace) {
        this.currentCensusRegisterPlace = currentCensusRegisterPlace == null ? null : currentCensusRegisterPlace.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public Date getMarriedTime() {
        return marriedTime;
    }

    public void setMarriedTime(Date marriedTime) {
        this.marriedTime = marriedTime;
    }

    public String getNewbornName() {
        return newbornName;
    }

    public void setNewbornName(String newbornName) {
        this.newbornName = newbornName == null ? null : newbornName.trim();
    }

    public String getNewbornGender() {
        return newbornGender;
    }

    public void setNewbornGender(String newbornGender) {
        this.newbornGender = newbornGender == null ? null : newbornGender.trim();
    }

    public Date getNewbornBirthDate() {
        return newbornBirthDate;
    }

    public void setNewbornBirthDate(Date newbornBirthDate) {
        this.newbornBirthDate = newbornBirthDate;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getCancelledPersonName() {
        return cancelledPersonName;
    }

    public void setCancelledPersonName(String cancelledPersonName) {
        this.cancelledPersonName = cancelledPersonName == null ? null : cancelledPersonName.trim();
    }

    public Date getCancelledPersonBirthDate() {
        return cancelledPersonBirthDate;
    }

    public void setCancelledPersonBirthDate(Date cancelledPersonBirthDate) {
        this.cancelledPersonBirthDate = cancelledPersonBirthDate;
    }

    public String getCancelledPersonIdNumber() {
        return cancelledPersonIdNumber;
    }

    public void setCancelledPersonIdNumber(String cancelledPersonIdNumber) {
        this.cancelledPersonIdNumber = cancelledPersonIdNumber == null ? null : cancelledPersonIdNumber.trim();
    }

    public String getCancelledPersonCauseDeath() {
        return cancelledPersonCauseDeath;
    }

    public void setCancelledPersonCauseDeath(String cancelledPersonCauseDeath) {
        this.cancelledPersonCauseDeath = cancelledPersonCauseDeath == null ? null : cancelledPersonCauseDeath.trim();
    }

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getCurrentCensusType() {
        return currentCensusType;
    }

    public void setCurrentCensusType(Integer currentCensusType) {
        this.currentCensusType = currentCensusType;
    }

    public Integer getCurrentCensusStatus() {
        return currentCensusStatus;
    }

    public void setCurrentCensusStatus(Integer currentCensusStatus) {
        this.currentCensusStatus = currentCensusStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation == null ? null : policeStation.trim();
    }

    public String getPoliceOffice() {
        return policeOffice;
    }

    public void setPoliceOffice(String policeOffice) {
        this.policeOffice = policeOffice == null ? null : policeOffice.trim();
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation == null ? null : workStation.trim();
    }

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision == null ? null : administrativeDivision.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
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
}