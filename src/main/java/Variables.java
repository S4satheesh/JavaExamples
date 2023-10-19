public class Variables {

    int age = 28;
    String name ="Radha";
    public void add()
    {
        System.out.println("Emp name is.." + name);
        //System.out.println("Emp page is.."+ age);
        String name = "Pandu";
        System.out.println("New Emp name is.."+ name);
    }
    public static void main (String[] array)
    {
        Variables va = new Variables();
        //System.out.println(va.name);
        //System.out.println(va.age);
        va.add();
    }
}
