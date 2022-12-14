package variableHidding;

public class MainHidding {
    public static void main(String[] args) {
        System.out.println("Parent ....");
        Parent parent = new Parent();
        parent.name = "Saefudin";
        parent.toDoIt();
        System.out.println("Parent Name "+parent.name);

        System.out.println("\nChild ...");
        Child child = new Child();
        child.name = "Apud";
        child.toDoIt();
        System.out.println("Child Name "+ child.name);

        System.out.println("\nChild Cast ...");
        Parent parent2 = new Parent();
        parent2.toDoIt();
        System.out.println("Parent2 Name "+ parent2.name);
    }
}
