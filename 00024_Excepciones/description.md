Se te pide computar la potencia de un número implementando una calculadora. 

Vamos a usar la clase `MiCalculadora` que consiste de un solo método: `potencia(int,int)`. Este método
toma dos enteros `n` y `p` como parámetros y devuelve la n-potencia de p (es decir p elevado a la n).

Observaciones:

* Si _n_ o _p_ es negativo, el método debe tirar una excepción que diga: "n o p no pueden ser negativos". 
* Si _n_ o _p_ son 0 debe tirar otra excepción que diga "n o p no pueden ser 0".

> Completá la función de la clase MiCalculadora para que retorne el valor del cálculo de la potencia y
las excepciones correspondientes según lo dicho anteriormente.

Resultados esperados:

* _Si ingresa el **n = 8** y **p = 2*, devolverá **64**._
* _Si ingresa el **n = 0** y **p = 2*, devolverá **"n o p no pueden ser 0**._
* _Si ingresa el **n = -8** y **p = 2*, devolverá **"n o p no pueden ser negativos"**._
