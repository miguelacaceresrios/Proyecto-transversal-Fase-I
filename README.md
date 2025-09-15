
# 📦 Sistema de Gestión de Inventario con Patrones Creacionales

Este proyecto es una aplicación en **Java** que implementa una solución de gestión de inventarios para una pequeña empresa, aplicando **patrones de diseño creacionales** como parte de la asignatura **Patrones de Diseño de Software**.

---

## 👨‍🏫 Datos del Proyecto
- **Estudiante:** Miguel Ángel Cáceres Ríos  
- **Profesor:** Luis Eduardo Baquero Rey  
- **Asignatura:** Patrones de Diseño de Software  
- **Entrega:** Proyecto transversal / Fase I  

---

## 🎯 Objetivo
Desarrollar una aplicación que permita:
- Crear categorías de productos con atributos específicos.
- Crear productos dentro de las categorías.
- Gestionar inventario (entrada/salida de stock).
- Clonar productos existentes para agilizar la creación.
- Consultar el estado actual del inventario.

---

## 🛠️ Patrones de Diseño Implementados

### 🔹 Abstract Factory (5 clases)
Permite la creación de **categorías de productos** (Electrónica, Ropa, Alimentos) con atributos personalizados.

### 🔹 Builder (4 clases)
Facilita la construcción de **productos complejos** paso a paso mediante un **Director** y un **Builder concreto**.

### 🔹 Factory Method (3 clases)
Define un método de creación de **productos genéricos**, delegando la instanciación a subclases.

### 🔹 Prototype (3 clases)
Permite la **clonación de productos** existentes, reutilizando la configuración base.

### 🔹 Singleton (1 clase)
Gestiona el **inventario centralizado** asegurando una única instancia en todo el sistema.

---

## 📂 Estructura del Proyecto
<a href="https://imgbb.com/"><img src="https://i.ibb.co/8g2X7FBF/Captura-de-pantalla-2025-09-14-212804.png" alt="Captura-de-pantalla-2025-09-14-212804" border="0"></a>
---

## ⚙️ Requisitos
- **Java JDK 17+**
- **VS Code / Eclipse / IntelliJ IDEA**

---

## ▶️ Ejecución

1. **Compilar:**
   ```bash
   javac -d bin src/**/*.java

   
2. **Ejecutar:**
   ```bash
   java -cp bin app.Main



   
