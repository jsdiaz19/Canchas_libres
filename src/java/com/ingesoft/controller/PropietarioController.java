/*
 * Proyecto de Ingenieria de Software 2017-1
 * Portal del terapeuta Sistema ATRLO * 
 * MARIO BOLANOS, JUAN SEBASTIAN LOZANO, ANDRES ACHURY * 
 */
package com.ingesoft.controller;

import com.ingesoft.model.Conectar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonatandiaz
 */
@Controller
public class PropietarioController {
        private JdbcTemplate jdbcTemplate;
        public PropietarioController(){
            Conectar con = new Conectar();
            this.jdbcTemplate = new JdbcTemplate(con.conectar());
        }
    @RequestMapping(value = "/propietario", method = RequestMethod.GET)
    public ModelAndView dueño(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav= new ModelAndView("propietario");
        String nombre = request.getParameter("nombre");
        mav.addObject("nombre", nombre.toUpperCase());
        String apellido = request.getParameter("apellido");
        mav.addObject("apellido", apellido.toUpperCase());
        
        String query = "select nombre, codcancha,path from tbcancha inner join tbusuario on cedula=codusuario where nombres=? and "
                + "apellidos=?";
        List datos = jdbcTemplate.queryForList(query,new Object[] {nombre,apellido});
        mav.addObject("datos",datos);
        return mav;
    }

}


        