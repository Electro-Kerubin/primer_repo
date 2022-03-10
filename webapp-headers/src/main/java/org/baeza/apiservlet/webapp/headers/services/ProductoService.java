package org.baeza.apiservlet.webapp.headers.services;

import org.baeza.apiservlet.webapp.headers.models.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> listar();
}
