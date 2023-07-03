package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.models.Usuario;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Diego", "Juan", "Jose");
	}
	
	@RequestMapping(value="usuario1")
	public Usuario listarUsuario(){
		Usuario us1 = new Usuario();
		
		us1.setNombre("Ivan");
		us1.setApellido("Balmaceda");
		us1.setEmail("balmacedaivan5@gmail.com");
		us1.setPassword("springproyect");
		us1.setTelefono("234565432");
		
		return us1;
	}
	
	
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id){
		
		Usuario us1 = new Usuario();
		
		us1.setId(id);
		us1.setNombre("Marcos");
		us1.setApellido("Balmaceda");
		us1.setEmail("balmacedaMarcos@gmail.com");
		us1.setPassword("marcos123");
		us1.setTelefono("234556755");
		
		return us1;
	}
	
	
	
	@RequestMapping(value="usuarios/lista")
	public List<Usuario> listarVariosUsuarios(){
		
		List<Usuario> usuarios = new ArrayList<>();
		
		Usuario us1 = new Usuario();
		us1.setId(3L);
		us1.setNombre("Anto");
		us1.setApellido("Balmaceda");
		us1.setEmail("balmacedaAnto@gmail.com");
		us1.setPassword("anto123");
		us1.setTelefono("236764356");
		
		Usuario us2 = new Usuario();
		us2.setId(4L);
		us2.setNombre("Pablo");
		us2.setApellido("Balmaceda");
		us2.setEmail("balmacedaPablo@gmail.com");
		us2.setPassword("pablo123");
		us2.setTelefono("2346765446");
		
		Usuario us3 = new Usuario();
		us3.setId(5L);
		us3.setNombre("Pocho");
		us3.setApellido("Balmaceda");
		us3.setEmail("balmacedaPocho@gmail.com");
		us3.setPassword("pochito123");
		us3.setTelefono("2617666383");
		
		usuarios.add(us1);
		usuarios.add(us2);
		usuarios.add(us3);
				
		return usuarios;
		
		}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user = usuarioDao.obtenerUsuario();
		
		return user;
	}
	
	
	
}












