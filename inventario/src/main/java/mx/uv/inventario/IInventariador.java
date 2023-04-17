package mx.uv.inventario;

import org.springframework.data.repository.CrudRepository;

public interface IInventariador extends CrudRepository<Inventariador, Integer>{

    static String getNombre() {
        return null;
    }

}
