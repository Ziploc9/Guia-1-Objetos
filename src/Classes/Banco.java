package Classes;

public class Banco {
    private String banco;
    private String id;
    private String nombre;
    private double balance;

    /**--Gett And Sett--**/
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**--Constructor--**/

    public Banco(String banco, String id, String nombre, double balance){
        this.banco = banco;
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }


    /**---Methods---**/

    public double credito(double ingreso){
        return this.balance = this.balance + ingreso;
    }
    public double debito(double extraccion){
        double cuenta = this.balance - extraccion;
        return cuenta;
    }

    public void mostrarCuenta(){
        System.out.println("Cuenta en el banco ["+this.banco+" | id: "+this.id+ " | Nombre: "+this.nombre+" | Balance: "+this.balance+"]");
    }

}
