package com.ids.inventario.service;

import com.ids.inventario.exception.RecursoNotFoundException;
import com.ids.inventario.model.Producto;
import com.ids.inventario.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository){
        this.repository = repository;
    }
    public List<Producto> listarTodos(){
        return repository.findAll();
    }
    public Producto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new RecursoNotFoundException("Producto no encontrado con ID: " + id));
    }
    public List<Producto> listarPorCategoria(Long categoriaId) {
        return repository.findByCategoriaId(categoriaId);
    }
    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }
    public void eliminar(Long id) {
        Producto producto = buscarPorId(id);
        repository.delete(producto);
    }
}
