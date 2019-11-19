# TallerSolid

Identificar

Violacion en  el principio SRP en la clase Book
La clase book esta manejando dos responsabilidades, de la cual una no deberia manejar, que es el metodo searchBook() y se movio el metodo a la clase Storebook

Violacion en el principio OCP en la clase StoreBook
El metodo pay al encontrarse manejando los dos tipos de pago, hace que cuando se quiera implementar otro tipo de pago, se tenga que modificar este metodo por cada nuevo tipo de pago, para solucionarlo, se debe hacer esta funcionalidad como interfaz, y los tipos de pago se las dividen en clases, y cada una implementa la interface pay. Con esta solucion se cumple el principio DIP, para que no existan dependencias entre clases, sino que dependan de la abstracion general(En este caso, la interface pay), ademas con la interfaz pay, podemos dar la facilidad al usuario de que pueda especificar que pago realizar en un dia determinado, asi cumpliendo con el principio LSP

Para que la tienda, no trabaje con un solo tipo de libro, se puede diseñar una interfaz general, y cambiar el atributo del libro en la tienda, cumpliendo con el principio DIP




