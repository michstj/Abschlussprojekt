package com.company.LoggingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LogImplementation implements DaoLog {
    Connection myConn = CreateConn.getConn();


    @Override
    public void addLog(Log log) throws SQLException {

        PreparedStatement ps = myConn.prepareStatement("INSERT INTO log (id, variante, betrag, kurs, neuerbetrag) values (?,?,?,?,?)");
        ps.setNull(1, java.sql.Types.INTEGER);

        ps.setString(2,log.getVariante());
        ps.setDouble(3,log.getBetrag());
        ps.setDouble(4,log.getKurs());
        ps.setDouble(5,log.getNeuerbetrag());
        ps.executeUpdate();

        ps.close();

    }

    @Override
    public void deleteLog(int id) throws SQLException {
        PreparedStatement ps = myConn.prepareStatement("DELETE FROM log WHERE id = ?");
        ps.setInt(1, id);

        ps.executeUpdate();

        ps.close();

    }

    @Override
    public void UpdateLog(Log log) throws SQLException {
        PreparedStatement ps = myConn.prepareStatement("UPDATE log SET variante = ?, betrag = ?, kurs = ?, neuerbetrag = ?, WHERE id = ?");

        ps.setString(1,log.getVariante());
        ps.setDouble(2,log.getBetrag());
        ps.setDouble(3,log.getKurs());
        ps.setDouble(4,log.getNeuerbetrag());
        ps.setInt(5,log.getId());

        ps.executeUpdate();

        ps.close();
    }

    @Override
    public ResultSet getAllLogs() throws SQLException{
        ResultSet resultSet = myConn.createStatement().executeQuery("SELECT * FROM log");
        return resultSet;
    }

}
