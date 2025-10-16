#Trabajo Práctico – Programación Orientada a Objetos (POO)

Este trabajo práctico aborda la implementación de una clase `Empleado` en Java, aplicando los principales conceptos de la Programación Orientada a Objetos. El objetivo es modelar un sistema básico de gestión de empleados, incorporando atributos, constructores, métodos sobrecargados, encapsulamiento y miembros estáticos.

---

##  Caso práctico: Clase `Empleado`

La clase `Empleado` incluye:

- Atributos privados: `id`, `nombre`, `puesto`, `salario`.
- Atributo estático: `totalEmpleados`, como contador global.
- Constructores sobrecargados:
  - Uno completo con todos los parámetros.
  - Uno parcial que asigna salario por defecto y genera `id` automáticamente.
- Métodos sobrecargados `actualizarSalario()`:
  - Por porcentaje (`double`)
  - Por monto fijo (`int`)
- Método `toString()` sobrescrito para mostrar la información del empleado.
- Método estático `mostrarTotalEmpleados()` para consultar el contador.
- Encapsulamiento completo con `getters` y `setters`.

---

## 📁 Estructura del módulo

- `Empleado.java`  
  Clase principal con atributos, constructores, métodos y lógica de negocio.

- `Main.java`  
  Clase de prueba que instancia objetos, aplica métodos y muestra resultados por consola.

- `README.txt`  
  Resumen técnico del trabajo práctico.

- `Trabajo Práctico - Introducción a la POO.pdf`  
  Documento teórico con consignas, objetivos y marco conceptual.

---

## 🎯 Objetivos del trabajo

- Aplicar los pilares de la POO: encapsulamiento, reutilización, modularidad.
- Comprender el uso de `this`, constructores sobrecargados y métodos estáticos.
- Practicar sobrecarga de métodos y visualización con `toString()`.
- Simular un sistema básico de gestión de empleados.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje**: Java  
- **Entorno**: NetBeans / Visual Studio Code  
- **Entrada/Salida**: Consola estándar (`System.out.println`, `Scanner`)

---

## 📝 Notas

- El código está comentado para facilitar la comprensión.
- Se recomienda ejecutar `Main.java` para validar el comportamiento de la clase.
- El diseño permite futuras extensiones como validaciones, simulaciones o integración con UML.




