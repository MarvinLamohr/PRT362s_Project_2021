package za.ac.cput.PRT362s_Project_2021;

import javax.swing.*;

public class SplashScreen extends JFrame {

    private JLabel logoImage;
    private JPanel loadPanel;
    private JProgressBar progressBar;
    private JLabel loadingLable;
    private JLabel loadingLablePerc;
    private JPanel mainSplashPanel;
    private JPanel backgroundPanel;

public SplashScreen() {

    super("The Zengo Lounge");
    this.setContentPane(this.mainSplashPanel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();

    SplashScreen splash = new SplashScreen();
    splash.setVisible(true);

        try {

            for (int i = 0; i <= 100; i++) {

                Thread.sleep(100);

                splash.loadingLablePerc.setText(i + "%");

                if (i == 0) {
                    splash.loadingLable.setText("Starting Up");
                }
                if (i == 5) {
                    splash.loadingLable.setText("Starting Up.");
                }
                if (i == 10) {
                    splash.loadingLable.setText("Starting Up..");
                }
                if (i == 15) {
                    splash.loadingLable.setText("Starting Up...");
                }
                if (i == 20) {
                    splash.loadingLable.setText("Starting Up.");
                }
                if (i == 25) {
                    splash.loadingLable.setText("Starting Up..");
                }
                if (i == 30) {
                    splash.loadingLable.setText("Starting Up...");
                }
                if (i == 35) {
                    splash.loadingLable.setText("Loading");
                }
                if (i == 40) {
                    splash.loadingLable.setText("Loading.");
                }
                if (i == 45) {
                    splash.loadingLable.setText("Loading..");
                }
                if (i == 50) {
                    splash.loadingLable.setText("Loading...");
                }
                if (i == 55) {
                    splash.loadingLable.setText("Loading.");
                }
                if (i == 60) {
                    splash.loadingLable.setText("Loading..");
                }
                if (i == 65) {
                    splash.loadingLable.setText("Loading...");
                }
                if (i == 70) {
                    splash.loadingLable.setText("Launching Application");
                }
                if (i == 75) {
                    splash.loadingLable.setText("Launching Application.");
                }
                if (i == 80) {
                    splash.loadingLable.setText("Launching Application..");
                }
                if (i == 85) {
                    splash.loadingLable.setText("Launching Application...");
                }
                if (i == 90) {
                    splash.loadingLable.setText("Launching Application.");
                }
                if (i == 95) {
                    splash.loadingLable.setText("Launching Application..");
                }
                if (i == 100) {
                    splash.loadingLable.setText("Launching Application...");
                }

                splash.progressBar.setValue(i);

            }

            Login login = new Login();
            login.show();
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


}
