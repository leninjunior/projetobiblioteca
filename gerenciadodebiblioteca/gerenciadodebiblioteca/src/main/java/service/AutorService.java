package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Autor;
import jakarta.persistence.EntityNotFoundException;
import repository.AutorRepository;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public Autor buscarAutor(Long id) {
        return autorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Autor não encontrado com o ID: " + id));
    }

    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor atualizarAutor(Long id, Autor autor) {
        if (!autorRepository.existsById(id)) {
            throw new EntityNotFoundException("Autor não encontrado com o ID: " + id);
        }

        autor.setId(id);
        return autorRepository.save(autor);
    }

    public void excluirAutor(Long id) {
        if (!autorRepository.existsById(id)) {
            throw new EntityNotFoundException("Autor não encontrado com o ID: " + id);
        }

        autorRepository.deleteById(id);
    }
}
	
