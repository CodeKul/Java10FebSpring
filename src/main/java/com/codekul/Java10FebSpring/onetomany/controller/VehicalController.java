package com.codekul.Java10FebSpring.onetomany.controller;


import com.codekul.Java10FebSpring.onetomany.domain.Vehical;
import com.codekul.Java10FebSpring.onetomany.repository.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicalController {

    @Autowired
    private VehicalRepo vehicalRepo;

    @PostMapping("saveVehical")
    public String saveVehical(@RequestBody Vehical vehical){
        vehicalRepo.save(vehical);
        return "vehical saved..";
    }
}
/**
 * {
 *     "name": "TVS",
 *     "colour": "white",
 *     "parts": [
 *         {
 *             "name": "light",
 *             "number": 90977
 *         },
 *         {
 *             "name": "seat",
 *             "number": 9666
 *         }
 *     ]
 * }
 *
 */
