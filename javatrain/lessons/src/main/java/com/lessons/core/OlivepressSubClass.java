package com.lessons.core;

import java.util.List;

public class OlivepressSubClass {

    public int getOil(List<OlivemeSubClass> olives) {

        int totalOil = 0;
        for (OlivemeSubClass o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }

        return totalOil;

    }

}