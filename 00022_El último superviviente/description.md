Tenemos una cadena de letras y un arreglo vector de números.

* Los `numeros` indican la posición, en orden, de las letras que deben ser removidas, desde el principio del vector.
* Luego de remover una letra, el tamaño de la cadena disminuye (no quedan espacios vacíos).

> Definí una función que devuelva la ultima letra superviviente.

Por ejemplo, si el string original fuera "zbk" y el array [0, 1], el paso a paso sería así:

```java
str = "zbk", arr = [0, 1]
str = "bk", arr = [1]
str = "b", arr = []
return "b";
```

Resultados esperados:

* _Si se ingresan el String **"ASD"** y el vector **[1, 0]**, deberá devolver la letra **"D"**._
* _Si se ingresan el String **"Burger"** y el vector **[4,3,2,1,0]**, deberá devolver la letra **"r"**._
* _Si se ingresan el String **"Milanga"** y el vector **[6,4,2,1]**, deberá devolver **"Mag"**._
* _Si se ingresan el String **"Vaso"** y el vector **[]**, deberá devolver **"Vaso"**._
* _Si se ingresan el String **"ExamenFinal"** y el vector **[10,9,8,7,6,5,4,3,2,1]**, deberá devolver la letra **"E"**._
