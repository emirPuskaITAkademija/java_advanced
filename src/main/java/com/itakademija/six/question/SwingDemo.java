package com.itakademija.six.question;

import com.itakademija.six.demo.Person;
import com.itakademija.six.demo.PersonReader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

/**
 * Ideja Observer Dizajn šablona:
 * <p>
 *     <li>1. Subject - objekat koji emituje neki događaj. GUI controls: JButton</li>
 *     <li>2. Observer - objekat koji sluša i reaguje na neki događaj Event. GUI action listener: ActionListener</li>
 *     <li> POENTA: Da bi Observer konzumirao taj događaj on se mora subscribe</li>
 * </p>
 *
 *      JButton(Observable/Subject) ---- generiše-----> ActionEvent event  ---- konzumiraju----> AngelListener angelListener,
 *                                                                                                DevilListener devilListener
 *
 *
 *
 */
public class SwingDemo {
    public static void main(String[] args) {
        // dobra ili loša ... SUBJECT/Observable
        //SUBJECT -> generiše ActionEvent -> event je kanal komunikacije između onoga KO generiše i onoga ko KONZUMIRA event
        JButton actionButton = new JButton("Action Dugme");
        actionButton.setActionCommand("DO SOMETHING komanda");

        //observer A
        AngelListener angelListener = new AngelListener();
        //observer B
        DevilListener devilListener = new DevilListener();

        //addObserver(Observer a)
        //addActionListener(ActionListener al)
        actionButton.addActionListener(angelListener);
        actionButton.addActionListener(devilListener);
        actionButton.addActionListener(new SelfMadeListener());

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
        JComboBox<Person> personSelect = new JComboBox<>();
        for (Person person : personList) {
            personSelect.addItem(person);
        }
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));
        panel.setLayout(new GridBagLayout());

        panel.add(personSelect);
        panel.add(actionButton);

        JFrame frame = new JFrame("Observer Example");
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
}
