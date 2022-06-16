package com.codekul.Java10FebSpring.jdbctemplete;


import com.codekul.Java10FebSpring.onetomany.domain.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class JdbcExample {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("getVehicalById")
    public List<VehicalDto> getVehical() {
        return jdbcTemplate.query(
                "select v.id,v.name,v.colour,p.number,p.name as partName from vehical v " +
                        "inner join parts p on p.vehical_id = v.id",
                new Object[]{},new VehicalRowMapper());
    }


}
