class VariableScope1 {
    public static void main(String[] args) {
        int x = 1;  //Local Variable
        System.out.println(x);
        DoSomething();
    }
    static void DoSomething(){
        int x = 2;  //Local Variable
        System.out.println(x);
    }
}
