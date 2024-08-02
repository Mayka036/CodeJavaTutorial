public class Ex52 {
    public static void main(String[] args) {
        // วนลูปจาก 1 ถึง 10
        for (int x = 1; x <= 10; x++) {
            // คำนวณค่า x ยกกำลัง 3
            int cube = x * x * x;
            // แสดงผลลัพธ์
            System.out.println("The cube of " + x + " is: " + cube);
        }
    }
}