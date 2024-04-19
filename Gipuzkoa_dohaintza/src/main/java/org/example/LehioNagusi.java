package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LehioNagusi extends JFrame {
    public static void main(String[] args){
        new LehioNagusi().sortuLehioNagusi();
    }
    private void sortuLehioNagusi(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(650, 300));
        setTitle("Gipuzkoako Odol Dohaintza");

        // Goiko nabegadorea
        JPanel gNav = new JPanel(new GridLayout(1,4));
        gNav.setBackground(Color.lightGray);
            //logoa
        ImageIcon irudi = new ImageIcon(".\\irudiak\\logo.png");
        Image image = irudi.getImage();
        Image newImg = image.getScaledInstance(40,40, Image.SCALE_DEFAULT);
        irudi = new ImageIcon(newImg);
        JLabel logo = new JLabel(irudi);
        logo.setPreferredSize(new Dimension(50,50));
        gNav.add(logo);
            //zita hartu
        JLabel zitaHar = new JLabel("Zita hartu");
        gNav.add(zitaHar);
            // zitak ikusi
        JLabel zitaIkus = new JLabel("Zitak ikusi");
        gNav.add(zitaIkus);
            //langileen sekzioa
        JLabel intranet = new JLabel("Intranet");
        gNav.add(intranet);
        add(gNav, BorderLayout.NORTH);

        // Zentroko edukia
        JPanel edukia = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel edukiText = new JLabel("Gizakion odola ondasun preziatua da, eta bakoitzak badaki. " +
                "Hortaz keinu txiki honekin pertsona hugariri laguntzeko ahalmena duzu. " +
                "Nahiz eta aurrerapen medikoak eta teknologikoak momentu oro bermatu, oraingoz, odola " +
                "ezin da fabrikatu eta pertsonen donazio altruistetatik bakarrik lor daiteke. " +
                "\n" +
                "Odol-emate bakoitzetik hiru osagai ezberdin lortzen dira, hainbat gaixori laguntzeko aplikazio propioekin. " +
                "");
        edukiText.setBorder(new EmptyBorder(30,50,0,50));
        edukia.add(edukiText);

        add(edukia, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }
}
