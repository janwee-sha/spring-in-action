package com.janwee.springinaction.assembling.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Source {
    private Fruit fruit;
    private Sugar sugar;
    private Size size;

    private int hash;

    public Source withFruit(Fruit fruit) {
        this.fruit = fruit;
        return this;
    }

    public Source withSugar(Sugar sugar) {
        this.sugar = sugar;
        return this;
    }

    public Source withSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return fruit == source.fruit &&
                sugar == source.sugar &&
                size == source.size;
    }

    @Override
    public int hashCode() {
        int h = hash;
        if (h == 0) {
            h = 17;
            h = 31 * h + fruit.hashCode();
            h = 31 * h + size.hashCode();
            h = 31 * h + sugar.hashCode();
            hash = h;
        }
        return h;
    }

    @Override
    public String toString() {
        return "Source{" +
                "fruit=" + fruit +
                ", sugar=" + sugar +
                ", size=" + size +
                '}';
    }
}
