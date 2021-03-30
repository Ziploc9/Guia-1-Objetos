package Classes;

public class Rectangulo {
    private double ancho;
    private double alto;

    /**---Getters y Setters---**/
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto(){
        return alto;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    /**---Constructor---**/
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    /**---Methods---**/
    public double calcularPer(){
        double per = 2*(this.ancho + this.alto);
        return per;
    }

    public double calcularArea(){
        double area = this.ancho * this.alto;
        return area;
    }

    public int verification(){
        if(this.ancho != 1.0 && this.alto != 1.0){
            return 0;
        }else{
            return 1;
        }
    }
}
