/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.map;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author grisha
 */
@ManagedBean
@RequestScoped
public class MapIterateBean {
    private Map<Integer, String> tankMap;
    
    public MapIterateBean(){
    }
    
     @PostConstruct
    public void init() {
        tankMap = new HashMap<>();
        tankMap.put(1, "K2 Black Panther");
        tankMap.put(2, "M1A2 SEPv2");
        tankMap.put(3, "Merkava IVm");
        tankMap.put(4, "Type 10");
        tankMap.put(5, "Leopard 2A7+");
        tankMap.put(6, "Challenger 2");
        tankMap.put(7, "AMX-56 Leclerc");
        tankMap.put(8, "БМ «Оплот»");
        tankMap.put(9, "VT-4/MBT3000");
    }

    public Map<Integer, String> getTankMap() {
        return tankMap;
    }

    public void setTankMap(Map<Integer, String> tankMap) {
        this.tankMap = tankMap;
    }
    
    
}
