D pr;

@Before
public void before() {
  pr = new D();
}

@Test
public void con_3_se_obtiene_162() {
	Assert.assertEquals(162, pr.func(3));
}

@Test
public void con_4_se_obtiene_512() {
	Assert.assertEquals(512, pr.func(4));
}

@Test
public void con_10_se_obtiene_20000() {
	Assert.assertEquals(20000, pr.func(10));
}