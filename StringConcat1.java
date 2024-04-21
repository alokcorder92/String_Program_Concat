public class StringConcat1{
    public static void main(String[] ar){
        String str="Hello";
        System.out.println("Before concatenation="+str);
        str=str.concat("World");
        System.out.println("After concatenation="+str);

        String str1=str.substring(0,5);
        System.out.println("Substring::"+str.substring(0,5));
    }
}