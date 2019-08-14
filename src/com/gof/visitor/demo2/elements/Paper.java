package com.gof.visitor.demo2.elements;

import com.gof.visitor.demo2.visitors.Company;

public class Paper implements Material {

    public Paper() {
    }

    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
