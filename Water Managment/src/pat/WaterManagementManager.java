/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat;
    
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author semir
 */
public class WaterManagementManager {
   
    private DB  watermanagmentDB = new DB ();
    
    private ResultSet rs;
    
    public WaterManagementManager (){
        
    }
    
    public String getWaterData (){
        String out = "Source ID" + addSpaces("Source ID", 15) +
            "Source Name" + addSpaces("Source Name", 25) +
            "Source Type" + addSpaces("Source Type", 15) +
            "Province" + addSpaces("Province", 35) +
            "Sector" + addSpaces("Sector", 15) +
            "CapacityML" + addSpaces("CapacityML", 15) +
            "AllocatedML" + addSpaces("AllocatedML", 15) +
            "UsedML" + addSpaces("UsedML", 15) +
            "Date Recorded" + addSpaces("Date Recorded", 20) +
             "IsActive" + addSpaces("IsActive", 5) +"\n\n";
        
        String query = "SELECT * FROM WaterData";
        
        try 
        {
            rs = watermanagmentDB.queryDB(query);
            
            while (rs.next())
            {
            out += rs.getInt("SourceID") + addSpaces("" + rs.getInt("SourceID"), 15);
            out += rs.getString("SourceName") + addSpaces(rs.getString("SourceName"), 25);
            out += rs.getString("Source Type") + addSpaces(rs.getString("Source Type"), 15);
            out += rs.getString("Province") + addSpaces(rs.getString("Province"), 35);
            out += rs.getString("Sector") + addSpaces(rs.getString("Sector"), 15);
            out += rs.getInt("CapacityML") + addSpaces("" + rs.getInt("CapacityML"), 15);
            out += rs.getInt("AllocatedML") + addSpaces("" + rs.getInt("AllocatedML"), 15);
            out += rs.getInt("UsedML") + addSpaces("" + rs.getInt("UsedML"), 15);
            out += rs.getString("DateRecorded").substring(0,10) + addSpaces(rs.getString("DateRecorded").substring(0, 10), 20);
            out += rs.getString("IsActive") + addSpaces(rs.getString("IsActive"), 5) + "\n";
            }
        }
        catch (SQLException e)

        {
            JOptionPane.showMessageDialog(null, "Could  not read data");
        }
        return out;
    }
    
    private static String addSpaces (String s, int width){
         if (s == null) {
            s = "";
         }
         if (s.length() > width) {
        s = s.substring(0, width - 3) + "...";
    }
        String newString = "";
        for (int i = 0; i < width - s.length(); i++ ){
            newString += " ";
        }
        return newString;
    }
}
    