package com.codekul.Java10FebSpring.jdbctemplete;

import com.codekul.Java10FebSpring.onetomany.domain.Vehical;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicalRowMapper implements RowMapper<VehicalDto> {
    @Override
    public VehicalDto mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Vehical vehical = new Vehical();
        VehicalDto vehical = new VehicalDto();
        vehical.setId(rs.getInt("id"));
        vehical.setColor(rs.getString("colour"));
        vehical.setName(rs.getString("name"));
        vehical.setNumber(rs.getString("number"));
        vehical.setPartName(rs.getString("partName"));
        return vehical;
    }
}
