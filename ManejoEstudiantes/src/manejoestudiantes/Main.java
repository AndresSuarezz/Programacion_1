package manejoestudiantes;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {

    public static void main(String[] args) {
        vista view = new vista();
        view.setVisible(true);
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setTitle("Matricula Estudiantes");
        view.setExtendedState(MAXIMIZED_BOTH);
        
    }
}
