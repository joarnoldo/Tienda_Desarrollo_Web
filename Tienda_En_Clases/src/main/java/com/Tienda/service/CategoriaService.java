package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Obtener listado de categorias en un List
    public List<Categoria> getCategoria(boolean activos);
    
    //Se optiene categoria mediante id
    public Categoria getCategoria(Categoria categoria);
    
    //Metodo de guardar
    public void save(Categoria categoria);
     //Metodo de borrar
    public void delete(Categoria categoria);
}
