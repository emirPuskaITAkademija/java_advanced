package com.itakademija.mysql.two;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * JDBC biblioteka u Javi nije implementacija konekcije na bazu(Connection, PreparedStatement, ResultSet)..
 * <p>
 * Driver : koji implementira te interfejse definirane u JDBC biblioteci
 * MySQL driver
 * MariaDB driver
 * ORacle driver
 * Postgres driver
 * <p>
 * Kada se povezujemo s bazom podataka(MySQL, MariaDB, Postgres, Oracle..) iz Java Programa:
 * 1. Povezati se na izvor podataka: BAZA -> Connection
 * 2. Slati SQL upit(SELECT * FROM persons) -> Statement, PreparedStatement...
 * 3. Evaluirati rezultat upita -> ResultSet
 */
public class MainDemo {
    public static void main(String[] args) {
        /**
         * Da bi ostvario konekciju s bazom potrebno je da znam:
         * 1. GDJE JE BAZA : URL ili adresa
         * 2. username: root
         * 3. password: root
         */
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM persons");
             ResultSet resultSet = preparedStatement.executeQuery();) {

            while (resultSet.next()) {
                Person person = new Person();

                Integer id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String nin = resultSet.getString("nin");
                Date birthdate = resultSet.getDate("birthday");
                LocalDate birthday = birthdate.toLocalDate();

                person.setId(id);
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setNin(nin);
                person.setBirthday(birthday);

                personList.add(person);
            }
            personList.forEach(System.out::println);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        //
        PersonTable personTable = new PersonTable(personList);
        JTable tableView = personTable.toTableView();
        JFrame frame = new JFrame("Persons");
        frame.add(tableView);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
