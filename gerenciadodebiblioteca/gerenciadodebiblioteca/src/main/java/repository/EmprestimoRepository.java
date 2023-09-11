package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Emprestimo;



@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
