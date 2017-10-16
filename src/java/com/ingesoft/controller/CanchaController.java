/*
 * Proyecto de Ingenieria de Software 2017-1
 * Portal del terapeuta Sistema ATRLO * 
 * MARIO BOLANOS, JUAN SEBASTIAN LOZANO, ANDRES ACHURY * 
 */
package com.ingesoft.controller;

import com.ingesoft.model.Conectar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mario
 */
public class CanchaController {
    private JdbcTemplate jdbcTemplate;
    public CanchaController(){
            Conectar con = new Conectar();
            this.jdbcTemplate = new JdbcTemplate(con.conectar());
        }
    @RequestMapping(value = "/cancha", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("cancha");
        String path = request.getParameter("value");
        mav.addObject("path",path);
        String query = "select nombre from tbcancha where path=?";
        String nom = jdbcTemplate.queryForObject(
            query, new Object[] {path}, String.class);
        mav.addObject("nom",nom);
        
        query = "select direccion from tbcancha where path=?";
        String dir = jdbcTemplate.queryForObject(
            query, new Object[] {path}, String.class);
        mav.addObject("dir",dir);
        
        query = "select canchastotales from tbcancha where path=?";
        int totales = jdbcTemplate.queryForObject(
            query, new Object[] {path}, Integer.class);
        mav.addObject("totales",totales);
        
        query = "select canchasdisponibles from tbcancha where path=?";
        int dispo = jdbcTemplate.queryForObject(
            query, new Object[] {path}, Integer.class);
        mav.addObject("dispo",dispo);
        return mav;
  }
}
