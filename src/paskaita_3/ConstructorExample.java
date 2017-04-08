package paskaita_3;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * Created by rimvy on 4/6/2017.
 */
public class ConstructorExample {
    //konstruktorius - neturi returno, turi sutapti vardu su klase. gali tureti public private protected matomuma.
    //

    public ConstructorExample(){ // << tuscias konstruktorius
        System.out.println("Tuscias konstruktorius");
    }
    //konstruktoriui perduodama reiksme vienas skaicius
    public ConstructorExample (int id){
        System.out.println("2 konstruktorius su reiksme >>" + id);
    }
}

class MyMainApp{
    public static void main(String[] args) { // OBJEKTAI
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);
    }
}
