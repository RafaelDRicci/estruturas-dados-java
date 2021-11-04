package com.dio.listasencadeadas;

import java.util.Objects;

public class No <T>{

    private T object;
    private No<T> refNo;

    public No(T object) {
        this.object = object;
        refNo = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return object.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No<?> no = (No<?>) o;
        return Objects.equals(object, no.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }
}
