package com.example.demo;

import com.example.demo.util.EntityUtils;
import com.example.demo.util.ObjetoEntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws Exception {

		ObjetoEntityUtils obj = new ObjetoEntityUtils();
		obj.setNome("blabla");
		String nome = obj.getNome();

		ObjetoEntityUtils obj2 = new ObjetoEntityUtils();

		EntityUtils.update(obj2, obj);

		System.out.println();
	}

}
