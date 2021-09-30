package daytwo;

public class DayTwo {
    public static long getTotalPoints(long level, long points, long BONUS)
    {
        long totalPoints;
        if((level >= 1) && (level <=5)){
            totalPoints = points + level * BONUS;
            System.out.println("Total points = " + totalPoints);
            return totalPoints;
        }else{
            System.out.println("Invalid level!");
        }
        return 0;
    }
    
    public static long getTotalPoints(long level, long points){
        final long BONUS = 20; 
        return getTotalPoints(level, points, BONUS);
    }
         
    public static long getTotalPoints(long points) {
        final long BONUS = 20;
        return getTotalPoints(3, points, BONUS);
    }
    
    public static void getTotalPoints1(long level, long points,long BONUS) {
        if (level >= 1 && level <= 5) {
            double totalPoints = points + Math.sqrt(level) * BONUS;
            System.out.println("Total points: " + totalPoints);
        } else {
            System.out.println("Invalid Level");
        }
    }

    public static long Factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
    
    public static void main(String[] args) {
        long level;
        long points;
        long totalPoints;
        final long BONUS = 20;
        
        level = 3;
        points = 300;
        totalPoints = getTotalPoints(level ,points, 20);
        System.out.println("Total points: " + totalPoints);
        totalPoints = getTotalPoints(level, points);
        System.out.println("Total points: " + totalPoints);
        totalPoints = getTotalPoints(points);
        System.out.println("Total points: " + totalPoints);
        
        for (int i = 100; i <= 400; i += 50) {
            totalPoints = getTotalPoints(i);
            System.out.println("Total points: " + totalPoints);
        }

        long[] p = { 100, 120, 200, 250, 500 };
        for (int i = 0; i < p.length; i++) {
            totalPoints = getTotalPoints(p[i]);
            System.out.println("Total points: " + totalPoints);
        }

        Person sv1 = new Person();
        sv1.setName("Phung Phuc Hau");
        sv1.setAge(19);
        sv1.setGender('N');
        sv1.setEmailAddress("phungphuchau_t65@hus.edu.vn");
        System.out.println("Name: " + sv1.getName());
        System.out.println("Age: " + sv1.getAge());
        System.out.println("Gendee: " + sv1.getGender()); 
        System.out.println("EmailAddress: " + sv1.getEmailAddress());

        Person sv2 = new Person("Phung Phuc Hau", 19, 'N', "Email");
        System.out.println("Name: " + sv2.getName());
        System.out.println("Age: " + sv2.getAge());
        System.out.println("Gender: " + sv2.getGender());
        System.out.println("Email: " + sv2.getEmailAddress());

        System.out.println("5! = " + Factorial(5));
 
    }
    
}

