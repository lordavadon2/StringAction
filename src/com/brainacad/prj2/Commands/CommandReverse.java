package com.brainacad.prj2.Commands;

public class CommandReverse extends AbstractStringTransform {

    public CommandReverse(String data) {
        super(data);
    }

    @Override
    public String exec() {
        return new StringBuffer(this.data).reverse().toString();
    }
}
