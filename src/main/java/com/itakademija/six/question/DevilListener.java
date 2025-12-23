package com.itakademija.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//konzumira ActionEvent
public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        String actionCommand = event.getActionCommand();
        System.out.println("KOMANDA u DevilListener: " + actionCommand );
        System.out.println("Učini nešto loše...budi zloćko...");
    }
}
