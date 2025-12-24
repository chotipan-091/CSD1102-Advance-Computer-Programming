public class UniversityGymSystem {
    public static void main(String[] args) throws Exception {
        
        Student g1 = new Student(); //Object ของ Class Student ทำหน้าที่เก็บข้อมูลของนักศึกษาในระบบ
        Trainer s1 = new Trainer(); //Object ของ Class Trainer ทำหน้าที่เก็บข้อมูลของเทรนเนอร์ในระบบ
        Membership m1 = new Membership(); //Object ของ Class Membership สำหรับ ฟังค์ชั่นระบบสมาชิก
        FitnessClass f1 = new FitnessClass();//Object ของ Fitnessclass สำหรับการเก็บข้อมูลวันเวลาและปฏิทินการใช้งาน
        Reservation r1 = new Reservation();//Object ของ Class Reservation สำหรับฟังค์ชั่นการจองใช้งานฟิตเนส
        Equipment e1 = new Equipment();    //Object ของ Class Equipment สำหรับฟังค์ชั่นการยืมอุปกรณ์และการคืนอุปกรณ์

        g1.sutudentId=1;
        g1.name="Edward Kenway";
        s1.trainerId=112;
        m1.startDate="Monday";
        f1.classId="B02";
        r1.reserveId=11011;
        e1.equipId=99;

        System.out.println("Student ID = "+g1.sutudentId);
        System.out.println("Name : "+g1.name);
        System.out.println("Trainer ID = "+s1.trainerId);
        System.out.println("schedule : "+m1.startDate);
        System.out.println("Class ID = "+f1.classId);
        System.out.println("Reserve ID = "+r1.reserveId);
        System.out.println("Equipment ID = "+e1.equipId);

    }
}
