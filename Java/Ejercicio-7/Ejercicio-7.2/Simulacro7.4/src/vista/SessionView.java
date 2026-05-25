/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.SessionController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Booking;
import model.PadelCourt;

/**
 *
 * @author oscar
 */
public class SessionView {

    private SessionController myController;

    public SessionView(SessionController myController) {
        this.myController = myController;
    }

    public void showSessionMenu(ArrayList<Booking> reservas) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Bienvenido : ");
            System.out.println("Perfil : " + myController.getSessionPlayer().getName());
            System.out.println("Score : " + myController.getSessionPlayer().getScore());
            for (int i = 0; i < reservas.size(); i++) {
                System.out.println(reservas.get(i).getDescription());
            }
            System.out.println("Menu de selecion : ");
            System.out.println("(1) -Crear unha reserva");
            System.out.println("(2) -Apuntarse a un partido");
            System.out.println("(3) -Pechar Sesion");
            Scanner scan = new Scanner(System.in);
            int optionSelected = scan.nextInt();
            scan.nextLine();
            if (optionSelected == 1) {
                Date fecha = null;
                boolean fechaValida = false;
                while (!fechaValida) {
                    System.out.println("Introduce la fecha : ");
                    try {
                        fecha = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
                        myController.createBoooking(fecha);
                        fechaValida = true;
                    } catch (ParseException ex) {
                        System.out.println("Fecha incorrecta. Usa formato dd/MM/yyyy");
                    }
                }
            } else if (optionSelected == 2) {
                myController.joinMatch();
            } else if (optionSelected == 3) {
                System.out.println("Ata a vista !");
                exit = true;
            } else {
                System.out.println("Opcion non permitida");
            }
        }
    }

    public void selectCourtAndHour(Date data, ArrayList<PadelCourt> pistas, ArrayList<Booking> reservas) {
        Scanner scan = new Scanner(System.in);
        System.out.println("- Pistas Disponibles");
        for (int i = 0; i < pistas.size(); i++) {
            PadelCourt pista = pistas.get(i);

            System.out.println("");
            System.out.println("- Pista " + pista.getNumber() + " :");

            if (pista.getType() == PadelCourt.SINGLE) {
                System.out.println("Tipo : Inidividual");
            } else {
                System.out.println("Tipo : Doble");
            }

            System.out.println("Horas disponibles : ");
            for (int j = 0; j < pista.getBookingHours().length; j++) {
                String hora = pista.getBookingHours()[j];
                boolean ocupada = false;

                for (int k = 0; k < reservas.size(); k++) {

                    Booking booking = reservas.get(k);

                    // misma pista + misma hora
                    if (booking.getCourt().getNumber() == pista.getNumber() && booking.getHour().equals(hora)) {
                        ocupada = true;
                    }
                }

                // si NO está ocupada -> mostrar
                if (!ocupada) {
                    System.out.println(hora);
                }
            }
            System.out.println("-------------------");
            System.out.println("Selecciona numero de pista:");

            int numeroPista = scan.nextInt();
            scan.nextLine();

            System.out.println("Selecciona hora:");

            String horaSeleccionada = scan.nextLine();

            // BUSCAR LA PISTA ELEGIDA
            PadelCourt pistaSeleccionada = null;

            for (int j= 0; j < pistas.size(); j++) {

                if (pistas.get(i).getNumber() == numeroPista) {

                    pistaSeleccionada = pistas.get(j);
                }
            }
            // LLAMAR AL CONTROLADOR
            myController.completeBooking(data, horaSeleccionada, pistaSeleccionada);
        }

    }
}
