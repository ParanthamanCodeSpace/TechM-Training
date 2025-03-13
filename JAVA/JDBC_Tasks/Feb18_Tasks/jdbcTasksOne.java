package JDBCTasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTasksOne {

    static String url = "your/jdbc/url/with/dbname";
    static String username = "your/username";
    //Give the password to access MySQL server
    static String password = "your/password";

    public static void main(String[] args) throws SQLException {

        jdbcTasksOne task = new jdbcTasksOne();
        task.connectToDatabase();

        Scanner scanner = new Scanner(System.in);
        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;

        try {
            System.out.println("Welcome to the JDBC CRUD Operations Program!");
            System.out.println("This program allows you to perform CRUD operations on the 'Persons' table.");
            System.out.println("Choose an operation to perform:");

            System.out.println("1. Insert a record (using Statement)");
            System.out.println("2. Insert a record (using PreparedStatement)");
            System.out.println("3. Display all records (using Statement)");
            System.out.println("4. Display all records (using PreparedStatement)");
            System.out.println("5. Update a record (using Statement)");
            System.out.println("6. Update a record (using PreparedStatement)");
            System.out.println("7. Delete a record (using Statement)");
            System.out.println("8. Delete a record (using PreparedStatement)");
            System.out.println("9. Exit");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {

                case 1:
                    irus();
                    break;

                case 2:
                    irups(450, "AIR DECCAN", "KOLKATA", "NEW DELHI", "Delayed");
                    break;

                case 3:
                    drus();
                    break;

                case 4:
                    drups(450);
                    break;

                case 5:
                    srus();
                    break;

                case 6:
                    srups(450);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (connect != null) connect.close();
                if (statement != null) statement.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                System.out.println("Erroe closing connection" + e.getMessage());
            }
        }
    }

    public void connectToDatabase() {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("✅ Connected to MySQL database successfully!");
        } catch (SQLException e) {
            System.err.println("❌ Connection failed!");
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(); // Print full error details
        }
    }

    public static void irus() throws SQLException {
        String query = "INSERT INTO Flights VALUES (456,'INDIGO','CHENNAI','BANGLORE','On Time')";
        Connection connect = DriverManager.getConnection(url, username, password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected: " + row);
        connect.close();
    }

    public static void irups(int FlightID, String Airline, String DepartureLocation, String ArrivalLocation, String Status) throws SQLException {
        String query = "INSERT INTO Flights values(?,?,?,?,?)";
        Connection connect = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connect.prepareStatement(query);
        ps.setInt(1, FlightID);
        ps.setString(2, Airline);
        ps.setString(3, DepartureLocation);
        ps.setString(4, ArrivalLocation);
        ps.setString(5, Status);
        System.out.println("Number of rows affected: " + ps.executeUpdate());
        connect.close();
    }

    public static void srus() throws SQLException {
        String query = "SELECT * FROM Flights";
        Connection connect = DriverManager.getConnection(url, username, password);
        Statement statement = connect.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {

            System.out.print("\nId:" + rs.getInt(1));
            System.out.print("\nAirline:" + rs.getString(2));
            System.out.print("\nDepartureLocation:" + rs.getString(3));
            System.out.print("\nArrivalLocation:" + rs.getString(4));
            System.out.print("\nStatus:" + rs.getString(5));
        }
        connect.close();
    }

    public static void srups(int FlightID) throws SQLException {
        String query = "SELECT * From Flights where FlightID= ?";
        Connection connect = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connect.prepareStatement(query);
        ps.setInt(1, FlightID);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nAirline:" + rs.getString(2));
            System.out.print("\nDepartureLocation:" + rs.getString(3));
            System.out.print("\nArrivalLocation:" + rs.getString(4));
            System.out.print("\nStatus:" + rs.getString(5));
        }
        connect.close();
    }

    public static void drus() throws SQLException {
        // Step 1 - Write the delete query
        String query = "DELETE FROM Flights WHERE FlightID = 456;";
        Connection connect = DriverManager.getConnection(url, username, password);
        Statement st = connect.createStatement();
        int rowsAffected = st.executeUpdate(query);
        System.out.println("Number of rows affected: " + rowsAffected);
        connect.close();
    }

    public static void drups(int flightId) throws SQLException {
        // Step 1 - Write the delete query with a placeholder (?)
        String query = "DELETE FROM Flights WHERE FlightID = ?;";
        Connection connect = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1, flightId);
        int rowsAffected = pst.executeUpdate();
        System.out.println("Number of rows affected: " + rowsAffected);
        connect.close();
    }

}
