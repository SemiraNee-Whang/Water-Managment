/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pat;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author semir
 */
public class DB {
    
   //Declare properties
private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
private final String url = "jdbc:ucanaccess://D:/Documents/NetBeansProjects/PAT/WaterDB.accdb";  //DB must be in project folder
private Connection connection;
private Statement statement;
private ResultSet resultSet;

//Constructor method
public DB()
{
    //Load driver
    try
    {
        Class.forName(driver);
        System.out.println("Driver found");
    }
    catch (ClassNotFoundException e) //Trap the error if the driver is not found
    {
        JOptionPane.showMessageDialog(null, "Error: Database Driver not found");
    }

    //Create connection
try {
        connection = DriverManager.getConnection(url);
        JOptionPane.showMessageDialog(null, "Connected successfully!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Unable to connect: " + e.getMessage());
        e.printStackTrace(); // print detailed error in console
    }
}





public ResultSet queryDB(String inStatement) throws SQLException
//This is the genetic query to execute a SELECT statement
{
    //Query the database
    statement = connection.createStatement();

    System.out.println(inStatement);

    resultSet = statement.executeQuery(inStatement);
    //Return data as a resultset
    return resultSet;
}

}   
