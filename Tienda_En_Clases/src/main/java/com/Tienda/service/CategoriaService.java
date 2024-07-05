package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Obtener listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
    
}
