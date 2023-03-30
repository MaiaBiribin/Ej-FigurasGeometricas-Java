package EjrFigurasGeometricas;

public class Circulo extends FigurasGeometricas{

    private float radio ;

    public float getRadio(){
        return this.radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double calcularPerimetro(){

        return 2 * (Math.PI * this.radio);
    }

    public double calcularArea(){

        // pi por el radio al cuadrado
        return Math.PI * Math.pow(this.radio, 2);

    }
}
