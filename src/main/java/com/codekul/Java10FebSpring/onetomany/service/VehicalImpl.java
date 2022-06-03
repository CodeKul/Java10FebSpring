package com.codekul.Java10FebSpring.onetomany.service;

import com.codekul.Java10FebSpring.onetomany.domain.Vehical;
import com.codekul.Java10FebSpring.onetomany.repository.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicalImpl implements VehicalService{

    @Autowired
    private VehicalRepo vehicalRepo;

    @Override
    public String saveVehical(Vehical vehical) {
        if(vehical.getName().equals("TVS")){
            return "TVS vehical not allowed";
        }
        vehicalRepo.save(vehical);
        return "vehical saved..";
    }
}
