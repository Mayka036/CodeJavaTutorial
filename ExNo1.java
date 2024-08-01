public class ExNo1 {
        public static void main(String[] args) {
            // กำหนดช่วงของตัวเลขที่ต้องการแสดง
            int start = 1;
            int end = 100;
    
            System.out.println("Even numbers " + start + " To " + end + ":");
            
            for (int i = start; i <= end; i++) {
                // ตรวจสอบว่าเลข i เป็นเลขคู่หรือไม่
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    
