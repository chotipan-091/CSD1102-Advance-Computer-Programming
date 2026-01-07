import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {

    
        Student s1 = new Student("65123456", "Chotipan", null, 0);

        Student s2 = new Student();


        Date expireDate = new Date(2026, 0, 31); 

        
        s1.renewMembership(expireDate);

        
        if (s1.checkMembershipStatus()) {
            System.out.println("สมาชิกยังใช้งานได้");
            s1.checkIn();
        } else {
            System.out.println("สมาชิกหมดอายุ");
        }

    }
}

