# Paquetes

Los paquetes son un conjunto de agrupaciones de Tipos(clases, interfaces, anotaciones y enums)

Su función es organizar el código, de tal manera que todos puedan encontrar facilmente los tipos segun
su funcionalidad.
Por ejemplo en java existe un paquete para agrupar los paquetes fundamentales la cual es java.lang,
existe otro paquete que agrupa los tipos para la manipulacion de entrada/salida llamada java.io

Un ejemplo de esto es que nosotros podemos agrupar las siguientes clases/interfaces dentro de un paquete llamado
graphics:

interfaz Draggable  
clase abstracta Graphic  
clase Circulo  
clase Rectangulo  
clase Punto  
clase Linea  

## Nombrando Paquetes:
El compilador permite tener muchas clases con el mismo nombre, pero estas deben estar en diferentes paquetes. 
Para diferenciar entre un tipo y otro java utiliza el fqd(fully qualified name) de las clases, esto es la dirección
donde se encuentra fisicamente la clase, para la clase Rectangulo el fqd es graphic.Rectangulo.

Convención de nombres:

Para evitar el conflictos de nombres de clases o interfaces, las compañias utilizan el nombre de dominio reverso
para nombrar sus paquetes. por ejemplo:

com.ejemplo.mipaquete para un paquete nombrado mipaquete creado por ejemplo.com

los nombres de los paquetes para el lenguaje en si, comienzan con java o javax.

Usar miembros de paquetes:

1. Refererirse a un miembro por su fqd
2. Importar el paquete miembro
3. Importar todos los miembros del paquete

Referirse a un miembro por su fqd:
Se puede hacer uso de una clase por sus nombres simples cuando estan siendo utilizadas en un miembro 
que esta dentro del mismo paquete.

Sin embargo si se requiere utilizar un miembro desde otro paquete, este debera ser importado mediante su
fqd por ejemplo:

graphics.Rectangulo

Se podria utilizar el fqd para crear una instancia.

graphics.Rectangulo rectangulo = new graphics.Rectangulo();

Importando un Paquete miembro:

Para importar un paquete miembro, este debera utilizar la palabra import, justo despues de package y antes de la 
definición del tipo, por ejemplo

import graphics.Rectangulo;

Ahora se puede utilizar el nombre del tipo y crear una instancia.

Rectangulo rectangulo = new Rectangulo();

Importando todos los miembros de un paquete:

Si se requiere utilizar varios miembros de un paquete, entonces debemos agregar a nuestro paquete el wildcard *, justo
despues del paquete. por ejemplo

import graphics.*;

importara todos los miembros del paquete graphics, de esta manera podremos utilizar los tipos contenidos en este
paquete.

Circulo circulo = new Circulo();
Rectangulo rectangulo = new Rectangulo();

Ambiguedad en los Nombres:


