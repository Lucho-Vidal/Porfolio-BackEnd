
package com.porfolio.luvidev.Interface;

import com.porfolio.luvidev.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto, lo buscamos por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
}
