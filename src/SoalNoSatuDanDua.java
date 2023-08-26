public class SoalNoSatuDanDua {
    public static void main(String[] args) {
        System.out.println("Soal No. 1: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("BIZZ");
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.println(" ");
        System.out.println("Soal No. 2: ");
        int num = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= num; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            num--;
            System.out.println();
        }
    }
}

