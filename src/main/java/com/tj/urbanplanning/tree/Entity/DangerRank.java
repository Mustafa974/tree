package com.tj.urbanplanning.tree.Entity;

import java.io.Serializable;
import java.util.Date;

public class DangerRank implements Serializable {
    private Integer id;

    private Date diagnoseDate;

    private String diagnoser;

    private Date lastDiagDate;

    private String treeSpecies;

    private Integer treeNumber;

    private Integer vigour;

    private Integer thickstem;

    private Integer stems;

    private Integer branches;

    private Integer base;

    private Integer diagNeccessity;

    private Short diagHeight;

    private Integer note;

    private Integer holePosition;

    private Short trimTraceSize;

    private Short trimTraceQuantity;

    private String dangerRankcol;

    private String noteOthers;

    private Integer uprooted;

    private Integer wreck;

    private Integer thickstemWreck;

    private Integer branchFall;

    private Integer tilt;

    private String riskOthers;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDiagnoseDate() {
        return diagnoseDate;
    }

    public void setDiagnoseDate(Date diagnoseDate) {
        this.diagnoseDate = diagnoseDate;
    }

    public String getDiagnoser() {
        return diagnoser;
    }

    public void setDiagnoser(String diagnoser) {
        this.diagnoser = diagnoser == null ? null : diagnoser.trim();
    }

    public Date getLastDiagDate() {
        return lastDiagDate;
    }

    public void setLastDiagDate(Date lastDiagDate) {
        this.lastDiagDate = lastDiagDate;
    }

    public String getTreeSpecies() {
        return treeSpecies;
    }

    public void setTreeSpecies(String treeSpecies) {
        this.treeSpecies = treeSpecies == null ? null : treeSpecies.trim();
    }

    public Integer getTreeNumber() {
        return treeNumber;
    }

    public void setTreeNumber(Integer treeNumber) {
        this.treeNumber = treeNumber;
    }

    public Integer getVigour() {
        return vigour;
    }

    public void setVigour(Integer vigour) {
        this.vigour = vigour;
    }

    public Integer getThickstem() {
        return thickstem;
    }

    public void setThickstem(Integer thickstem) {
        this.thickstem = thickstem;
    }

    public Integer getStems() {
        return stems;
    }

    public void setStems(Integer stems) {
        this.stems = stems;
    }

    public Integer getBranches() {
        return branches;
    }

    public void setBranches(Integer branches) {
        this.branches = branches;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getDiagNeccessity() {
        return diagNeccessity;
    }

    public void setDiagNeccessity(Integer diagNeccessity) {
        this.diagNeccessity = diagNeccessity;
    }

    public Short getDiagHeight() {
        return diagHeight;
    }

    public void setDiagHeight(Short diagHeight) {
        this.diagHeight = diagHeight;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getHolePosition() {
        return holePosition;
    }

    public void setHolePosition(Integer holePosition) {
        this.holePosition = holePosition;
    }

    public Short getTrimTraceSize() {
        return trimTraceSize;
    }

    public void setTrimTraceSize(Short trimTraceSize) {
        this.trimTraceSize = trimTraceSize;
    }

    public Short getTrimTraceQuantity() {
        return trimTraceQuantity;
    }

    public void setTrimTraceQuantity(Short trimTraceQuantity) {
        this.trimTraceQuantity = trimTraceQuantity;
    }

    public String getDangerRankcol() {
        return dangerRankcol;
    }

    public void setDangerRankcol(String dangerRankcol) {
        this.dangerRankcol = dangerRankcol == null ? null : dangerRankcol.trim();
    }

    public String getNoteOthers() {
        return noteOthers;
    }

    public void setNoteOthers(String noteOthers) {
        this.noteOthers = noteOthers == null ? null : noteOthers.trim();
    }

    public Integer getUprooted() {
        return uprooted;
    }

    public void setUprooted(Integer uprooted) {
        this.uprooted = uprooted;
    }

    public Integer getWreck() {
        return wreck;
    }

    public void setWreck(Integer wreck) {
        this.wreck = wreck;
    }

    public Integer getThickstemWreck() {
        return thickstemWreck;
    }

    public void setThickstemWreck(Integer thickstemWreck) {
        this.thickstemWreck = thickstemWreck;
    }

    public Integer getBranchFall() {
        return branchFall;
    }

    public void setBranchFall(Integer branchFall) {
        this.branchFall = branchFall;
    }

    public Integer getTilt() {
        return tilt;
    }

    public void setTilt(Integer tilt) {
        this.tilt = tilt;
    }

    public String getRiskOthers() {
        return riskOthers;
    }

    public void setRiskOthers(String riskOthers) {
        this.riskOthers = riskOthers == null ? null : riskOthers.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diagnoseDate=").append(diagnoseDate);
        sb.append(", diagnoser=").append(diagnoser);
        sb.append(", lastDiagDate=").append(lastDiagDate);
        sb.append(", treeSpecies=").append(treeSpecies);
        sb.append(", treeNumber=").append(treeNumber);
        sb.append(", vigour=").append(vigour);
        sb.append(", thickstem=").append(thickstem);
        sb.append(", stems=").append(stems);
        sb.append(", branches=").append(branches);
        sb.append(", base=").append(base);
        sb.append(", diagNeccessity=").append(diagNeccessity);
        sb.append(", diagHeight=").append(diagHeight);
        sb.append(", note=").append(note);
        sb.append(", holePosition=").append(holePosition);
        sb.append(", trimTraceSize=").append(trimTraceSize);
        sb.append(", trimTraceQuantity=").append(trimTraceQuantity);
        sb.append(", dangerRankcol=").append(dangerRankcol);
        sb.append(", noteOthers=").append(noteOthers);
        sb.append(", uprooted=").append(uprooted);
        sb.append(", wreck=").append(wreck);
        sb.append(", thickstemWreck=").append(thickstemWreck);
        sb.append(", branchFall=").append(branchFall);
        sb.append(", tilt=").append(tilt);
        sb.append(", riskOthers=").append(riskOthers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}