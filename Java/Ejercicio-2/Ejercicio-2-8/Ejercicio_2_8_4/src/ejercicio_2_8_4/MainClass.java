package ejercicio_2_8_4;

import java.util.Scanner;

/**
 *  * Clase principal para ejecutar el programa.  * Permite:  *  - Pedir al
 * usuario los datos de un día trabajado  *  - Calcular el salario de ese día  *
 *  - Calcular el salario semanal considerando 5 días  *    y aplicando el 20%
 * solo al domingo
 
 */
public class MainClass {

    /**
     *  * Método principal que se ejecuta al iniciar el programa.  * @param args
     * Argumentos de la línea de comandos
 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char quenda; // turno del día
        boolean day; // true si el día es domingo
        int hours; // número de horas trabajadas

        System.out.println("Vamos a calcular lo que cobras:\n");

// Pedimos turno
        System.out.print("Dime si eres de horario de dia o de noche (d/n): ");
        quenda = scan.nextLine().charAt(0);

// Preguntamos si el día fue domingo
        System.out.print("El día trabajado fue domingo? (true/false): ");
        day = scan.nextBoolean();

// Pedimos número de horas trabajadas
        System.out.print("Número de horas trabajadas: ");
        hours = scan.nextInt();

        System.out.println("Ahora calculamos el salario semanal");

// Salario semanal
        boolean includeSunday = day; // si se debe incluir el domingo
        double totalPay = 0.0;

// Bucle de 5 días
        for (int i = 1; i <= 5; i++) {
// Solo el último día será domingo si includeSunday = true
            boolean isSunday = includeSunday && i == 5;

            WorkingDay dayWorked = new WorkingDay(quenda, isSunday, hours);
            double dailyPay = dayWorked.earn(quenda, isSunday, hours);
            totalPay += dailyPay;

            System.out.println("Día " + i + " salario: " + dailyPay + " euros");
        }

        System.out.println("Salario semanal total: " + totalPay + " euros");

    }
}
