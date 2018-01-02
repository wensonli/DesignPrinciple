package com.example.guangda.myrxprogram;

/**
 * Created by guangda on 2018/1/2.
 *
 * Coupling
 *
 * message coupling : message should design short but maximize the meaning
 *
 * how to reduce coupling: functional design
 * increase coupling betweean class A and B if:
 *  class A{
 *      public int doA(){}
 *  }
 *
 *  class B{
 *      A a;  // increase 1
 *
 *      public void couple1(){
 *          a.doA(); //increase 2
 *      }
 *
 *      public void couple2(){
 *          int val = a.doA();
 *
 *      }
 *  }
 *
 *  class Couple3 extends B{
 *
 *  }
 *
 *  low coupling good design is :
 *  Information hiding
 *  one module interacts with another module through a simple and stable interface
 *  and does not need to be concerned with the other module's internal implementation
 *  interface Protocol{
 *      doA();
 *      doB();
 *  }
 *
 *  class ProtocolImpl implement Protocol{
 *      public void doA(){
 *
 *      }
 *
 *      public void doB(){
 *
 *      }
 *
 *  }
 *
 *  private void informationHiding(){
 *      Protocol protocol = new ProtocolImpl();
 *      protocol.doA();
 *      protocol.doB();
 *  }
 *
 */

public class Coupling {

    //Content coupling
/*    void modulaA(){
        static int value;
    }

    void modulaB(){
        value = 100;
    }*/

   /* common coupling
   * when two modules share the same global data
   * */
    private int globalVarialbe = 100;
    public  void modulaA(){
        globalVarialbe = 200;
    }

    public void modulaB(){
        globalVarialbe = 300;
    }


/*    external coupling
*   when two modules share an externally imposed data format, communication protocol, or device interface.
*   This is basically related to the communication to external tools and devices
* */
    interface protocol {
        void doA();
        void doB();
}

    private class ProtocolImpl implements protocol{
        @Override
        public void doA() {

        }

        @Override
        public void doB() {

        }
    }

    public void externalCouplingModulaA(){
        ProtocolImpl protocol = new ProtocolImpl();
        protocol.doA();
    }

    public void externalCouplingModulaB(){
        ProtocolImpl protocol = new ProtocolImpl();
        protocol.doB();
    }

    /*Control coupling
    * one module controlling the flow of another, by passing it information on what to do
    * (e.g., passing a what-to-do flag).
    * */
    public void controlCouplingModulaA(boolean needPrint){
        if(needPrint){

        }else{

        }
    }

    public void controlCouplingModulaB(){
        controlCouplingModulaA(true);
        controlCouplingModulaA(false);
    }

    /*Stamp coupling
    *   ccurs when modules share a composite data structure and use only parts of it
    *   alse is 迪米特原则
    * */
    private class User{
        String name;
        int age;
        boolean male;
    }

    private void stampCouplingPrintUserName(User user){
        System.out.println(user.name);
    }


    /*
    * Data coupling
    * when modules share data through, for example, parameters
    * */
    private int calculteSquare(int val){
        return val * val;
    }

    private void dataCoupling(){
        calculteSquare(100);
    }


    /**
     * Message coupling
     * component communication is done via parameters or message passing
     */
    // regist message onMessageCoupling
     private void messageCouplingA(){

     }

     //send message
     private void messageCouplingB(){
        //send message
     }


    /***
     *     No coupling
        Modules do not communicate at all with one another.
       正交化
     */
}
