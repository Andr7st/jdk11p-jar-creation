# Creando manualmente un Jar.

## Practica en Java 11+

<br/>

<div align="center">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="project-resources/img/duke_birrete.png">
    <img alt="image" src="project-resources/img/duke.png" width=300">
  </picture>
</div>

Index:

* [**1. Inmediate Execution**](#1-Inmediate-Execution)
* [**2. Generate bytecode**](#2-Generar-bytecode)
* [**3. Generate bytecode in other path**](#3-Generar-bytecode-en-otro-directorio)
* [**4. Execute bytecode**](#4-Ejecutar-bytecode)
* [**5. Jar creation v1**](#5-Creación-del-jar-v1)
* [**6. Execute jar v1**](#6-Ejecutar-jar-v1)
* [**7. Create config file**](#7-Creando-archivo-de-configuración)
* [**8. Jar creation v2**](#8-Creación-del-jar-v2)
* [**9. Execute jar v2**](#9-Ejecutar-jar-v2)


<br/>

## Código:

Este código java contiene dos clases dentro del archivo `Main.java`.


```Java
package org.andr7st.app;

public class Main {

    private static String message = "Hello, this is a Jdk11 practice!";

    public static void main( String... args ) {
        
        System.out.println( ConsoleColors.NORMAL_PURPLE + 
            ConsoleColors.BACKGROUND_BLACK + 
            message + 
            ConsoleColors.COLOR_RESET );
    }
}

class ConsoleColors {
    // ...
}

```

Puedes revisar el código [aquí](src/org/andr7st/app/Main.java).

---

## 1. Inmediate Execution

Java en las versiones 11 o superior puede ejecutar el código sin la necesidad de crear un bytecode de esta manera; la condición es que todo el código esté dentro del mismo archivo java.

* path/src$ `java org/andr7st/app/Main.java`
* path/src$ `java org/andr7st/app/*.java` # variante

---

## 2. Generar bytecode

* path/src$ `javac org/andr7st/app/Main.java`
* path/src$ `javac org/andr7st/app/*.java` # variante

---

## 3. Generar bytecode en otro directorio

Para "compilar" wn otro directorio se usa la opción `-d` el nombre de nuestro directorio es `out/`.

* path/src$ `javac -d ../out org/andr7st/app/Main.java`

Este comando habrá creado dos archivos bytecode con la ruta del paquete dentro del direcorio de destino.

---

## 4. Ejecutar bytecode


* path/src$ `java org/andr7st/app/Main`
* path/src$ `java org/andr7st/app/*`

El bytecode se encuentra dentro de otro directorio.

* path/src$ `java -cp ../out org.andr7st.app.Main`
* path/src$ `java -classpath ../out org.andr7st.app.Main` # variante
* path/src$ `java --class-path ../out org.andr7st.app.Main` # variante 

---

## 5. Creación del jar v1

* $ `jar --version` # jar 11+.x.x 

Dentro del directorio debe estar eb bytecode creado correctamente.

* path/out$ `jar -cvf Main.jar .`
* path/out$ `jar --create --verbose --file Main.jar .` # variante
* path/out$ `jar -cvf Main.jar org/andr7st/app/Main.class` # variante
* path/out$ `jar --create --verbose --file Main.jar org/andr7st/app/Main.class` # variante

---

## 6. Ejecutar jar v1

* path/out$ `java -jar ./Main.jar`

Nos devolverá el siguiente mensaje `no main manifest attribute, in Main.jar` significa que el alchivo de manifiesto no tiene la referencia al archivo que ejecuta el programa.

---

## 7. Creando archivo de configuración.

Creamos el archivo de configuración en path/src$ `src/META-INF/MANIFEST.MF`.

```Terminal
Built-By: Andr7st
Main-Class: org.andr7st.app.Start
```
---

## 8. Creación del jar v2

Creando el jar agregandole el archivo `MANIFEST.MF`.

* path/src$ `jar -cmvf META-INF/MANIFEST.MF ../out/Main.jar -C ../out org/andr7st/app/Main.class`

En la alternativa se debe poner manifest seguido del la ruta en donde se encuentra el archivo de manifiesto que hemos creado manualmente.

* path/src$ `jar --create --manifest=META-INF/MANIFEST.MF --verbose --file ../out/Main.jar -C ../out org/andr7st/app/Main.class`

---

## 9. Ejecutar jar v2

En este caso será satisfactoriamente ejecutado el jar.

* path/out$ `java -jar Main.jar`

---

<br/>

Esto sólo fue un ejercicio de práctica para el examen, existen muchas más opciones, para verlas se debe ejecutar `jar --help` para ver más detalles.

<br/>

<div align="center">
  <a href="https://github.com/Andr7st/" target="_blank">
    <img alt="image" src="project-resources/img/hello-world-jar.png" alt="imagen">
  </a>
</div>



[**Andr7st - Andrés Segura**](https://github.com/Andr7st/)

