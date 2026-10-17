public class Mueble {
    String material;
    String color;
    double pesoKg;

    public Mueble(String material, String color, double pesoKg) {
        this.material = material;
        this.color = color;
        this.pesoKg = pesoKg;
    }

    public double calcularEnvio() {
        double tarifaPorKg = 10.0;
        return this.pesoKg * tarifaPorKg;
    }

    public String obtenerDetalles() {
        return "Material: " + this.material + " | Color: " + this.color + " | Peso: " + this.pesoKg + " kg";
    }
}

