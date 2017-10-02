public class inputText2 {
    public static void main(String[] args){
        //   顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What't your name?");
        String Name = sc.nextLine();
        System.out.println("How old are you?");
        Double Age = sc.nextDouble();
        System.out.println("You're" + Age +"years old.");

        System.out.println();

    }
}


