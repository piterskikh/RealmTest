package com.piterskikh.realmtest.db.migration;

import io.realm.DynamicRealm;
import io.realm.RealmSchema;

/**
 * Created by Sergei on 25.02.2018.
 */

public class RealmMigration implements io.realm.RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {

        RealmSchema schema = realm.getSchema();

        if(oldVersion == 0){

            schema.create("TaskRealmModel")
                    .addField("title", String.class);
            oldVersion++;


        }
    }
}
