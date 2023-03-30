package EjrFigurasGeometricas;

public class Triangulo extends FigurasGeometricas{

    private float lado1;
    private float lado2;
    private float lado3;

    public float getLado1 (){
        return this.lado1;
    }

    public float getLado2 (){
        return this.lado2;
    }

    public float getLado3 (){
        return this.lado3;
    }

    public void setLados(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public double calcularPerimetro(){

        return this.lado1 + this.lado2 + this.lado3;
    }

    public double calcularArea () {

        double semiperimetro = calcularPerimetro()/ 2;

        return Math.sqrt(semiperimetro *(semiperimetro - this.lado1) * (semiperimetro - this.lado2) * (semiperimetro - this.lado3));
    }
}
