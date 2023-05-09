package com.example.demo;

import com.example.demo.mapper.ClassA;
import com.example.demo.mapper.ClassB;
import com.example.demo.util.EntityUtils;
import com.example.demo.util.ObjetoEntityUtils;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


	private final ModelMapper mapper = new ModelMapper();

	@Test
	void contextLoads() throws Exception {

		ClassA classA = new ClassA();
		classA.setNome("fulano");

		ClassB map = mapper.map(classA, ClassB.class);


		ObjetoEntityUtils obj = new ObjetoEntityUtils();
		obj.setNome("blabla");
		String nome = obj.getNome();

		ObjetoEntityUtils obj2 = new ObjetoEntityUtils();

		EntityUtils.update(obj2, obj);

		System.out.println();
	}

}
