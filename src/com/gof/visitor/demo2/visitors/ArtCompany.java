package com.gof.visitor.demo2.visitors;

import com.gof.visitor.demo2.elements.Copper;
import com.gof.visitor.demo2.elements.Paper;

public class ArtCompany implements Company {

    public ArtCompany() {
    }

    @Override
    public String create(Paper paper) {
        return "讲学图";
    }

    @Override
    public String create(Copper copper) {
        return "朱熹铜像";
    }
}
