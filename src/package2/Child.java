package package2;

import package1.Parent;

public class Child extends Parent {


    public Child(String protectedVar){
        super(protectedVar);
    }
    public void displayVariables(){
        System.out.println("values");
        protectedVar();
        System.out.println(protectedVar);

    }

}
