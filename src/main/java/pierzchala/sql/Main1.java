package pierzchala.sql;

import javax.sql.DataSource;
import java.sql.*;

public class Main1 {
    public static DataSource dataSource;

    public static void main(String[] args) {

    }

    public static void test(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex?useSSL=false&characterEncoding=utf8",
                    "root", "coderslab");
            stmt = conn.prepareStatement("select id, firstname, lastname, salaryfrom " +
                    "employee where id=?");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
//            Employe eemployee = null;
            if (rs.next()) {
//                employee = newEmployee(); Tworzymy obiekt z danych
//                employee.setId(rs.getLong("id"));
//                employee.setFirstName(rs.getString("firstname"));
//                employee.setLastName(rs.getString("lastname"));
//                employee.setSalary(rs.getBigDecimal("salary"));
            }
//            return employee;

        } catch (SQLException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }

    }


    private static final String SQL_UPDATE_SPITTER = "update spitter set username = ?, password = ?, fullname = ? " + "where id = ?";

    //    public void saveSpitter(Spitter spitter) {
    public void saveSpitter() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE_SPITTER);
//            stmt.setString(1, spitter.getUsername());
//            stmt.setString(2, spitter.getPassword());
//            stmt.setString(3, spitter.getFullName());
//            stmt.setLong(4, spitter.getId());
            stmt.execute();
        } catch (SQLException e) {

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {

            }
        }
    }


    private static final String SQL_SELECT_SPITTER = "select id, username, fullname from spitter where id = ?";

    public void findOne(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

            conn = dataSource.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_SPITTER);
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
//            Spitter spitter = null;
            if (rs.next()) {
//                spitter = newSpitter();
//                spitter.setId(rs.getLong("id"));
//                spitter.setUsername(rs.getString("username"));
//                spitter.setPassword(rs.getString("password"));
//                spitter.setFullName(rs.getString("fullname"));
            }

        } catch (SQLException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }

    }

    public void findOne(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement("select id, name, type from Ingredient where id = ?");
            statement.setString(1, id);
            resultSet = statement.executeQuery();

            if(resultSet.next()) {
//                ingredient = new Ingredient(
//                        resultSet.getString("id"),
//                        resultSet.getString("name"),
//                        Ingredient.Type.valueOf(resultSet.getString("type")));
            }

        } catch (SQLException e) {
// Co powinno być tutaj zrobione?
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {}
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {}
            }

        }

    }
}
