package br.com.raphamendonca.springmvc.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.raphamendonca.springmvc.query.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
