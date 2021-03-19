package lets.code;

public class _06_ZigZagConversion {

	public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int i = 0;
        boolean incr = true;
        for (char c: s.toCharArray()) {
            rows[i].append(c);
            
            if(incr) {
                i++;
            } else {
                i--;
            }
            
            if(i == numRows-1) {
                incr = false;
            } else if (i == 0) {
                incr = true;
            }
        }
        
        StringBuilder resp = new StringBuilder();
        for(i=0; i<numRows; i++) {
            resp.append(rows[i].toString());
        }
        return resp.toString();
    }
	
	public static void main(String[] args) {
		_06_ZigZagConversion t = new _06_ZigZagConversion();
		
		System.out.println(t.convert("PAYPALISHIRING", 3));
		
		System.out.println(t.convert("PAYPALISHIRING", 4));
		
		System.out.println(t.convert("A", 1));
	}
}
