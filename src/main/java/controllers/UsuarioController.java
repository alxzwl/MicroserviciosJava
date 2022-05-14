package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import models.Usuario;

@RestController
public class UsuarioController {
	
	@RequestMapping(value = "usuario")
	public Usuario getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Lukas");
		usuario.setApellido("Motola");
		usuario.setEmail("motola@lukas.com");
		usuario.setTelefono("5544332211");
		usuario.setPassword("1234");
		
		return usuario;
	}

}
