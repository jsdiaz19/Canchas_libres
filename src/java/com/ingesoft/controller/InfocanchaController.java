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
public class InfocanchaController {

    private final JdbcTemplate jdbcTemplate;
    public InfocanchaController(){
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    @RequestMapping(value = "/Infocancha", method = RequestMethod.GET)
    public ModelAndView Info(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav= new ModelAndView("Infocancha");
        String cod = request.getParameter("value");
        String reserva= request.getParameter("Act");
        if (reserva!=null){
            String cancha="select codcancha from tbreserva where codreserva=?";
            String codC= jdbcTemplate.queryForObject(cancha, new Object[] {reserva},String.class);
            
            String Q = "select nombre from tbcancha where codcancha=?";
            String NomCancha = jdbcTemplate.queryForObject(Q, new Object[] {codC},String.class);
            
            String temp= "delete from tbreserva where codreserva=?";
            jdbcTemplate.update(temp, new Object[] {reserva});
            
            String consulta = "select fecha,horainicio,horafinal,tarifa,nombres,apellidos,cedula,codreserva  from tbreserva natural join tbusuario "
                + "where codcancha=?";
            List datRe = jdbcTemplate.queryForList(consulta,new Object[] {codC});
            ModelAndView mtemp= new ModelAndView("Infocancha");
            mtemp.addObject("id",codC);
            mtemp.addObject("nom",NomCancha);
            mtemp.addObject("datos",datRe);
            return mtemp;
        }
        else{
            mav.addObject("id",cod);
            String Query = "select nombre from tbcancha where codcancha=?";
            String q = jdbcTemplate.queryForObject(Query, new Object[] {cod},String.class);
            mav.addObject("nom",q);
            String query = "select fecha,horainicio,horafinal,tarifa,nombres,apellidos,cedula,codreserva  from tbreserva natural join tbusuario "
                + "where codcancha=?";
            List datos = jdbcTemplate.queryForList(query,new Object[] {cod});
            mav.addObject("datos",datos);
            return mav;
        }    
    }
}
