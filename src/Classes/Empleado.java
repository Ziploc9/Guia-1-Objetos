package Classes;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    /**---Getters & Setters---**/

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**--Constructor--**/
    public Empleado(String dni, String nombre,String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    /**---Methods---**/

    public double salarioAnual(double totalMoney){
        return totalMoney = this.salario * 12;
    }

    public double aumentoSalario(double porcentaje){
        double total = this.salario +((this.salario * porcentaje) /100);
        return total;
    }

    public void mostrarEmpleado(){
        System.out.println("Empleado[DNI: "+this.getDni()+" Nombre: "+this.getNombre()+" Apellido: "+this.getApellido()+" Salario: "+this.getSalario()+"]");
    }
}
