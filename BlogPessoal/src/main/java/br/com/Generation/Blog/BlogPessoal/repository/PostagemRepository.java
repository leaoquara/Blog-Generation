package br.com.Generation.Blog.BlogPessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.Generation.Blog.BlogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	//repositorio de consulta do banco de dados.
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	//SELECT * FROM tb_postagem WHERE titulo LIKE = "%titulo%"
}
