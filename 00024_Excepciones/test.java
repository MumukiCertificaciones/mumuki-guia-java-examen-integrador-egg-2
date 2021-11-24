MiCalculadora pr;

@Before
public void before() {
  pr = new MiCalculadora();
}

@Rule
public ExpectedException exceptionRule = ExpectedException.none();


@Test
public void para_8_a_la_2_devuelve_64() throws Exception {
	Assert.assertEquals(64, pr.potencia(8, 2), 0);
}

@Test
public void para_2_a_la_10_devuelve_1024() throws Exception {
	Assert.assertEquals(1024, pr.potencia(2, 10), 0);
}

@Test(expected = Exception.class)
public void si_n_es_0_lanza_excepcion() {
    exceptionRule.expect(Exception.class);
    exceptionRule.expectMessage("n o p no pueden ser negativos");
    pr.potencia(0, 2);
}
