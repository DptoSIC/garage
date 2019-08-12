package com.julio.garage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.julio.otros.Etiqueta;


@SpringBootApplication
@ImportResource("Spring-config.xml")
public class GarageApplication {

	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//		SpringApplication.run(GarageApplication.class, args);
	
//configuracion por XML		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
		Etiqueta etiqueta1 = context.getBean("etiqueta", Etiqueta.class);
		
		System.out.println(etiqueta1.getColor());
		System.out.println(etiqueta1.getTipo());
		
		etiqueta1.setColor("azul");
		System.out.println("coche ecologico");
		System.out.println(etiqueta1.getColor());
		
		System.out.println("funcionando...");

//deserializar json a objeto
//el fichero tiene que estar en la raiz, osea, garage
		
		ObjectMapper objectMapper = new ObjectMapper();
	
		ArrayList<Coche> coches = objectMapper.readValue(new File("coches2.json"), 
	  	objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Coche.class));

        coches.forEach(System.out::println);
		
	}

}
