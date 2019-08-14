package com.gof.visitor.demo2.elements;

import com.gof.visitor.demo2.visitors.Company;

public class Copper implements Material {

    public Copper() {
    }

    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
