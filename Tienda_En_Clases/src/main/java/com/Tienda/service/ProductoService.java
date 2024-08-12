package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //Obtener listado de productos en un List
    public List<Producto> getProducto(boolean activos);
    
    //Se optiene producto mediante id
    public Producto getProducto(Producto producto);
    
    //Metodo de guardar
    public void save(Producto producto);
     //Metodo de borrar
    public void delete(Producto producto);
}

