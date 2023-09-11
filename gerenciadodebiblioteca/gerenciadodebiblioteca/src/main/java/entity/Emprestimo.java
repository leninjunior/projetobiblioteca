package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    private String pessoaQuePegou;
    private LocalDate dataDevolucao;
    private boolean devolvido;
    
    
	public void setDevolvido(boolean b) {
		// TODO Auto-generated method stub
		
	}


	public void setDataDevolucao(LocalDate dataDevolucao2) {
		// TODO Auto-generated method stub
		
	}

    // Getters e setters
}
