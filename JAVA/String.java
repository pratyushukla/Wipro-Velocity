//Code by Pratyush Shukla
public class String {
    public static void main(String args[]){
        String str1 = "Pratyush", str2 = "Shukla";
        System.out.println("String Operations:\nLength of str1: "+str1.length()+"\nConcatenation: "+str1+" "+str2+
        "\nUpperCase: "+str1.toUpperCase()+"\nLowerCase: "+str2.toLowerCase()+"\nIndex of: "+str2.indexOf("a"));
        if(str1.length() >3){
            System.out.println("Big name");
        }
        else{
            System.out.println("Name alright");
        }
    }
}
