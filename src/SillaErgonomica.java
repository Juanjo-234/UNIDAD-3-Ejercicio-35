public class SillaErgonomica extends  Mueble{
    private boolean ajusteAltura;
    private String soporteLumbar;

    public SillaErgonomica(String material, String color, double pesoKg, boolean ajusteAltura, String soporteLumbar){
        super(material, color, pesoKg);
        this.ajusteAltura = ajusteAltura;
        this.soporteLumbar = soporteLumbar;
    }

    @Override
    public double calcularEnvio() {
        double envioBase = super.calcularEnvio();
        double recargoManipulacion = 15.0;
        return envioBase + recargoManipulacion;
    }

    @Override
    public String obtenerDetalles() {
        String ajuste = this.ajusteAltura ? "Sí" : "No";
        return "[Silla Ergonómica] " + super.obtenerDetalles() +
                " | Ajuste de Altura: " + ajuste +
                " | Soporte Lumbar: " + this.soporteLumbar;
    }
}

