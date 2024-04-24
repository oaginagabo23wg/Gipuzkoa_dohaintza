package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LehioNagusi extends JFrame {

    public void sortuLehioNagusi(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000, 600));
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
        JLabel edukiText = new JLabel();

        String textua = "<html><p>Gizakion odola ondasun preziatua da, eta bakoitzak badaki. Hortaz keinu txiki honekin pertsona hugariri<p/> " +
                "<p>laguntzeko ahalmena duzu. Nahiz eta aurrerapen medikoak eta teknologikoak momentu oro bermatu, <p/>" +
                "<p>oraingoz, odola ezin da fabrikatu eta pertsonen donazio altruistetatik bakarrik lor daiteke. Odol-emate <p/>" +
                "<p>bakoitzetik hiru osagai ezberdin lortzen dira, hainbat gaixori laguntzeko aplikazio propioekin. <p/>" +
                "<p> <p/>" +
                "<p>Odolak eta haren osagaiek bizitza mugatua dute:<p/> " +
                "<p>- Hematien kontzentratuak 42 egunez kontserbatzen dira.<p/>" +
                "<p>- Plasma izoztuta mantentzen da 3 urtera arte, baina medikamentuak fabrikatzeko etengabe erabiltzen da.<p/>" +
                "<p>- Plaketak 5 eta 7 egun bitartean kontserbatzen dira";
        edukiText.setText(textua);
        edukiText.setBorder(new EmptyBorder(30,0,0,50));
        edukia.setPreferredSize(new Dimension(200,500));
        edukia.add(edukiText);

        add(edukia, BorderLayout.CENTER);

        pack();
        setVisible(true);


    }
    //login
    private  void login() {
        JTextField username = new JTextField();
        JTextField password = new JTextField();

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Username:"));
        myPanel.add(username);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Passwprd:"));
        myPanel.add(password);
        pack();
        setVisible(true);
    }
}
