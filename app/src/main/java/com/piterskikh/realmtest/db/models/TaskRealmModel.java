package com.piterskikh.realmtest.db.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sergei on 25.02.2018.
 */

@Getter
@Setter
public class TaskRealmModel extends RealmObject {

    @PrimaryKey
    private long id;
    private String title;



}
