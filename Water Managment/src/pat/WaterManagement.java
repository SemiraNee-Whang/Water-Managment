/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat;

/**
 *
 * @author semir
 */
import java.util.Date;

public class WaterManagement {

    // Declaration of fields
    private int sourceID;
    private String sourceName;
    private String sourceType;
    private String province;
    private String sector;
    private int capacityML;
    private int allocatedML;
    private int usedML;
    private Date dateRecorded;
    private boolean isActive;

    // Parameterized constructor
    public WaterManagement(int id, String name, String type, String prov, String sect,
                           int capacity, int allocated, int used, Date date, boolean active) {
        // Set the fields to the parameter values
        sourceID = id;
        sourceName = name;
        sourceType = type;
        province = prov;
        sector = sect;
        capacityML = capacity;
        allocatedML = allocated;
        usedML = used;
        dateRecorded = date;
        isActive = active;
    }

    // Accessor methods (Getters)
    public int getSourceID() {
        return sourceID;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public String getProvince() {
        return province;
    }

    public String getSector() {
        return sector;
    }

    public int getCapacityML() {
        return capacityML;
    }

    public int getAllocatedML() {
        return allocatedML;
    }

    public int getUsedML() {
        return usedML;
    }

    public Date getDateRecorded() {
        return dateRecorded;
    }

    public boolean getIsActive() {
        return isActive;
    }

    // Mutator methods (Setters)
    public void setSourceID(int id) {
        sourceID = id;
    }

    public void setSourceName(String name) {
        sourceName = name;
    }

    public void setSourceType(String type) {
        sourceType = type;
    }

    public void setProvince(String prov) {
        province = prov;
    }

    public void setSector(String sect) {
        sector = sect;
    }

    public void setCapacityML(int capacity) {
        capacityML = capacity;
    }

    public void setAllocatedML(int allocated) {
        allocatedML = allocated;
    }

    public void setUsedML(int used) {
        usedML = used;
    }

    public void setDateRecorded(Date date) {
        dateRecorded = date;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    // Return a text value of whether the water source is active (Yes/No)
    private String getIsActiveText() {
        return isActive ? "Yes" : "No";
    }

    // Calculate the remaining water in the source
    public int calcRemainingML() {
        return capacityML - usedML;
    }

    // toString method - returns a neat string representation of the WaterManagement object
  
    public String toString() {
        return "Source ID: " + sourceID + "\n" +
               "Source Name: " + sourceName + "\n" +
               "Source Type: " + sourceType + "\n" +
               "Province: " + province + "\n" +
               "Sector: " + sector + "\n" +
               "Capacity: " + capacityML + " ML\n" +
               "Allocated: " + allocatedML + " ML\n" +
               "Used: " + usedML + " ML\n" +
               "Remaining: " + calcRemainingML() + " ML\n" +
               "Date Recorded: " + dateRecorded + "\n" +
               "Active: " + getIsActiveText();
    }
}
