package com.itakademija.six.question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelfMadeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.printf("Naš personalni self made listener event consumer %s %n", e.getActionCommand());
        JOptionPane.showMessageDialog(null, e.getActionCommand());
    }
}
