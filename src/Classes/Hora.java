package Classes;

public class Hora {
    private int hora;
    private int min;
    private int sec;

    /**
     * --Get & Sett--
     **/
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    /**
     * --Constructor--
     **/

    public Hora(int hora, int min, int sec) {
        this.hora = hora;
        this.min = min;
        this.sec = sec;
    }


    /**
     * ---Methods---
     **/

    public void mostrarHora() {

        if (validarHora() == 0) {

            if (this.hora >= 0 && this.hora <= 9)
                System.out.print("0" + this.hora);

            else if (this.hora >= 10 && this.hora <= 23)
                System.out.print(this.hora);

            if (this.min >= 0 && this.min <= 9)
                System.out.print(":0" + this.min);

            else if (this.min >= 10 && this.min <= 59)
                System.out.print(":" + this.min);

            if (this.sec >= 0 && this.sec <= 9)
                System.out.print(":0" + this.sec);

            else if (this.sec >= 10 && this.sec <= 59)
                System.out.print(":" + this.sec);


         }
        }


        public int validarHora(){

            if ((getHora() <= 23 && getHora() >= 0) && (getMin() <= 59 && getMin() >= 0) && (getSec() <= 59 && getSec() >= 0)) {
                return 0;

            } else {
                System.out.println("Ingrese un formato correcto de tiempo |Hora: 00 a 23| Minutos: 00-59| Segundos: 00-59|");
                return 1;
            }
        }

    }
