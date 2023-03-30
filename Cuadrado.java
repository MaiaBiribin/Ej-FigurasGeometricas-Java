package EjrFigurasGeometricas;

public class Cuadrado extends FigurasGeometricas{

    private float lado;

    public float getLado() {
        return this.lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public double calcularPerimetro (){
        return this.lado * 4;
    }

    public double calcularArea () {
        return this.lado * this.lado;
    }
}
