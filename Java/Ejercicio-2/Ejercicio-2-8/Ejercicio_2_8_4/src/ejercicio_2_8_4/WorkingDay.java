package ejercicio_2_8_4;

/**
 * Clase que representa un día de trabajo. Contiene información sobre turno
 * (diurno/nocturno), si es domingo y horas trabajadas. Permite calcular el
 * salario del día.
 */
public class WorkingDay {

    private char quenda;  // 'd' para diurno, 'n' para nocturno
    private boolean sunday; // true si es domingo
    private int hours;   // número de horas trabajadas

    /**
     * Constructor que recibe todos los atributos del día de trabajo.
     *
     * @param quenda Turno: 'd' diurno, 'n' nocturno
     * @param sunday true si es domingo
     * @param hours Número de horas trabajadas
     */
    public WorkingDay(char quenda, boolean sunday, int hours) {
        this.quenda = quenda;
        this.sunday = sunday;
        this.hours = hours;
    }

    /**
     * Calcula el salario del día.
     *
     * @param quenda Turno
     * @param sunday true si es domingo
     * @param hours Número de horas
     * @return Salario del día con incremento si es domingo
     */
    public double earn() {
        double earn;

        // Calculamos salario según el turno
        earn = switch (this.quenda) {
            case 'd' ->
                8 * this.hours;  // 8 € diurno
            case 'n' ->
                12 * this.hours; // 12 € nocturno
            default ->
                0;         // si no es ni 'd' ni 'n', 0
        };

        // Si es domingo, incrementamos un 20%
        if (this.sunday) {
            earn = Math.round(earn * 1.2 * 100) / 100.0;
        }

        return earn;
    }
}
