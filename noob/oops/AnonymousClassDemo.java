class A{
    public void print(){
        System.out.println("Original print function.");
    }
}

class AnonymousClassDemo{
    public static void main(String args[]){
        A a = new A(){
            @Override
            public void print(){
                System.out.println("Overridden print function");
            }
        };

        a.print();
    }
}