public class ExNo2 {
        public static void main(String[] args) {
            int limit = 100;
    
            System.out.println("numbers not exceeding " + limit + " and is divisible by 3 and 5.:");
    
            for (int i = 1; i <= limit; i++) {
                // ตรวจสอบว่าเลข i สามารถหารด้วย 3 และ 5 ลงตัวได้หรือไม่
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    

