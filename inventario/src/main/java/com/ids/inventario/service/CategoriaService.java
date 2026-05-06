package com.ids.inventario.service;


import com.ids.inventario.exception.RecursoNotFoundException;
import com.ids.inventario.model.Categoria;
import com.ids.inventario.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }
    public List<Categoria> listarTodas() {
        return repository.findAll();
    }
    public Categoria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new RecursoNotFoundException("Categoria no encontrada con ID: " + id));
    }public Categoria guardar(Categoria categoria) {
        return repository. save(categoria);
    }
    public void eliminar(Long id) {
        Categoria categoria = buscarPorId(id);
        repository.delete(categoria);
    }
}
