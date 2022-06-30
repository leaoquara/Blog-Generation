package br.com.Generation.Blog.BlogPessoal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.Generation.Blog.BlogPessoal.model.Postagem;
import br.com.Generation.Blog.BlogPessoal.repository.PostagemRepository;

//indica para o spring que essa classe vai ser uma classe controladora
@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {

		@Autowired
	private PostagemRepository repository;
	
		@GetMapping
		public ResponseEntity<List<Postagem>> GetAll(){
			return ResponseEntity.ok(repository.findAll());	
		}
		
		@PostMapping
		public ResponseEntity<Postagem> InserirPostagem(@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));	
	}
}	
		
