package service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Emprestimo;
import jakarta.persistence.EntityNotFoundException;
import repository.EmprestimoRepository;

@Service
public class EmprestimoService {

	
	@Autowired
    private EmprestimoRepository emprestimoRepository;

    public Emprestimo criarEmprestimo(Emprestimo emprestimo) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataDevolucao = dataAtual.plusWeeks(2); // Exemplo: prazo de 2 semanas

        emprestimo.setDataDevolucao(dataDevolucao);
        emprestimo.setDevolvido(false);

        return emprestimoRepository.save(emprestimo);
    }

    public Emprestimo devolverEmprestimo(Long emprestimoId) {
        Emprestimo emprestimo = emprestimoRepository.findById(emprestimoId).orElseThrow(EntityNotFoundException::new);

        emprestimo.setDevolvido(true);
        return emprestimoRepository.save(emprestimo);
    }
	
	
}
