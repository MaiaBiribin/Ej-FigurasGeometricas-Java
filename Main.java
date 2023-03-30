package EjrFigurasGeometricas;

public class Main {

        public static void main(String[] args){

                Circulo circulo = new Circulo();
                Cuadrado cuadrado = new Cuadrado();
                Triangulo triangulo = new Triangulo();

                //Triangulo

                triangulo.setNombre("Triangulo");
                triangulo.setColor("Rosa");
                triangulo.setLados(8, 6, 9);

                System.out.println("El area del triangulo es: " + triangulo.calcularArea());
                System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro() + '\n');

                //Cuadrado
                cuadrado.setNombre("Cuadrado");
                cuadrado.setColor("Rojo");
                cuadrado.setLado(6);

                System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
                System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro() + '\n') ;

                // circulo

                circulo.setNombre("Circulo");
                circulo.setColor("Verde");
                circulo.setRadio(15);

                System.out.println("El area del circulo es: " + circulo.calcularArea());
                System.out.println("El perimetro del cirulo es: " + circulo.calcularPerimetro());

                // FigurasGeometricas bla = new FigurasGeometricas(); No se puede instanciar una clase abstracta







        }
}
