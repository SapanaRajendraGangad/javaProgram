class A{
    int arr[];
    void setValue(int x[]){
        arr=x;
        arr=new int[5];
    }
    void show(){
        System.out.println(arr.length);
    }
}
class HelloWorld {
    public static void main(String[] args) {
      A a1 = new A();
      a1.setValue(null);
      a1.show();
    }
}
