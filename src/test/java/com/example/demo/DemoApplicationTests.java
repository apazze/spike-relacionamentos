package com.example.demo;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.relacionamentos.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CategoriaRepository categoriaRepository;
	@Test
	void contextLoads() {
		categoriaRepository.save(new Categoria());
	}

}
