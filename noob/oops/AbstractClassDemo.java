abstract class Mammal{
    public abstract void numLegs();
    public abstract void numHands();
    public abstract void numTails();
}

class Cow extends Mammal{
    @Override
    public void numLegs(){
        System.out.println("Cow has 4 legs");
    }

    @Override
    public void numHands(){
        System.out.println("Cow has no hands");
    }

    @Override
    public void numTails(){
        System.out.println("Cow has 1 tail");
    }
}

class AbstractClassDemo{
    public static void main(String args[]){
        Mammal cow  = new Cow();
        cow.numLegs();
    }
}