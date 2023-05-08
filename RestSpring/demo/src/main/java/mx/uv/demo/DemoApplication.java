package mx.uv.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	Persona personita;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String name () {
		return "Hola Mundo!";
	}

	@RequestMapping("/adios")
	public String name2 () {
		return "<h1>adios mundo</h1>";
	}

	@RequestMapping("/pregunta")
	public String name3 () {
		return "<h1>cómo estás?</h1>";
	}

	@RequestMapping("/productos")
	public List<String> productos() {
		List<String> p = new ArrayList<String>();
		p.add("pambazos");
		p.add("tamales");
		p.add("refrescos");
		return p;
	}

	@RequestMapping("/productos2")
	public List<Productos> productos2() {
		List<Productos> lista = new ArrayList<Productos>();
		Productos p0 = new Productos("pambazos", 10);
		lista.add(p0);
		Productos p1 = new Productos("tamales", 10);
		lista.add(p1);
		Productos p2 = new Productos("refrescos", 10);
		lista.add(p2);
		return lista;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String saludarGet(){
		return "Mensaje de tipo get";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String saludarpost(){
		return "Mensaje de tipo post";
	}

	@RequestMapping ( value = "/saludarPost", method = RequestMethod.POST)
    public String saludarPost(@RequestBody Persona persona) {
		personita = persona;
        return "Hola: " + persona.getNombre();
    }

	@RequestMapping("/obtener")
	public Persona obtener(){
		return personita;
	}

}
