// 12S24005 - MICHAEL PRATAMA NASUTION
// 12S24045 - MUTIARA YH SIANTURI

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, formatBuku;
        int tahunTerbit, stokBuku;
        double hargaPembelian, minMargin, rating;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minMargin = Double.parseDouble(input.nextLine());
        stokBuku = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tahunTerbit + "|" + pENERBIT + "|" + formatBuku + "|" + hargaPembelian + "|" + minMargin + "|" + stokBuku + "|" + rating);
    }
}
