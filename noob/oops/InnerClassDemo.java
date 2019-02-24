class Outer{
    void print(){
        System.out.println("Inside outer class!");
    }

    class Inner{
        void print(){
            System.out.println("Inside inner class!");
        }
    }
}

class InnerClassDemo{
    public static void main(String args[]){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
    }
}