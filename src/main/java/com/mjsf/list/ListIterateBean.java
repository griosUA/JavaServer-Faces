/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.list;

import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author grisha
 */
@ManagedBean
@RequestScoped
public class ListIterateBean {

    private ArrayList<String> listString;
    private ArrayList<Integer> listInteger;
    private ArrayList<TanksView> tvList;

    public ListIterateBean() {
    }

    @PostConstruct
    public void init() {
        listString = new ArrayList<>();
        listString.add("StringOne");
        listString.add("StringTwo");
        listString.add("StringThree");
        listString.add("Hello");
        listString.add("World");

        listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

       loadTanksData();
    }

    public void loadTanksData() {
        tvList = new ArrayList<TanksView>(Arrays.asList(
                        new TanksView("T84", 84, 84, 84),
                        new TanksView("AMX-56 Leclerc", 56, 56, 56),
                        new TanksView("Challenger 2", 2, 2, 2),
                        new TanksView("Leopard 2A7+", 22, 22, 22),
                        new TanksView("Merkava IVm", 44, 44, 546),
                        new TanksView("M1A2 SEPv2", 333, 333, 26)
                ));
    }

    public ArrayList<String> getListString() {
        return listString;
    }

    public void setListString(ArrayList<String> listString) {
        this.listString = listString;
    }

    public ArrayList<Integer> getListInteger() {
        return listInteger;
    }

    public void setListInteger(ArrayList<Integer> listInteger) {
        this.listInteger = listInteger;
    }

    public ArrayList<TanksView> getTvList() {
        return tvList;
    }

    public void setTvList(ArrayList<TanksView> tvList) {
        this.tvList = tvList;
    }

}
