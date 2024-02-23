package src.com.backend.parcial.service;

import src.com.backend.parcial.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {

    Odontologo guardarOdontologo(Odontologo odontologo);

    List<Odontologo> listarOdontologos();
}
