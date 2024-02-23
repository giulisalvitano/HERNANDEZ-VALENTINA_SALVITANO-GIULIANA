package src.com.backend.parcial.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import src.com.backend.parcial.dao.impl.OdontologoDaoH2;
import src.com.backend.parcial.dao.impl.OdontologoDaoMemoria;
import src.com.backend.parcial.entity.Odontologo;
import src.com.backend.parcial.service.impl.OdontologoService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class OdontologoServiceTest {

    @Test
    public void listarTodosLosOdontologosEnH2() {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        List<Odontologo> listaDeOdontologos = odontologoService.listarOdontologos();
        assertNotNull(listaDeOdontologos);
        assertEquals(2, listaDeOdontologos.size());
    }


    @Test
    public void guardarUnOdontologoEnH2() {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo("12582545", "Fito", "Paez");

        Odontologo odontologoGuardado = odontologoService.guardarOdontologo(odontologo);

        assertNotNull(odontologoGuardado.getId());

    }


    @Test
    public void guardaUnOdontologoEnMemoria() {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoMemoria(new ArrayList<>()));
        Odontologo odontologo = new Odontologo("256418", "Harry", "Styles");

        Odontologo odontologoGuardado = odontologoService.guardarOdontologo(odontologo);
        Assertions.assertTrue(odontologoGuardado.getId() != 0);

    }


    @Test
    public void listarTodosLosOdontologosEnMemoria() {
        List<Odontologo> listaDeOdontologos = List.of(new Odontologo("87858", "ValGiu", "HerSal"));
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoMemoria(listaDeOdontologos));
        List<Odontologo> todosLosOdontologos = odontologoService.listarOdontologos();
        assertNotNull(todosLosOdontologos);
        assertEquals(1, todosLosOdontologos.size());
    }


}