package com.example.guangda.myrxprogram;

import java.io.File;

/**
 * Created by guangda on 2018/1/2.
 *
 * Cohesion is a qualitative measure, meaning that the source code to be measured
 * is examined using a rubric to determine a classification.
 *
 * While functional cohesion is considered the most desirable type of cohesion for a software module,
 * it may not be achievable. There are cases where communicational cohesion is the highest level
 * of cohesion that can be attained under the circumstances.[citation needed]
 */

public class Cohesion {

    /*Coincidental cohesion:  parts of a module are grouped arbitrarily
    *(e.g. a “Utilities” class).
    * */
    class ModulaA{
    /*
    Implementation of r(x) = 5x + 3
    There is no particular reason to group functions in this way,
    so the module is said to have Coincidental Cohesion.
    */
//        r(x) = a(x) + b(x)
//        a(x) = 2x + 1
//        b(x) = 3x + 2
    }


    /**
     * Logical cohesion
     *
     *Logical cohesion is when parts of a module are grouped because they are logically categorized
     * to do the same thing even though they are different by nature
     *
     * (e.g. grouping all mouse and keyboard input handling routines)
     */


    /**
     * Temporal cohesion
     *
     * the parts are processed at a particular time in program execution
     *
     * (e.g. a function which is  called after catching an exception which closes open files,
     * creates an error log, and notifies the user)
     */
    private void temporalCohesion(){
        try{
            //excute();

        }catch (Exception e){
            e.printStackTrace();
            //do catch block
        }
    }


    /**
     * Procedural cohesion
     *
     * parts of a module are grouped because they always follow a certain sequence of execution
     *
     * (e.g. a function which checks file permissions and then opens the file)
     */
    private void proceduralCohesion(){
        File file = new File("test.java");
        file.exists();
    }


    /** it is better solution of enough
     * Communicational/informational cohesion
     *
     * parts of a module are grouped because they operate on the same data
     *
     * (e.g. a module which operates on the same record of information)
     *
     */

    class User {
        int userId;
        String name;
        int age;
        boolean male;
    }

    private void saveUserToDB(User user){
        //do save action
    }

    private User getUserFromDB(int userId){
        // get from db
        return new User();
    }

    /**
     * Sequential cohesion
     *
     *  when parts of a module are grouped because the output from one part is the input to
     *  another part like an assembly line
     *
     *  (e.g. a function which reads data from a file and processes the data).
     */

    private void printUserFromDB(){
        saveUserToDB(new User());
        User user = getUserFromDB(100);

    }

    /**
     * Functional cohesion == 单一职责
     *
     *  when parts of a module are grouped because they all contribute to a single well-defined task of the module
     *
     *  (e.g. Lexical analysis of an XML string)
     */

    class A{
        int add(int a, int b){
            return  a + b;
        }

        int minus(int a, int b){
            return a - b;
        }
    }

    class B{

        int doTest(int a, int b){
            A aa = new A();
            int val =  aa.add(a, b);
            val += aa.minus(a,b);
            return val;
        }
    }

    /**
     * Perfect cohesion   (atomic)
     */

    class ModulA {
          /*
          Implementation of r(x) = 2x + 1 + 3x + 2
          It′s said to have perfect because it cannot be reduced any more than that.
          */

          //r(x) = 5x + 3
        }
}
