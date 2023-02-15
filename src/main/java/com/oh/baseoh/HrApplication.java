package com.oh.baseoh;

import com.oh.baseoh.modelo.Alumno;
import com.oh.baseoh.repositorio.AlumnoRepositorio;
import com.oh.baseoh.repositorio.GradoAnioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.net.InetSocketAddress;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	@Autowired
	GradoAnioRepositorio gradoAnioRepositorio;
	@Autowired
	AlumnoRepositorio alumnoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	GradoAnioPK llave = new GradoAnioPK("05","1995");
		GradoAnio gradoAnio = new GradoAnio(llave,"Julio Profe");
		gradoAnioRepositorio.save(gradoAnio);*/

	/*		BigDecimal cuota = BigDecimal.valueOf(80.46);
		Alumno alumno = new Alumno("Joseph","Carpenter",cuota);
		alumnoRepositorio.save(alumno);*/
	}
}
