@FunctionalInterface
interface A{
    void show();
}

class FunctionalInterfaceDemo{
    public static void main(String args[]){
        A a = () -> System.out.println("Overridden Method");
        a.show();
    }
}