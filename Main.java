import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        headPhysician headPhysician = new headPhysician("","",0000,"","",5);
        Cardiology cardiology = new Cardiology("","","",3);
        Norology norology = new Norology("","",6542376,"");


        Scanner input = new Scanner(System.in);
        String command = """ 
                Welcome
                processes:
                Head Physician--> 1
                Cardiology-->2
                Norology-->3
                exit-->0
                """;

        while (true){
            System.out.println(command);
            System.out.println("choose your action: ");
            String choice = input.nextLine();
            System.out.println(" ");

            while(true){
                if (choice.equals("1")){
                    System.out.println("Head physician" + "Head physician information's");
                    headPhysician.nameBadge();
                    System.out.println("finished head physician work");
                    break;
                } else if (choice.equals("2")) {
                    System.out.println("Cardiology" + "cardiologist info's");
                    cardiology.nameBadge();
                    String s = "heart attack" + "EKG";
                    System.out.println(s);
                    String choice2 = input.nextLine();
                    if (choice2.equals("1")){
                        cardiology.riskCalculate();
                        break;
                    }else {
                        System.out.println("error");
                    }
                } else if (choice.equals("3")) {
                    System.out.println("Norology" + "neurologist info's");
                    norology.nameBadge();
                    String s = "headache for 1" + "sleeping disorder for 2";
                    System.out.println(s);
                    String choice3 = input.nextLine();
                    if (choice3.equals("1")){
                        norology.headache();
                        break;
                    } else if (choice3.equals("2")) {
                        norology.sleepingDisorder();
                        break;
                    }else {
                        System.out.println("error");
                        break;
                    }
                }
            }
        }
    }
}