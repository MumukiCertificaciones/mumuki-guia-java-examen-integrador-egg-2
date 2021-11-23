Examen pr;

@Before
public void before() {
  pr = new Examen();
  ArrayList<Integer> vector_1 = new ArrayList(Arrays.asList((1, 0)));
}

@Test
public void ASD_con_vector_1_0_devuelve_D() {
	Assert.assertEquals("D", pr.ultimoSuperviviente("ASD", vector_1));	
}