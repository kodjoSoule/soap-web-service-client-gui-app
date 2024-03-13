package com.javaws.client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AuthMessageUI extends JFrame implements ActionListener {
    private JPanel content = new JPanel();
    private JPanel groupButton = new JPanel();
    private JButton okBtn = new JButton("OK");

    public AuthMessageUI() {
        // Réorganisé le code pour plus de lisibilité
        this.setTitle("Connexion");
        this.setSize(400, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        content.setLayout(new BorderLayout());

        // Ajout d'une étiquette pour afficher le message
        JLabel messageLabel = new JLabel();
        content.add(messageLabel, BorderLayout.CENTER);

        groupButton.add(okBtn);
        content.add(groupButton, BorderLayout.SOUTH);

        // Ajout de l'écouteur d'événements au bouton
        okBtn.addActionListener(this);

        this.setContentPane(content);
        
    }

    public void display(String message) {
        // Mise à jour du texte de l'étiquette avec le message spécifié
        ((JLabel) content.getComponent(0)).setText(message);
        this.setVisible(true);
    }

    public JButton getOkBtn() {
        return okBtn;
    }

    public void quitter() {
        // Correction de la méthode quiter() en quitter()
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okBtn) {
            System.out.println("OK");
            this.quitter();
        }
    }

   
}
