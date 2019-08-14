package com.gof.visitor.demo2.visitors;

import com.gof.visitor.demo2.elements.Copper;
import com.gof.visitor.demo2.elements.Paper;

public class MintCompany implements Company {

    public MintCompany() {
    }

    @Override
    public String create(Paper paper) {
        return "纸币";
    }

    @Override
    public String create(Copper copper) {
        return "铜币";
    }
}
