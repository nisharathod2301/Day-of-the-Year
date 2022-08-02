class Solution {
    public int dayOfYear(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] s = date.split("-");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        if (m > 2 && y % 4 == 0 && (y % 100 != 0|| y % 400 == 0)) ++d; 
        while (--m > 0) d += days[m - 1];
        return d;
    } 

}
