Examen pr;

@Before
public void before() {
  pr = new Examen();
}

@Test
public void ASD_con_vector_1_0_devuelve_D() {
	Assert.assertEquals("D", pr.ultimoSuperviviente("ASD", new int[] {1, 0}));	
}

@Test
public void Burger_con_vector_4_3_2_1_0_devuelve_r() {
	Assert.assertEquals("r", pr.ultimoSuperviviente("Burger", new int[] {4,3,2,1,0}));
}

@Test
public void Milanga_con_vector_6_4_2_1_devuelve_Mag() {
	Assert.assertEquals("Mag", pr.ultimoSuperviviente("Milanga", new int[] {6,4,2,1}));
}

@Test
public void Vaso_con_vector_vacio_devuelve_Vaso() {
	Assert.assertEquals("Vaso", pr.ultimoSuperviviente("Vaso", new int[] {}));
}

@Test
public void ExamenFinal_con_vector_10_9_8_7_6_5_4_3_2_1_devuelve_E() {
	Assert.assertEquals("E", pr.ultimoSuperviviente("ExamenFinal", new int[] {10,9,8,7,6,5,4,3,2,1}));
}

