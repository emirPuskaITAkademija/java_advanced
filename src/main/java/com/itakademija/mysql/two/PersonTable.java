package com.itakademija.mysql.two;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * Hoću da kreiram klasu koja će dobiti podatke: List<Person>
 *     PersonTable(List<Person>)
 *
 *     PersonTable treba da ima funkciju koja vizuelno prikazuje podatke u List<Person>
 */
public class PersonTable {
    private final List<Person> personList;

    public PersonTable(List<Person> personList){
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    // JTable <-- kako će se modelirati prikazivanje podataka DefaultTableModel <----> List<Person>
    public JTable toTableView(){
        String[] columNames = {"ID", "First Name", "Last Name", "JMBG", "Birthday"};
        DefaultTableModel model = new DefaultTableModel(columNames, 0);
        for(Person person : personList){
            Object[] row = {person.getId(), person.getFirstName(), person.getLastName(), person.getNin(), person.getBirthday()};
            model.addRow(row);
        }
        JTable table = new JTable(model);
        return table;
    }
}
