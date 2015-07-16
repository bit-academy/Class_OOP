public class ClassStructure
{
// Instance 초기화부분
//
    int instanceInt1;
    final int instanceInt2;
    {
        instanceInt1=1;
        System.out.println("\nInstance 초기화");
    }

// Class 초기화부분
//
    static int classInt;
    static
    {
        classInt=20;
        System.out.println("Class 초기화");
    }

// 생성자부분
//
    public ClassStructure(int value)
    {
        instanceInt2=value;
        System.out.println("생성자가 받은 인자 : " + value);
    }

// Instance 메소드부분
//
    public void printInstanceInt()
    {
        System.out.println("Instance 변수 : " + instanceInt2);
    }

// Class 메소드부분
//
    public static void printStaticInt()
    {
        System.out.println("Class 변수 : " + classInt);
    }

    public static void main(String[] args)
    {
        ClassStructure.printStaticInt();
        ClassStructure cs1 = new ClassStructure(5);
        cs1.printInstanceInt();
        ClassStructure cs2 = new ClassStructure(10);
        cs2.printInstanceInt();
    }
}
