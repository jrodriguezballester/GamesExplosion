# PRÁCTICA 4: Gestionar una pequeña colección de juegos

Vamos a crear una App con 3 actividades para la gestión de una pequeña colección de
videojuegos.

## Ejercicio 1: (30%)

- En la actividad principal cambiaremos el icono de la app por uno parecido o igual al
de la figura y le pondremos como nombre PMDM y nuestro Nombre y apellido

![Screenshot](/pantallazos/capt1.png)

- Implementamos un ListView simple como el de la figura

![Screenshot](/pantallazos/capt2.png)

- El modelo de datos incluirá la clase Game con los atributos que creas conveniente.
Carga 4 o 5 juegos al iniciar la aplicación para probar. La imagen de cada juego
cárgala como un mipmap en tu aplicación. Si cargas 4 juegos ponle a cada juego la
imagen que toque.

![Screenshot](/pantallazos/capt3.png)

## Ejercicio 2: (20%)

Al hacer click sobre cualquier elemento de la lista se abrirá la actividad Game Details. En
ella se muestra la información de cada juego. Hay muchas formas de diseñar el layout,
puedes hacerlo con un Relative Layout con la estructura siguiente:

Para posicionar los elementos puedes ayudarte de propiedades para ajustar márgenes y
padding y otras tales como:

android:layout_below="@+id/textViewSummary" Esta propiedad situa al
elemento justo debajo del elemento con id textViewSummary

android:layout_toRightOf="@id/imageView" Esta propiedad sitúa al elemento
justo a la derecha del elemento con id imageView

Hay que implementar también la opción de volver a la actividad principal con:
getSupportActionBar().setDisplayHomeAsUpEnabled(true);

![Screenshot](/pantallazos/capt1.png)

## Actividad 3: (25%)

Crea un adaptador propio con un layout propio para visualizar cada elemento en la ListView.

El layout propio debe mostrar un icono de la plataforma: PC, SWITCH, PS4 y XONE; el
título, la nota y la fecha de publicación. El diseño del layout es libre.

Si quieres puedes hacer que el layout de cada elemento sea de color blanco para los
elementos pares y de color gris para los impares. Lo puedes hacer cargando 2 layouts
diferentes por ejemplo.

![Screenshot](/pantallazos/capt4.png)
