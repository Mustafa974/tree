package com.tj.urbanplanning.tree.Entity;

import java.io.Serializable;
import java.util.Date;

public class TreeRecord implements Serializable {
    private Integer id;

    private Integer number;

    private Integer oldNum;

    private Date recordDate;

    private String climate;

    private String investigator;

    private String treeSpecies;

    private String treeScientificName;

    private String position;

    private String owner;

    private Integer condition;

    private Short area;

    private Short avgTemperature;

    private Short heigTemperature;

    private Short lowTemperature;

    private Short annualPrecipitation;

    private Integer year;

    private Short windSpeed;

    private String place;

    private Integer surroundCondition;

    private Short scArea;

    private String sunlightReason;

    private Integer soil;

    private Integer terrain;

    private Integer surroundHerb;

    private Integer surroundWoody;

    private Integer surroundRelation;

    private Integer handrail;

    private Short handrailHeight;

    private String handrailMaterial;

    private Short handrailArea;

    private Integer handrailYear;

    private Integer pillar;

    private Integer trim;

    private Integer fertilization;

    private Integer fertiTpy;

    private Integer fertiType;

    private Short treeHeight;

    private Integer treeAge;

    private Short treeGirth;

    private String treeBark;

    private Integer treeBaseCondition;

    private Short soilThickness;

    private String soilType;

    private String others;

    private String records;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOldNum() {
        return oldNum;
    }

    public void setOldNum(Integer oldNum) {
        this.oldNum = oldNum;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate == null ? null : climate.trim();
    }

    public String getInvestigator() {
        return investigator;
    }

    public void setInvestigator(String investigator) {
        this.investigator = investigator == null ? null : investigator.trim();
    }

    public String getTreeSpecies() {
        return treeSpecies;
    }

    public void setTreeSpecies(String treeSpecies) {
        this.treeSpecies = treeSpecies == null ? null : treeSpecies.trim();
    }

    public String getTreeScientificName() {
        return treeScientificName;
    }

