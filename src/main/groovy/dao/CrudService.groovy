package dao

import javax.print.DocFlavor.STRING
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

class CrudService {
    String databaseUrl
    Connection connection
    Statement statement
    /**
     * tryconnecttodb(sqlite)
     * -DriverManager
     */

    //Constructor
    CrudService(String databaseUrl) {
        this.databaseUrl = databaseUrl
        this.connection = DriverManager.getConnection(databaseUrl)
        this.statement = connection.createStatement()
    }

    /**
     * todo : Create Table and Insert 1st roll
     *
     *      use Statement to do JDBCoperation
     *      using file to write sql
     */

    //Create
    void createRecored(String name, int rank, String effect, int attackForce, int defendForce) throws SQLException {
        String sql = "INSERT INTO monsterCard(name,rank,effect,attackForce,defendForce)VALUES('${name}',${rank},'${effect}',${attackForce},${defendForce})";
        statement.executeUpdate(sql);
    }


    //Update
    void updateRecoredName(String newName,String oldName) throws SQLException {
        statement.executeUpdate("UPDATE monsterCard   SET name='${newName}'    WHERE name='${oldName}' ")
    }

    //Delete
    void deleteRecord(String name)throws SQLException{
        statement.executeUpdate("DELETE FROM monsterCard WHERE(name='${name}')")
    }

    //Read Table-monsterCard
    String readRecord()throws SQLException{
        ResultSet resultSet = statement.executeQuery("SELECT * FROM monsterCard")
        //print read-result
        String returnReadRecoreds = ""
        while (resultSet.next()) {
            returnReadRecoreds+="${resultSet.getString('name')},${resultSet.getInt('rank')}\n" +
                    "${resultSet.getString('effect')}\n" +
                    "${resultSet.getInt('attackForce')},${resultSet.getInt('defendForce')}\n\n"
        }
        return returnReadRecoreds
    }


}
