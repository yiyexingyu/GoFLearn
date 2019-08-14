package com.gof.visitor.demo2.SetElement;

import com.gof.visitor.demo2.elements.Material;
import com.gof.visitor.demo2.visitors.Company;

import java.util.ArrayList;
import java.util.List;

public class SetMaterial {

    private List<Material> materialList = new ArrayList<Material>();

    public SetMaterial() {
    }

    public String accept(Company company) {
        StringBuilder result = new StringBuilder();
        for (Material material : materialList) {
            result.append(material.accept(company)).append(" ");
        }
        return result.toString();
    }

    public void addMaterial(Material material) {
        this.materialList.add(material);
    }

    public void removeMaterial(Material material) {
        this.materialList.remove(material);
    }
}
