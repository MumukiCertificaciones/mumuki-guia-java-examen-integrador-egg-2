Examen pr;

@Before
public void before() {
  pr = new Examen();
}

@Test
public void para_2_a_la_8_devuelve_64() throws Exception {
	Assert.assertEquals(64, pr.potencia(8, 2));
}
