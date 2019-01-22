package com.company.LoggingDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoLog {

    public void addLog(Log log) throws SQLException;
    public void deleteLog(int id) throws SQLException;
    public void UpdateLog(Log log) throws  SQLException;
    public ResultSet getAllLogs() throws SQLException;
}
