package application;

import morpion.Partie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JDialog {
    private JPanel contentPane;
    private JButton buttonCancel;
    private JButton pierreFeuilleCiseauxButton;
    private JButton morpionButton;

    public MenuPrincipal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(morpionButton);

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        morpionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lancerMorpion();
            }
        });
        pierreFeuilleCiseauxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lancerPFC();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void lancerMorpion() {
        dispose();
        new Partie();
    }

    private void lancerPFC() {
        new pierrefeuilleciseaux.Partie();
    }

    public static void main(String[] args) {
        MenuPrincipal dialog = new MenuPrincipal();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
