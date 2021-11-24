Te dejamos cuatro clases definidas: A, B, C y D. Cada una tendrá la implementación y sobreescritura de `func(int a)`.

D deberá heredar de C, C de B, y B de A. A su vez, se define `func(int a)` de la siguiente forma:

* En la clase `A`, `func()` multiplica un valor pasado por parámetro por 2.
* En la clase `B`, `func()` multiplica el valor `a` pasado por parámetro por lo que devuelva `func(a)` en la clase padre `A`.
* En la clase `C`, `func()` multiplica el valor `a` pasado por parámetro por lo que devuelva `func(a)` en la clase padre `B`.
* En la clase `D`, `func()` multiplica el valor `a` pasado por parámetro por lo que devuelva `func(a)` en la clase padre `C`.

> Modificá las 4 clases para que retornen el producto correspondiente según lo dicho anteriormente.

Por ejemplo:

``` java
D d = new D();
System.out.println(d.func(3)); //162
```

Resultados esperados:

* _Si ingresa el número **3** en la clase D, el valor final sería **162**._
* _Si ingresa el número **4** en la clase D, el valor final sería **512**._
* _Si ingresa el número **10** en la clase D, el valor final sería **20000**._