    public void setTreeScientificName(String treeScientificName) {
        this.treeScientificName = treeScientificName == null ? null : treeScientificName.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Short getArea() {
        return area;
    }

    public void setArea(Short area) {
        this.area = area;
    }

    public Short getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(Short avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public Short getHeigTemperature() {
        return heigTemperature;
    }

    public void setHeigTemperature(Short heigTemperature) {
        this.heigTemperature = heigTemperature;
    }

    public Short getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(Short lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public Short getAnnualPrecipitation() {
        return annualPrecipitation;
    }

    public void setAnnualPrecipitation(Short annualPrecipitation) {
        this.annualPrecipitation = annualPrecipitation;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Short getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Short windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getSurroundCondition() {
        return surroundCondition;
    }

    public void setSurroundCondition(Integer surroundCondition) {
        this.surroundCondition = surroundCondition;
    }

    public Short getScArea() {
        return scArea;
    }

    public void setScArea(Short scArea) {
        this.scArea = scArea;
    }

    public String getSunlightReason() {
        return sunlightReason;
    }

    public void setSunlightReason(String sunlightReason) {
        this.sunlightReason = sunlightReason == null ? null : sunlightReason.trim();
    }

    public Integer getSoil() {
        return soil;
    }

    public void setSoil(Integer soil) {
        this.soil = soil;
    }

    public Integer getTerrain() {
        return terrain;
    }

    public void setTerrain(Integer terrain) {
        this.terrain = terrain;
    }

    public Integer getSurroundHerb() {
        return surroundHerb;
    }

    public void setSurroundHerb(Integer surroundHerb) {
        this.surroundHerb = surroundHerb;
    }

    public Integer getSurroundWoody() {
        return surroundWoody;
    }

    public void setSurroundWoody(Integer surroundWoody) {
        this.surroundWoody = surroundWoody;
    }

    public Integer getSurroundRelation() {
        return surroundRelation;
    }

    public void setSurroundRelation(Integer surroundRelation) {
        this.surroundRelation = surroundRelation;
    }

    public Integer getHandrail() {
        return handrail;
    }

    public void setHandrail(Integer handrail) {
        this.handrail = handrail;
    }

    public Short getHandrailHeight() {
        return handrailHeight;
    }

    public void setHandrailHeight(Short handrailHeight) {
        this.handrailHeight = handrailHeight;
    }

    public String getHandrailMaterial() {
        return handrailMaterial;
    }

    public void setHandrailMaterial(String handrailMaterial) {
        this.handrailMaterial = handrailMaterial == null ? null : handrailMaterial.trim();
    }

    public Short getHandrailArea() {
        return handrailArea;
    }

    public void setHandrailArea(Short handrailArea) {
        this.handrailArea = handrailArea;
    }

    public Integer getHandrailYear() {
        return handrailYear;
    }

    public void setHandrailYear(Integer handrailYear) {
        this.handrailYear = handrailYear;
    }

    public Integer getPillar() {
        return pillar;
    }

    public void setPillar(Integer pillar) {
        this.pillar = pillar;
    }

    public Integer getTrim() {
        return trim;
    }

    public void setTrim(Integer trim) {
        this.trim = trim;
    }

    public Integer getFertilization() {
        return fertilization;
    }

    public void setFertilization(Integer fertilization) {
        this.fertilization = fertilization;
    }

    public Integer getFertiTpy() {
        return fertiTpy;
    }

    public void setFertiTpy(Integer fertiTpy) {
        this.fertiTpy = fertiTpy;
    }

    public Integer getFertiType() {
        return fertiType;
    }

    public void setFertiType(Integer fertiType) {
        this.fertiType = fertiType;
    }

    public Short getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(Short treeHeight) {
        this.treeHeight = treeHeight;
    }

    public Integer getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(Integer treeAge) {
        this.treeAge = treeAge;
    }

    public Short getTreeGirth() {
        return treeGirth;
    }

    public void setTreeGirth(Short treeGirth) {
        this.treeGirth = treeGirth;
    }

    public String getTreeBark() {
        return treeBark;
    }

    public void setTreeBark(String treeBark) {
        this.treeBark = treeBark == null ? null : treeBark.trim();
    }

    public Integer getTreeBaseCondition() {
        return treeBaseCondition;
    }

    public void setTreeBaseCondition(Integer treeBaseCondition) {
        this.treeBaseCondition = treeBaseCondition;
    }

    public Short getSoilThickness() {
        return soilThickness;
    }

    public void setSoilThickness(Short soilThickness) {
        this.soilThickness = soilThickness;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType == null ? null : soilType.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records == null ? null : records.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", oldNum=").append(oldNum);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", climate=").append(climate);
        sb.append(", investigator=").append(investigator);
        sb.append(", treeSpecies=").append(treeSpecies);
        sb.append(", treeScientificName=").append(treeScientificName);
        sb.append(", position=").append(position);
        sb.append(", owner=").append(owner);
        sb.append(", condition=").append(condition);
        sb.append(", area=").append(area);
        sb.append(", avgTemperature=").append(avgTemperature);
        sb.append(", heigTemperature=").append(heigTemperature);
        sb.append(", lowTemperature=").append(lowTemperature);
        sb.append(", annualPrecipitation=").append(annualPrecipitation);
        sb.append(", year=").append(year);
        sb.append(", windSpeed=").append(windSpeed);
        sb.append(", place=").append(place);
        sb.append(", surroundCondition=").append(surroundCondition);
        sb.append(", scArea=").append(scArea);
        sb.append(", sunlightReason=").append(sunlightReason);
        sb.append(", soil=").append(soil);
        sb.append(", terrain=").append(terrain);
        sb.append(", surroundHerb=").append(surroundHerb);
        sb.append(", surroundWoody=").append(surroundWoody);
        sb.append(", surroundRelation=").append(surroundRelation);
        sb.append(", handrail=").append(handrail);
        sb.append(", handrailHeight=").append(handrailHeight);
        sb.append(", handrailMaterial=").append(handrailMaterial);
        sb.append(", handrailArea=").append(handrailArea);
        sb.append(", handrailYear=").append(handrailYear);
        sb.append(", pillar=").append(pillar);
        sb.append(", trim=").append(trim);
        sb.append(", fertilization=").append(fertilization);
        sb.append(", fertiTpy=").append(fertiTpy);
        sb.append(", fertiType=").append(fertiType);
        sb.append(", treeHeight=").append(treeHeight);
        sb.append(", treeAge=").append(treeAge);
        sb.append(", treeGirth=").append(treeGirth);
        sb.append(", treeBark=").append(treeBark);
        sb.append(", treeBaseCondition=").append(treeBaseCondition);
        sb.append(", soilThickness=").append(soilThickness);
        sb.append(", soilType=").append(soilType);
        sb.append(", others=").append(others);
        sb.append(", records=").append(records);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}