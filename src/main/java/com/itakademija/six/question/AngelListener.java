package com.itakademija.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ako se po šablonu ove klase kreira objekat:
 *
 */
public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Anđeo kaže: Uradi dobro djelo....");
    }
}
