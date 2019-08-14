package com.gof.visitor.demo2.elements;

import com.gof.visitor.demo2.visitors.Company;

public interface Material {
    String accept(Company visitor);
}
