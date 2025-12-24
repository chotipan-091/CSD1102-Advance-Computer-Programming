public class UniversityGymSystem {
    public static void main(String[] args) throws Exception {
        
        Student student1 = new Student(); //Object ของ Class Student ทำหน้าที่เก็บข้อมูลของนักศึกษาในระบบ
        Trainer trainer1 = new Trainer(); //Object ของ Class Trainer ทำหน้าที่เก็บข้อมูลของเทรนเนอร์ในระบบ
        Membership member1 = new Membership(); //Object ของ Class Membership สำหรับ ฟังค์ชั่นระบบสมาชิก
        FitnessClass fitness1 = new FitnessClass();//Object ของ Fitnessclass สำหรับการเก็บข้อมูลวันเวลาและปฏิทินการใช้งาน
        Reservation reserve1 = new Reservation();//Object ของ Class Reservation สำหรับฟังค์ชั่นการจองใช้งานฟิตเนส
        Equipment equip1 = new Equipment();    //Object ของ Class Equipment สำหรับฟังค์ชั่นการยืมอุปกรณ์และการคืนอุปกรณ์

        student1.sutudentId=1;
        student1.name="Edward Kenway";
        trainer1.trainerId=112;
        member1.startDate="Monday";
        fitness1.classId="B02";
        reserve1.reserveId=11011;
        equip1.equipId=99;

        System.out.println("Student ID = "+student1.sutudentId);
        System.out.println("Name : "+student1.name);
        System.out.println("Trainer ID = "+trainer1.trainerId);
        System.out.println("schedule : "+member1.startDate);
        System.out.println("Class ID = "+fitness1.classId);
        System.out.println("Reserve ID = "+reserve1.reserveId);
        System.out.println("Equipment ID = "+equip1.equipId);

    }
}
