class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
        {
            rows.add(new StringBuilder());
        }

        int row = 0;
        boolean direction = true;

        for (char c : s.toCharArray()) {
            rows.get(row).append(c);
            if (row == 0) direction = true;
            if(row==numRows-1) direction=false;
            row += direction ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder crow : rows) ret.append(crow);
        return ret.toString();
    }
}