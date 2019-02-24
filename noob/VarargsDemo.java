class VarargsDemo{
    public static int add(int ... array){
        int sum = 0;
        for(int val : array){
            sum += val;
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println("Sum = " + add(1, 2, 3, 4, 5));
    }
}