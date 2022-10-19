
package com.primerexamen.service;

import com.primerexamen.entity.Pelicula;
import java.util.List;


public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
