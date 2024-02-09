package package1;

public class Parent {
    protected String protectedVar;

    public Parent(String protectedVar) {
        this.protectedVar = protectedVar;
    }

    protected void protectedVar(){
        System.out.println("value="+ protectedVar);

    }
}
