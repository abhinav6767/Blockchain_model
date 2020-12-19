
package com.company;


import java.lang.reflect.Array;
import java.lang.String;
public class Main {



    public static void main(String[] args) {
        java.lang.String[] transaction={"abhinav will pau  btc to ram","ram will pay 60btc to sham"};
        block genesis_block=new block(0,transaction);
        System.out.println(genesis_block.getCurrhascode());
        java.lang.String[] t1  ={"ram will receve 30 eth"};
        block b1=new block(genesis_block.getCurrhascode(),t1);
        System.out.println(b1.getCurrhascode());
        java.lang.String[] t2={"sham recieve 45.654433eth"};
        block b2=new block(b1.getCurrhascode(),t2);
        System.out.println(b2.getCurrhascode());

    }

}


