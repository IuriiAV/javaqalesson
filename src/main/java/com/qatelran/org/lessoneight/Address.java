package com.qatelran.org.lessoneight;

import java.util.Objects;

public class Address {

    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return address.equals(address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        //1
//        if (this == obj) {
//            return true;
//        }
//        //2
//        if(obj == null) {
//            return false;
//        }
//        //3
//        if(!(obj instanceof Address)){
//            return false;
//        }
//        //4
//        Address address = (Address) obj;
//
//        return (this.address.equals(address.address));
//    }
}
