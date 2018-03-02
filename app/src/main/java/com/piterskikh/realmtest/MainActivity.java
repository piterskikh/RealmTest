package com.piterskikh.realmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.piterskikh.realmtest.db.models.Dog;
import com.piterskikh.realmtest.db.models.Person;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    //Realm realm = App.realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Dog dog = new Dog();
        dog.setName("");
        dog.setAge(1);
        Realm realm = Realm.getDefaultInstance();

        final RealmResults<Dog> puppies = realm.where(Dog.class).lessThan("age", 2).findAll();

        final RealmResults<Person> persons = realm.where(Person.class).findAll();


        if (puppies.size() < 2) {
            realm.beginTransaction();
            final Dog managedDog = realm.copyToRealm(dog);


            Person person = realm.createObject(Person.class);
            person.getDogs().add(managedDog);
            realm.commitTransaction();
        }
    }
}
