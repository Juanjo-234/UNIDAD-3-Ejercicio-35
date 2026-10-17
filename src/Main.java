//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Mueble> inventarioMuebles = new ArrayList<>();

    inventarioMuebles.add(new SillaErgonomica("Malla antitranspirante y Aluminio", "Negro", 14.5, true, "Ajustable dinámico"));
    inventarioMuebles.add(new EscritorioModular("Madera Melamina y Acero", "Roble Claro / Blanco", 42.0, "160x80 cm", 3));
    inventarioMuebles.add(new ArchivoRodante("Acero Reforzado", "Gris Industrial", 68.0, 4, "Cerradura centralizada digital"));

    System.out.println("==========================================================");
    System.out.println("           CATÁLOGO Y COSTOS DE ENVÍO DE MUEBLES          ");
    System.out.println("==========================================================\n");

    for (Mueble mueble : inventarioMuebles) {
        System.out.println(mueble.obtenerDetalles());
        System.out.printf("-> Costo total de envío: $%.2f%n", mueble.calcularEnvio());
        System.out.println("----------------------------------------------------------");
    }
}
