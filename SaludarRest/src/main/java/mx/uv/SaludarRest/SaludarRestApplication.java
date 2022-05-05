package mx.uv.SaludarRest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SaludarRestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SaludarRestApplication.class, args);

	}
	ArrayList<Saludador>saludos=new ArrayList();
	@RequestMapping("/")
    public String home(){
        return "Hola home";
    }
	@RequestMapping(value="/saludar", method=RequestMethod.GET)
	public String saludarGet(){
		return "/saludar GET";
	}
	@RequestMapping(value="/saludar", method=RequestMethod.POST)
	public String saludarPost(){
		return "/saludar POST";
	}
	@GetMapping(value="/saludador")
	public Saludador saludar(){
		return new Saludador("Hello");
	}
	@RequestMapping(value="/saludarNombre/{nombre}", method=RequestMethod.GET)
	public String saludador2(@PathVariable String nombre){
		return "Hola "+nombre;
	}
	@RequestMapping(value="/guardarSaludador/{nombre}", method=RequestMethod.GET)
	public String guardarSaludador(@PathVariable String nombre){
		saludos.add(new Saludador(nombre));
		return "Guardado";
	}
	@RequestMapping(value="/mostrarSaludadores", method=RequestMethod.GET)
	public ArrayList verSaludadores(){
		return saludos;
	}
	@RequestMapping(value="/borrarSaludadores/{nombre}", method=RequestMethod.GET)
	public String borrarSaludadores(@PathVariable String nombre){
		Boolean encontrado=false;
		for (int i=0; i<saludos.size(); i++) {
			if(saludos.get(i).getContenido().equals(nombre)){
				encontrado=true;
				saludos.remove(i);
			}
		}
		if(encontrado){
			return "Saludador borrado.";
		}else{
			return "Saludador no encontrado.";
		}
	}
}
