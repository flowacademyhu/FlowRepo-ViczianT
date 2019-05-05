import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/java_test", "postgres", "cukicicn86");
        } catch (SQLException f) {
            System.err.println("Connection Failed " + f.getMessage());
        }

        System.out.println(getRecord(connection));

        // addRecord(new PhonebookEntry(134, "0123456789", "oanfgpn", "oasfngian"), connection);

        // addAgain(new PhonebookEntry(1111, "06201231231", "NINCS", "nem is volt"), connection);

        // delete(new PhonebookEntry(5), connection);

        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            String x = scn.nextLine();
            switch (x) {
                case "GetRecord":
                    System.out.println(getRecord(connection));
                    break;
                }
            }
        scn.close();

    }

    public static List<PhonebookEntry> getRecord(Connection con) {
        List<PhonebookEntry> result = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = con.prepareStatement("select * from phonebook;");
            ResultSet queryResult = preparedStatement.executeQuery();
            while (queryResult.next()) {
                int id = queryResult.getInt(1);
                String telno = queryResult.getString(2);
                String name = queryResult.getString(3);
                String description = queryResult.getString(4);
                result.add(new PhonebookEntry(id, telno, name, description));
            }
        } catch (SQLException e) {
            System.err.println("Fuck ya!! " + e.getMessage());
        }
        // StringBuilder sb = new StringBuilder();
        // sb.append(result);
        // System.out.println(sb);
        return result;
    }

    public static boolean addRecord(PhonebookEntry entry, Connection con) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into phonebook (telno, name, description) values (" + "'" + entry.getTelno()
                    +"'" + ", " + "'" + entry.getName() +"', '" + entry.getDescription() + "');");
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("elbasztad " + e.getMessage());
        }
        return true;
    }

    public static boolean addAgain(PhonebookEntry entry, Connection con) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("insert into phonebook (telno, name, description) values (?, ?, ?);");
            preparedStatement.setString(1, entry.getTelno());
            preparedStatement.setString(2, entry.getName());
            preparedStatement.setString(3, entry.getDescription());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("Megint elbasztad...");
        }
        return true;
    }

    public static void delete(PhonebookEntry entry, Connection con) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("delete from phonebook where id=?;");
            preparedStatement.setInt(1, entry.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("Seggedet töröld ki, azt!");
        }
    }

    public static void getByName(Connection con) {

    }
}
