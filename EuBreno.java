package euBrenoBot;

import robocode.*;

public class EuBreno extends Robot {
    public void run() {
        while (true) {
            ahead(100); // Move-se para frente
            turnGunRight(360); // Gira a arma em torno de 360 graus
            back(100); // Move-se para trás
            turnGunRight(360); // Gira a arma em torno de 360 graus
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        // Quando um inimigo é detectado, mira e atira
        turnGunRight(getHeading() - getGunHeading() + e.getBearing());
        fire(5); // Atira com potência 1
    }
}
