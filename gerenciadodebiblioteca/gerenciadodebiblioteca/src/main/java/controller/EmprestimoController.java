package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Emprestimo;
import service.EmprestimoService;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {
	
	
	
	
	@Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public ResponseEntity<Emprestimo> criarEmprestimo(@RequestBody Emprestimo emprestimo) {
        Emprestimo novoEmprestimo = emprestimoService.criarEmprestimo(emprestimo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoEmprestimo);
    }

    @PutMapping("/{emprestimoId}/devolucao")
    public ResponseEntity<Emprestimo> devolverEmprestimo(@PathVariable Long emprestimoId) {
        Emprestimo emprestimoDevolvido = emprestimoService.devolverEmprestimo(emprestimoId);
        return ResponseEntity.ok(emprestimoDevolvido);
    }

    
}


