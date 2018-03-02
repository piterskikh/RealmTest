package com.piterskikh.realmtest.db.models;

import java.util.ArrayList;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.var;
import lombok.val;

@Getter
@Setter
public class Dog extends RealmObject {
    private String name ;
    private int age;

    public void lo(){

        var example = new ArrayList<String>();
    }

}
