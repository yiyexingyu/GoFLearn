package com.gof.visitor.demo2.visitors;

import com.gof.visitor.demo2.elements.Copper;
import com.gof.visitor.demo2.elements.Paper;

public interface Company {
    String create(Paper paper);
    String create(Copper copper);
}
