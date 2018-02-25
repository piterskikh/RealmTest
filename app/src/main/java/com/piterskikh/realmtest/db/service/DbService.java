package com.piterskikh.realmtest.db.service;

import com.piterskikh.realmtest.db.migration.RealmMigration;
import com.piterskikh.realmtest.db.models.TaskRealmModel;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;

/**
 * Created by Sergei on 25.02.2018.
 */

public class DbService {

    private RealmConfiguration mConfig = new RealmConfiguration.Builder()
            .schemaVersion(1)
            .migration(new RealmMigration())
            .build();


    public <T extends RealmObject>  Observable<T> save (T object, Class<T> calzz){

        Realm realm = Realm.getInstance(mConfig);

        long id;

        id = realm.where(calzz).max("id").longValue()+1;

        ((TaskRealmModel) object).setId(id);

        Consumer<Disposable> consumer = new Consumer<Disposable>() {
            @Override
            public void accept(Disposable integer) throws Exception {

            }
        };


       return Observable.just(object)
               .flatMap(t->Observable.just(t))
               .doOnSubscribe(consumer);


    }



    void testo(){


    }
}
