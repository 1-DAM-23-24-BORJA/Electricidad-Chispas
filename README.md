# Electricidad Chispas

Digitalizar una empresa que vende productos y servicios relacionados con la electricidad. 

## Descripción

La empresa ‘Electricidad Chispas’ desea digitalizar su empresa para ser más competitiva frente a la
competencia y maximizar los ingresos. Contrata nuestros servicios.
Nos reunimos con ellos y nos dan información sobre su empresa:
* Toda la gestión de la empresa está realizada con un libro de cálculo en Excel.
*  El libro excel que maneja los clientes, tiene las siguientes hojas:
   *  Autónomos: personas que trabajan por su cuenta.
   *  Sociedades: empresas con varios trabajadores.
   *  Productos: productos físicos que venden, por ejemplo, bombillas, interruptores, cable,
    etc.
   *  Servicios: servicios que realizan a sus clientes, por ejemplo, reparación de una
    lámpara, cambio de un diferencial, etc.
   *  Facturas: facturas que hacen a sus clientes.
   *  Impresión factura.
*  En la hoja de autónomos están las siguientes columnas:
   *  Código Cliente: número único que identifica al cliente (Tanto para autónomos como
 para sociedades).
   *  Nombre: nombre del autónomo.
   *  Apellidos: apellidos del autónomo.
   *  Dni.
   *  Dirección Postal.
   *  Población.
   *  Provincia.
   *  Email.
   *  Teléfono.
*  En la hoja de sociedades están las siguientes columnas:
   *  Código Cliente: número único que identifica al cliente (tanto para autónomos como para sociedades).
   *  Razón Social: nombre de la empresa.
   *  CIF: Es como el DNI de las empresas.
   *  Dirección Postal.
   *  Población.
   *  Provincia.
   *  Email.
   *  Teléfono.
*  En la hoja de productos están las siguientes columnas:
   *  Código Producto: número único que identifica al producto.
   *  Nombre.
   *  Marca.
   *  Modelo.
   *  Precio. (10€)
   *  Tipo IVA. (21%)
*  En la hoja de servicios están las siguientes columnas:
   *  Código Servicio: número único que identifica al producto.
   *  Nombre.
   *  Precio.
   *  Tipo IVA.
   *  En la hoja de Facturas están las siguientes columnas:
   *  Código de factura: único por cada factura.
   *  Fecha de factura.
   *  Cliente (sólo se permite un cliente por factura).
   *  Productos (puede contener de 0 a N productos. No pueden estar repetidos).
   *  Servicios (puede contener de 0 a N servicios. No pueden estar repetidos).
   *  Base Imponible. El total de los productos más el total de servicios SIN IVA.
   *  Total. El total de los productos más el IVA. Recuerda que cada producto o servicio lleva un IVA asociado.
*  Tienen otra hoja llamada Impresión Facturas que sirve para crear una plantilla de impresión de la factura para los clientes. En esta hoja están los siguientes datos:
   *  Código de Factura. | Fecha de Factura.
   *  Cif/Nif del cliente
   *  Nombre del cliente.
   *  Dirección del cliente.
   *  Población del cliente.
   *  Provincia del cliente.
*  Además tiene entre 1 a N líneas de ventas (productos y servicios) con esta información:
   *  Código
   *  Nombre
   *  Precio (10€)
   *  Tipo IVA (21%)
   *  Total con IVA (precio + IVA) (12,1€)
*  Base Imponible
*  Total Factura

Se pide lo siguiente:
Diseño Diagrama de Clases en UML que recoja todo lo expuesto en el libro Excel de la
empresa y nuevas entidades que necesitemos para digitalizar el producto.
Creación de las Clases en Java obtenidas del Diagrama de Clases.
Repositorio con GIT para recoger todo el código. Es necesario al menos tener una rama
master y otras subramas. La fusión de las subramas a master se hará a través de Pull
Requests.
Para probar que las clases creadas recogen toda la lógica necesaria para la realización de la
aplicación, tendremos una Clase Main que me permita introducir la siguiente información a
través de Scanner:
*  Un cliente autónomo.
*  Un cliente sociedad.
*  Dos productos.
*   Dos servicios.
*   Una factura con:
Autónomo.
*   Un producto.
*   Un servicio.
*   Una factura con:
Sociedad.
*  Un producto.
*  Un servicio.
Crearemos una clase llamada InvoicePrinter (Impresora de Factura) que emule la hoja del
cliente que tenía para imprimir las facturas. Esta clase sirve para imprimir facturas. La
estructura será la siguiente:
Pistas:
Analizar bien las clases a crear pues aunque algunas tienen un nombre distinto son “las
mismas”. En estos casos, además de crear las clases, crea una interfaz que represente a esas
clases. Recuerda: clase perro y clase gato pertenecen a la interfaz Animal.
Línea de Ventas es simplemente un producto y un servicio vendido.
El método print de la clase InvoicePrinter, debe imprimir cada una de la información solicitada
en una línea con println.
 Tipo de IVA: tendremos tres tipos de IVA:
   *   Tipo 0: el iva es 0%. Producto de 10€ más iva de 0% = 10€
   *   Tipo 4: el iva es 4%. Producto de 10€ más iva de 4% = 10 * (1 + 0,04) = 10.4€
   *   Tipo 10: el iva es 10%. Producto de 10€ más iva de 10% = 10 * (1 + 0,10) = 11€
   *   Tipo 21: el iva es 21%. Producto de 10€ más iva de 21% = 10 * (1 + 0,21) = 12,1€
