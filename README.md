# PRÁCTICA 4: Gestionar una pequeña colección de juegos

Vamos a crear una App con 3 actividades para la gestión de una pequeña colección de
videojuegos.

## Version 1

### Ejercicio 1: (30%)

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

### Ejercicio 2: (20%)

Al hacer click sobre cualquier elemento de la lista se abrirá la actividad Game Details. En
ella se muestra la información de cada juego. Hay muchas formas de diseñar el layout,
puedes hacerlo con un Relative Layout con la estructura siguiente:

Para posicionar los elementos puedes ayudarte de propiedades para ajustar márgenes y
padding y otras tales como:

android:layout_below="@+id/textViewSummary" Esta propiedad situa al
elemento justo debajo del elemento con id textViewSummary

android:layout_toRightOf="@id/imageView" Esta propiedad sitúa al elemento
justo a la derecha del elemento con id imageView

![Screenshot](/pantallazos/capt7.png)

Hay que implementar también la opción de volver a la actividad principal con:
getSupportActionBar().setDisplayHomeAsUpEnabled(true);

![Screenshot](/pantallazos/capt1.png)

### Ejercicio 3: (25%)

Crea un adaptador propio con un layout propio para visualizar cada elemento en la ListView.

El layout propio debe mostrar un icono de la plataforma: PC, SWITCH, PS4 y XONE; el
título, la nota y la fecha de publicación. El diseño del layout es libre.

Si quieres puedes hacer que el layout de cada elemento sea de color blanco para los
elementos pares y de color gris para los impares. Lo puedes hacer cargando 2 layouts
diferentes por ejemplo.

## Version 2

### Mejorar Actividad 2

    * Se ha renombrado la activity a GameDetails como se pedía.
    * Se ha implentado la puntuación como un sistema de mostrar estrellas.
    * Se muestran las plataformas como iconos.
    * Se ha mejorado el diseño del la activity

![Screenshot](/pantallazos/capt6.png)

### Completar actividad 3

El layout propio debe mostrar un icono de la plataforma: PC, SWITCH, PS4 y XONE; el
título, la nota y la fecha de publicación. El diseño del layout es libre.

![Screenshot](/pantallazos/capt8.png)

Se han añadido la fecha, la puntuaciony los iconos de las plataformas como mipmap (las imagenes de los juegos se han cargado directamente en la carpeta drawable), Para ello

    * Se ha remodelado la clase Juego.
    * Se ha mejorado la lectura de las Plataformas y no hay que poner valores vacios.
    * Se ha rediseñado el layout
    * Se han añadido los iconos como desde New->Image Asset

### Otras mejoras

    * Se ha modificado el Style del AcctionBar
      + Se han dejado comentado lineas para hacer el texto responsivo pero van en funcion de la version de android (y no quiero cargala)

![Screenshot](/pantallazos/capt9.png)

### Dificultades de realizacion

    * Diseño de las activitys, layouts debido a que me gusta poco diseñar y la dificultad de comprender y usar los distintos tipos layout, he intentar mantener valores responsivos.
    * Poder acceder a los archivos imagenes (desde java) al final los guardo como int en la clase juego y el int se obtiene tan sencillo como poner R.carpeta.nombreimagen
    * La puntuacion la marco como hacer visibles iconos Star_on. He intentado hacerlo como crear iconos Star_on/Star_off hasta el 5 pero se queda para una proxima mejora.
