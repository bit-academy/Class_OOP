public abstract class AbstractClass
{
    public abstract void manageRam();

    public void mainBoard()
    {
        System.out.println("���κ���");
    }

    public static void main(String[] args)
    {
    //      AbstractClass ac = new AbstractClass();

        AbstractClass ac1 = new Rambus();
        ac1.manageRam();

        AbstractClass ac2 = new DDRRam();
        ac2.manageRam();
    }
}

class Rambus extends AbstractClass
{
    public void manageRam()
    {
        System.out.println("������ D��");
    }
}

class DDRRam extends AbstractClass
{
    public void manageRam()
    {
        System.out.println("DDR ��");
    }
}
