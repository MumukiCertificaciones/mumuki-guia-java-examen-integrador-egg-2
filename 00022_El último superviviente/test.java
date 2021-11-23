Examen pr;

@Before
public void before() {
  pr = new Examen();
}

@Test
public void ASD_con_vector_1_0_devuelve_D(){
	Assert.assertEquals("D", ultimoSuperviviente("ASD", [1, 0]));	
}
