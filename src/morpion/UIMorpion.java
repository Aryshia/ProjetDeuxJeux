package morpion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UIMorpion extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    // TODO: Faire une liste de boutons

    public UIMorpion() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(button1);

        button1.addActionListener(e -> case1());

        button2.addActionListener(e -> case2());

        button3.addActionListener(e -> case3());

        button4.addActionListener(e -> case4());

        button5.addActionListener(e -> case5());

        button6.addActionListener(e -> case6());

        button7.addActionListener(e -> case7());

        button8.addActionListener(e -> case8());

        button9.addActionListener(e -> case9());

        buttonCancel.addActionListener(e -> onCancel());

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

    private void case1() {
        button1.setBackground(Color.blue);
        button1.setText("X");
        button1.setForeground((Color.white));
    }

    private void case2() {

    }

    private void case3() {

    }

    private void case4() {

    }

    private void case5() {

    }

    private void case6() {

    }

    private void case7() {

    }

    private void case8() {

    }

    private void case9() {

    }

    public static void main(String[] args) {
        UIMorpion dialog = new UIMorpion();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
