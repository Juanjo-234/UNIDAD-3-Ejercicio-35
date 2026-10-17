public class EscritorioModular extends Mueble{
    private String dimensionesSuperficie;
    private int cajoneras;

    public EscritorioModular(String material, String color, double pesoKg, String dimensionesSuperficie, int cajoneras){
        super(material, color, pesoKg);
        this.dimensionesSuperficie = dimensionesSuperficie;
        this.cajoneras = cajoneras;
    }

    @Override
    public double calcularEnvio() {
       double envioBase = super.calcularEnvio();
       double recargoCajoneras = this.cajoneras * 0.8;
       return envioBase + recargoCajoneras;
    }

    @Override
    public String obtenerDetalles() {
        return "[Escritorio Modular] " + super.obtenerDetalles() +
                " | Superficie: " + this.dimensionesSuperficie +
                " | Cajoneras: " + this.cajoneras;
    }
}

