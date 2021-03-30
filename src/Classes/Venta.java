package Classes;

public class Venta {
    private String id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    /**----Getters & Setters----**/

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**--Constructor--**/
    public Venta(String id, String descripcion, int cantidad, double precioUnitario){
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    /**----Methods---**/


    public double compraTotal(){
        double precioTotal = this.cantidad * this.precioUnitario;
        return precioTotal;
    }

    public void verItem(){
        System.out.println("ItemVenta[ID: "+this.getId()+" Descripcion: "+this.getDescripcion()+"  Cantidad: "+this.getCantidad()+" PrecioUnidad: "+getPrecioUnitario()+" Total: "+this.compraTotal()+"]");
    }


}
