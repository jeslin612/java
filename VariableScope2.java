class VariableScope2 {
    static int x = 3;   //Class Variable
    public static void main(String[] args) {
        int x = 1;   //Local Variable
        System.out.println(x); 
        DoSomething();
        DooSomething();
    }
    static void DoSomething(){
        int x = 2;   //Local Variable
        System.out.println(x);
    }
    static void DooSomething(){
        System.out.println(x);
    }
    
}
