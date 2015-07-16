public class ClassStructure
{
// Instance �ʱ�ȭ�κ�
//
    int instanceInt1;
    final int instanceInt2;
    {
        instanceInt1=1;
        System.out.println("\nInstance �ʱ�ȭ");
    }

// Class �ʱ�ȭ�κ�
//
    static int classInt;
    static
    {
        classInt=20;
        System.out.println("Class �ʱ�ȭ");
    }

// �����ںκ�
//
    public ClassStructure(int value)
    {
        instanceInt2=value;
        System.out.println("�����ڰ� ���� ���� : " + value);
    }

// Instance �޼ҵ�κ�
//
    public void printInstanceInt()
    {
        System.out.println("Instance ���� : " + instanceInt2);
    }

// Class �޼ҵ�κ�
//
    public static void printStaticInt()
    {
        System.out.println("Class ���� : " + classInt);
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
