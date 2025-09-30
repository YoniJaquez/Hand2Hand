# Hand2Hand

Hand2Hand es una aplicación para Android diseñada para facilitar la compra y venta de bienes y servicios. Construida utilizando prácticas modernas de desarrollo para Android, aprovecha Jetpack Compose para la interfaz de usuario e integra Firebase para los servicios de backend.

## Características

- **Interfaz moderna**: Construida con Jetpack Compose para una interfaz de usuario dinámica y receptiva.
- **Integración con Firebase**: Utiliza Firebase Firestore para operaciones en tiempo real con bases de datos.
- **Diseño Material**: Implementa Material Design 3 para una experiencia de usuario limpia e intuitiva.
- **Compatibilidad**: Compatible con dispositivos Android con un SDK mínimo de 24.

## Estructura del Proyecto

- `app/`: Contiene el código principal de la aplicación, incluidos los archivos fuente, recursos y configuraciones de compilación.
  - `src/main`: Código fuente y recursos de la aplicación.
  - `src/androidTest`: Pruebas instrumentadas.
  - `src/test`: Pruebas unitarias.
- `gradle/`: Archivos del wrapper de Gradle y gestión de dependencias.
- `build.gradle.kts`: Configuración de Gradle a nivel de proyecto.
- `settings.gradle.kts`: Archivo de configuración de Gradle.

## Comenzando

### Requisitos Previos

- Android Studio Flamingo o posterior.
- Java Development Kit (JDK) 8 o superior.
- Gradle 7.0 o superior.

### Instrucciones de Configuración

1. Clona el repositorio:
   ```bash
   git clone https://github.com/YoniJaquez/Hand2Hand.git
   ```
2. Abre el proyecto en Android Studio.
3. Sincroniza los archivos de Gradle.
4. Agrega tu archivo de configuración de Firebase (`google-services.json`) al directorio `app/`.
5. Compila y ejecuta el proyecto en un emulador o dispositivo físico.

## Dependencias

El proyecto utiliza las siguientes dependencias clave:

- **Jetpack Compose**: Para construir la interfaz de usuario.
- **Firebase Firestore**: Para operaciones en tiempo real con bases de datos.
- **JUnit**: Para pruebas unitarias.
- **Espresso**: Para pruebas de interfaz de usuario.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

---

Para cualquier pregunta o contribución, no dudes en abrir un issue o enviar un pull request.