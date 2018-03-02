package com.piterskikh.realmtest.db.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends RealmObject {
    @Index
    private long id;
    private String name;
    private RealmList<Dog> dogs;
}
