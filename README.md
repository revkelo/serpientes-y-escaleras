# Serpientes y Escaleras

Juego de escritorio **Serpientes y Escaleras** desarrollado en Java con interfaz gráfica Swing. Primer proyecto personal completo — Universidad El Bosque.

## Características

- **3 tamaños de tablero:** 6×6, 9×9 y 12×12
- **Hasta 4 jugadores** con fichas personalizadas (Alien, Nave, Saturno, Estrella, Pancracio)
- **5 fondos animados** (GIF) seleccionables
- **Tutorial integrado** con guía paso a paso en pantalla
- **Persistencia de partidas** — las partidas se guardan en `Partidas.txt`
- **Pantalla de ganador** con animación
- **Mascota Pancracio** con panel especial

## Stack

- Java 17
- Java Swing (GUI)
- Patrón MVC
- Eclipse IDE

## Estructura

```
ProyectoEYS1/src/co/edu/unbosque/
├── controller/
│   ├── AplMain.java               # Punto de entrada
│   └── Controller.java            # Lógica central del juego
├── model/
│   └── Jugadores.java             # Modelo de jugador
└── view/
    ├── Ventana_menus.java          # Menú principal
    ├── Panel_escoger_tablero.java
    ├── Panel_escoger_jugadores.java
    ├── Panel_escoger_ficha.java
    ├── Ventana_juego.java          # Vista principal del juego
    ├── Izq_juego_panel.java        # Panel lateral con info de jugadores
    ├── PanelGanador.java           # Pantalla de victoria
    ├── PanelPancracio.java         # Panel mascota
    ├── Ventana_tutorial.java       # Tutorial interactivo
    └── Consola.java
```

## Instalación

```bash
git clone https://github.com/revkelo/serpientes-y-escaleras.git
```

Abrir en Eclipse o IntelliJ como proyecto Java existente y ejecutar `AplMain.java`.

---

> Este repositorio se llamó originalmente **`serpientes-y-escaleras`** — y así se queda.
> Fue el primer proyecto terminado de verdad, cuando aprender a mover una ficha en pantalla era un logro.
