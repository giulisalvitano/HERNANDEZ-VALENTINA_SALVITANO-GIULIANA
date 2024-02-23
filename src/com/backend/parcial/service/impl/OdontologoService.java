package src.com.backend.parcial.service.impl;

import src.com.backend.parcial.dao.IDao;
import src.com.backend.parcial.entity.Odontologo;
import src.com.backend.parcial.service.IOdontologoService;

import java.util.List;

public class OdontologoService implements IOdontologoService {
    private final IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoIDao.guardar(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologoIDao.listarTodos();
    }

}

