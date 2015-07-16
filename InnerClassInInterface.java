// Java 2 J2SE 1.4 에서 실행되었던 코드이나, Java 8 에서는 동작하지 않음.
public interface InnerClassInInterface
{
    public static final int a=1;

    public void callMe();

    static class MyDataType1
    {
        public static void main(String[] args)
        {
            MyDataType1 type1=new MyDataType1();
            System.out.println("MyDataType1 : "+type1);
    //			System.out.println("MyDataType1 : "+type1.a);
        }
    }

    class MyDataType2
    {
        public static void main(String[] args)
        {
            MyDataType2 type2=new MyDataType2();
            System.out.println("MyDataType2 : "+type2);
        }
    }
}
