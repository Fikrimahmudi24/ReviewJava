public class SoalNoTiga {
    public static void main(String[] args) {
        String soal[][] = {{":T2:", "SOAL3/2112/AB00000", "0011 OD:0001234500", "CDE5432100 SOAL003", " ABCDE12345 XAS SK", "ILL TEST ESSAY .DT"},
                {":T2:", "SOAL3/2111/BC00001", "1100 OD:0003452100", "EFG2451300 SOAL003", " EFGHI25134 XAS SK", "ILL TEST ESSAY .DT"},
                {":T2:", "SOAL3/2110/DE21003", "1010 OD:0001524300", "HIJ2145300 SOAL003", " JKLMN52431 XAS SK", "ILL TEST ESSAY .DT"}};

        String tempA = soal[0][1];
        soal[0][1] = soal[0][3];
        soal[0][3] = tempA;
        String tempB = soal[0][2];
        soal[0][2] = soal[0][4];
        soal[0][4] = tempB;
        String tempC = soal[0][3];
        soal[0][3] = soal[0][5];
        soal[0][5] = tempC;
        String tempD = soal[0][5];
        soal[0][5] = soal[0][4];
        soal[0][4] = tempD;

        String tempJ = soal[1][1];
        soal[1][1] = soal[1][3];
        soal[1][3] = tempJ;
        String tempK = soal[1][2];
        soal[1][2] = soal[1][4];
        soal[1][4] = tempK;
        String tempL = soal[1][3];
        soal[1][3] = soal[1][5];
        soal[1][5] = tempL;
        String tempM = soal[1][5];
        soal[1][5] = soal[1][4];
        soal[1][4] = tempM;

        String tempP = soal[2][1];
        soal[2][1] = soal[2][3];
        soal[2][3] = tempP;
        String tempQ = soal[2][2];
        soal[2][2] = soal[2][4];
        soal[2][4] = tempQ;
        String tempR = soal[2][3];
        soal[2][3] = soal[2][5];
        soal[2][5] = tempR;
        String tempS = soal[2][5];
        soal[2][5] = soal[2][4];
        soal[2][4] = tempS;

        for (int i = 0; i < soal.length; i++) {//pemanggilan seluruh data
            for (int j = 0; j < soal[i].length; ++j) {
                System.out.print(soal[i][j]);
            }
            System.out.println();
        }
    }
}
