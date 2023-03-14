public class ResultCheckerIfElse {
    public static void main(String[] args) {

        // 3. NESTED IF ELSE
        // For every subject passing is 40 and your result is pass if you pass in all
        // the subjects
        int m1 = 100, m2 = 99, m3 = 39;
        int totalM = m1 + m2 + m3;
        if (totalM >= 120) {
            if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
                System.out.println("Congratulations..! You are pass...!");
                if (totalM >= 280) {
                    System.out.println("\nTotal Marks : " + totalM);
                    System.out.println("Distinction..");
                } else if (totalM >= 250) {
                    System.out.println("\nTotal Marks : " + totalM);
                    System.out.println("First Class..");
                } else if (totalM >= 200) {
                    System.out.println("\nTotal Marks : " + totalM);
                    System.out.println("Second Class..");
                } else {
                    System.out.println("\nTotal Marks : " + totalM);
                    System.out.println("Pass Class");
                }
            } else {
                System.out.println("\nTotal Marks : " + totalM);
                System.out.println("Fail...!");
            }
        } else {
            System.out.println("\nTotal Marks : " + totalM);
            System.out.println("Fail...!");
        }

    }
}
