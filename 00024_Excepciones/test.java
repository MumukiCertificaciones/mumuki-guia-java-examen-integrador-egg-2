MiCalculadora pr;

@Before
public void before() {
  pr = new MiCalculadora();
}

@Test
public void para_8_a_la_2_devuelve_64() throws Exception {
	Assert.assertEquals(64, pr.potencia(8, 2), 0);
}

@Test
public void para_2_a_la_10_devuelve_1024() throws Exception {
	Assert.assertEquals(1024, pr.potencia(2, 10), 0);
}

@Test(expected = Exception.class)
public void si_n_es_0_lanza_excepcion() throws Exception {
	pr.potencia(0, 2);
}

@Test(expected = Exception.class)
public void si_n_es_negativo_lanza_excepcion() throws Exception {
  pr.potencia(-8, 2);
}


@Test(expected = Exception.class)
public void si_p_es_0_lanza_excepcion() throws Exception {
	pr.potencia(3, 0);
}

@Test(expected = Exception.class)
public void si_p_es_negativo_lanza_excepcion() throws Exception {
  pr.potencia(2, -5);
}