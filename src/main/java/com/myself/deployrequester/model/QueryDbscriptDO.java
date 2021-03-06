package com.myself.deployrequester.model;

/**
 * Created by QueRenJie on ${date}
 */
public class QueryDbscriptDO {
    private Short projectid;
    private Short moduleid;
    private String dbscript;
    private String description;
    private String applier;
    private String applierip;
    private String formatedCreatetimeBegin;
    private String formatedCreatetimeEnd;
    private String executor;
    private String executorip;
    private String formatedExecutetimeBegin;
    private String formatedExecutetimeEnd;
    private Short executestatus;
    private String failuremsg;
    private Short belong;
    private Short isabandoned;
    private String sqlmd5;
    private String showExcuteOption;        //'yes'表示只显示需要执行的脚本,否则全都显示。
    private Short executestatusForSync;             //同步脚本的执行状态
    private String showExcuteOptionForSync;         //同步脚本的，'yes'表示只显示需要执行的脚本,否则全都显示。
    private Short canexecute;                   //是否可以随时执行。0：暂时不可执行；1：可以随时执行
    private String formatedExecutetimeforsyncBegin;
    private String formatedExecutetimeforsyncEnd;

    public Short getProjectid() {
        return projectid;
    }

    public void setProjectid(Short projectid) {
        this.projectid = projectid;
    }

    public Short getModuleid() {
        return moduleid;
    }

    public void setModuleid(Short moduleid) {
        this.moduleid = moduleid;
    }

    public String getDbscript() {
        return dbscript;
    }

    public void setDbscript(String dbscript) {
        this.dbscript = dbscript;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplier() {
        return applier;
    }

    public void setApplier(String applier) {
        this.applier = applier;
    }

    public String getApplierip() {
        return applierip;
    }

    public void setApplierip(String applierip) {
        this.applierip = applierip;
    }

    public String getFormatedCreatetimeBegin() {
        return formatedCreatetimeBegin;
    }

    public void setFormatedCreatetimeBegin(String formatedCreatetimeBegin) {
        this.formatedCreatetimeBegin = formatedCreatetimeBegin;
    }

    public String getFormatedCreatetimeEnd() {
        return formatedCreatetimeEnd;
    }

    public void setFormatedCreatetimeEnd(String formatedCreatetimeEnd) {
        this.formatedCreatetimeEnd = formatedCreatetimeEnd;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getExecutorip() {
        return executorip;
    }

    public void setExecutorip(String executorip) {
        this.executorip = executorip;
    }

    public String getFormatedExecutetimeBegin() {
        return formatedExecutetimeBegin;
    }

    public void setFormatedExecutetimeBegin(String formatedExecutetimeBegin) {
        this.formatedExecutetimeBegin = formatedExecutetimeBegin;
    }

    public String getFormatedExecutetimeEnd() {
        return formatedExecutetimeEnd;
    }

    public void setFormatedExecutetimeEnd(String formatedExecutetimeEnd) {
        this.formatedExecutetimeEnd = formatedExecutetimeEnd;
    }

    public Short getExecutestatus() {
        return executestatus;
    }

    public void setExecutestatus(Short executestatus) {
        this.executestatus = executestatus;
    }

    public String getFailuremsg() {
        return failuremsg;
    }

    public void setFailuremsg(String failuremsg) {
        this.failuremsg = failuremsg;
    }

    public Short getBelong() {
        return belong;
    }

    public void setBelong(Short belong) {
        this.belong = belong;
    }

    public Short getIsabandoned() {
        return isabandoned;
    }

    public void setIsabandoned(Short isabandoned) {
        this.isabandoned = isabandoned;
    }

    public String getSqlmd5() {
        return sqlmd5;
    }

    public void setSqlmd5(String sqlmd5) {
        this.sqlmd5 = sqlmd5;
    }

    public String getShowExcuteOption() {
        return showExcuteOption;
    }

    public void setShowExcuteOption(String showExcuteOption) {
        this.showExcuteOption = showExcuteOption;
    }

    public Short getExecutestatusForSync() {
        return executestatusForSync;
    }

    public void setExecutestatusForSync(Short executestatusForSync) {
        this.executestatusForSync = executestatusForSync;
    }

    public String getShowExcuteOptionForSync() {
        return showExcuteOptionForSync;
    }

    public void setShowExcuteOptionForSync(String showExcuteOptionForSync) {
        this.showExcuteOptionForSync = showExcuteOptionForSync;
    }

    public Short getCanexecute() {
        return canexecute;
    }

    public void setCanexecute(Short canexecute) {
        this.canexecute = canexecute;
    }

    public String getFormatedExecutetimeforsyncBegin() {
        return formatedExecutetimeforsyncBegin;
    }

    public void setFormatedExecutetimeforsyncBegin(String formatedExecutetimeforsyncBegin) {
        this.formatedExecutetimeforsyncBegin = formatedExecutetimeforsyncBegin;
    }

    public String getFormatedExecutetimeforsyncEnd() {
        return formatedExecutetimeforsyncEnd;
    }

    public void setFormatedExecutetimeforsyncEnd(String formatedExecutetimeforsyncEnd) {
        this.formatedExecutetimeforsyncEnd = formatedExecutetimeforsyncEnd;
    }
}
