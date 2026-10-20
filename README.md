Este programa está diseñado para modelar un sistema de gestión de un catálogo de muebles aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para calcular costos de envío y manipulación especial según las características físicas de cada pieza.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Mueble: Concentra los atributos comunes a cualquier artículo de mobiliario (material, color y pesoKg), junto con un constructor centralizado y un método base para calcular el costo de envío estándar basado en el peso.

Desarrolla las clases hijas (SillaErgonomica, EscritorioModular y ArchivoRodante): Extienden de Mueble incorporando sus atributos particulares y especializados (ajuste de altura y soporte lumbar para la silla; dimensiones de superficie y cajoneras para el escritorio; cantidad de gavetas y sistema de cierre de seguridad para el archivo).

Sobrescribe el cálculo de envío/manipulación: Cada subclase implementa su propia regla de negocio para tarificar el envío considerando recargos por volumen, fragilidad o necesidad de armado e instalación técnica.

Ejecuta la prueba en el main: Crea una lista polimórfica de muebles especializados, invoca sus métodos de consulta y cálculo de costos, y despliega los resultados detallados por consola.
