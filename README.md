# arnold-enum-type

Este proyecto es una aplicación sencilla que permite calcular el peso de una persona en diferentes planetas del sistema solar. Está diseñado como una herramienta educativa y de práctica para aprender y trabajar con enumeraciones (enums) en Java.

## Descripción del Proyecto

El programa utiliza un enum llamado `Planeta` que representa los planetas del sistema solar. Cada planeta tiene propiedades como su masa y radio, y se calculan valores como la gravedad superficial y el peso de un objeto en su superficie. La aplicación incluye:

- Una clase principal `ArnoldMain` que interactúa con el usuario para obtener su peso en la Tierra y calcular su peso en otros planetas.
- Métodos para filtrar planetas terrestres y gigantes gaseosos.
- Pruebas unitarias en la clase `PlanetaTest` para garantizar que los cálculos y funcionalidades sean correctos.

## Propósito

El propósito principal de este proyecto es practicar el uso de enums en Java. Los enums son útiles para representar un conjunto fijo de constantes, y este proyecto demuestra cómo se pueden enriquecer con métodos y propiedades para realizar cálculos complejos.

## Cómo Ejecutarlo

1. Asegúrate de tener Java 21 instalado en tu sistema.
2. Clona este repositorio en tu máquina local.
3. Usa Maven para compilar y ejecutar el proyecto:
   ```bash
   mvn clean install
   java -cp target/arnold-enum-type-1.0.0.jar edu.estatuas.ArnoldMain
   ```

## Características
- Cálculo del peso en todos los planetas del sistema solar.
- Separación de planetas en terrestres y gigantes gaseosos.
- Pruebas unitarias para validar los cálculos y la lógica del programa.

Este proyecto es ideal para principiantes que deseen aprender sobre enums y cómo integrarlos en aplicaciones Java. ¡Diviértete explorando el sistema solar con Arnold Schwarzenegger como inspiración! 

![](./resources/pluto_is_a_planet.png)