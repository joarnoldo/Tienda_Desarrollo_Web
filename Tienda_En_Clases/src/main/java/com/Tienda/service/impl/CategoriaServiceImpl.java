package com.Tienda.service.impl;

import com.Tienda.service.CategoriaService;
import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos){
        var lista=categoriaDao.findAll();
            if (activos) {
               lista.removeIf(e -> !e.isActivo());
            }
            return lista;
    }
    
}
