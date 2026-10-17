public class ArchivoRodante extends Mueble{
    private int cantidadGavetas;
    private String sistemaSeguridad;

    public ArchivoRodante(String material, String color, double pesoKg, int cantidadGavetas, String sistemaSeguridad){
        super(material, color, pesoKg);
        this.cantidadGavetas = cantidadGavetas;
        this.sistemaSeguridad = sistemaSeguridad;
    }

    @Override
    public double calcularEnvio() {
        double envioBase = super.calcularEnvio();
        double recargoIndustrial = 35.0;
        return envioBase + recargoIndustrial;
    }

    @Override
    public String obtenerDetalles() {
        return "[Archivo Rodante] " + super.obtenerDetalles() +
                " | Gavetas: " + this.cantidadGavetas +
                " | Seguridad: " + this.sistemaSeguridad;
    }
}

