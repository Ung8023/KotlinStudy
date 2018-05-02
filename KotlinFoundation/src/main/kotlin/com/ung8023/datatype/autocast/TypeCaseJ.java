package com.ung8023.datatype.autocast;

public class TypeCaseJ {
    public static void main(String[] args) {
        ParentJ parent = new ChildJ();
        System.out.println(((ChildJ)parent).getName());

        if (parent instanceof  ChildJ) {
            System.out.println(((ChildJ)parent).getName());
        }
    }
}
