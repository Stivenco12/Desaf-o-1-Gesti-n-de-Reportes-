# Gestor de Reportes

## Descripción

Este proyecto es una aplicación en Java para la gestión y generación de reportes en diferentes formatos. Utiliza Maven para la gestión de dependencias y sigue el patrón de diseño Factory para la creación de distintos tipos de reportes.

## Estructura del Proyecto

### Archivos Principales

- **`pom.xml`**: Archivo de configuración de Maven, que gestiona las dependencias del proyecto.
- **`Main.java`**: Punto de entrada de la aplicación.

### Módulos y Clases

#### `gestion_de_reportes`

- **`Format.java`**: Clase base o interfaz para definir los formatos de reporte.
- **`TypeOfFormat.java`**: Enum o clase que define los tipos de formatos admitidos.

#### `Factory` (Patrón Factory)

- **`CvsFactory.java`**: Clase responsable de la generación de reportes en formato CSV.
- **`ExcelFactory.java`**: Clase encargada de generar reportes en formato Excel.
- **`PdfFactory.java`**: Clase para la generación de reportes en formato PDF.
- **`FormatFactory.java`**: Fábrica general que gestiona la creación de los distintos tipos de reportes.

#### `menu`

- **`InformationMenu.java`**: Clase que gestiona la interfaz del usuario y las opciones del menú.
- **`case1Menu.java`**: Implementación de un caso específico dentro del menú.

## Requisitos

- Java 8 o superior.
- Maven instalado y configurado.

## Autor

Stivenco12
