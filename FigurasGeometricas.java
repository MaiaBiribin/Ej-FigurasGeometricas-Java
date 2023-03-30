package EjrFigurasGeometricas;

public abstract class FigurasGeometricas {

    private String nombre;
    private String color;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularPerimetro();

    public abstract double calcularArea();


}
