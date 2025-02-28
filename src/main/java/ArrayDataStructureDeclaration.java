import java.util.Arrays;

public class ArrayDataStructureDeclaration {


    public void arrayDeclare(){
        //Byte Array Declaration
        byte[] byteArray = {1,2,3,4,5};
        System.out.println("Byte Array: " + Arrays.toString(byteArray));

        //Short Array Declaration
        short[] shortArray = {1,2,3,4,5};
        System.out.println("Short Array: " + Arrays.toString(shortArray));

        //Int Array Declaration
        int[] intArray = {1,2,3,4,5};
        System.out.println("Int Array: " + Arrays.toString(intArray));
    }

    public void arrayAccessingForLoop()
    {
        int[] arrayNumber ={10,15,20,22,25};

        //Accessing array elements using for loop
        for(int i=0; i< arrayNumber.length; i++)
        {
            System.out.println("Element at indexWise: " + arrayNumber[i]);
        }
    }

    public void arrayAccessingForEachLoop()
    {

        int[] number = {100,121,121,122,143};
        //Accessing Array elements using for each loop
        for(int num: number){
            System.out.println("Element at indexWise: " + num);
        }

        String[] name = {"Satheesh", "Kumar", "Siva", "Kumar"};
        //Accessing Array elements using for each loop
        for(String str: name){
            System.out.println("Element at indexWise: " + str);
        }

    }


    public static void main(String[] args)
    {
        ArrayDataStructureDeclaration arrayDec = new ArrayDataStructureDeclaration();
        //arrayDec.arrayDeclare();
        //arrayDec.arrayAccessingForLoop();
        arrayDec.arrayAccessingForEachLoop();

    }
}
