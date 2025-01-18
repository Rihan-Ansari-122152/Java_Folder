package Java_Folder;

interface A {
    public static void myfun();
}

public class first implements A{

    @Override
    public static void myfun() {
        System.out.println("everythin is alright now!");

    }

    public static void main(String[] args) {
        
        myfun();
        


    }
}