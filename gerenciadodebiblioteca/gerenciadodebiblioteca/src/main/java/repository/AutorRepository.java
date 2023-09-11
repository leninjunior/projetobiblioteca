package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
	
	

}
