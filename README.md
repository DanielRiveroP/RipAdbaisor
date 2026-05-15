# RipAdbaisor - Gestión Gastronómica 🍽️

## Objetivos del Proyecto
El objetivo principal de esta aplicación es gestionar un catálogo de restaurantes utilizando Java. El proyecto busca aplicar los siguientes conceptos técnicos:
* **Gestión de Colecciones:** Uso de `ArrayList` para manipular registros en memoria.
* **Robustez:** Implementación de validaciones y control de excepciones para asegurar que el programa no se detenga ante entradas incorrectas.
* **Código Limpio:** Separación de responsabilidades en paquetes y uso de métodos estáticos reutilizables.
* **Control de Versiones:** Uso profesional de Git mediante el flujo de trabajo por ramas.

## Manual de Usuario
Al ejecutar la aplicación, se presentará un menú interactivo con las siguientes funciones:

1. **Añadir restaurante:** Introduce el nombre, dirección, tipo de cocina y una puntuación (del 1.0 al 5.0). El sistema no permitirá dejar campos vacíos ni introducir notas fuera de rango.
2. **Editar restaurante:** El sistema mostrará la lista actual. Indica el número del restaurante que deseas modificar y escribe los nuevos datos.
3. **Mostrar ranking:** Muestra todos los restaurantes almacenados, ordenados automáticamente de mayor a menor puntuación.
4. **Eliminar restaurante:** Permite borrar un registro de la lista seleccionando su índice numérico.
5. **Salir:** Finaliza la ejecución del programa de forma segura.

> **Nota:** Para introducir decimales en la puntuación, utiliza el punto (.) como separador.