package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {
    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        List<String> result = new ArrayList<>();
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select breed from dinosaur where actual > expected;")) {
            addToListFromResultSet(result, stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
        Collections.sort(result);
        return result;
    }

    private void addToListFromResultSet(List<String> result, PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) {
                result.add(rs.getString("breed"));
            }
        }
    }
}
