class Solution {
    
    final static private char one = 'I'; // 1
    final static private char five = 'V'; // 5
    final static private char ten = 'X'; // 10
    final static private char fifty = 'L'; // 50
    final static private char onehundread = 'C'; // 100
    final static private char fivehundread = 'D'; // 500
    final static private char onethousand= 'M'; // 1000
    
    public String intToRoman(int num) {
        String stroke = new String();
        
        while (num >= 1000){
            stroke += onethousand;
            num -= 1000;
        }
        
        while (num >= 900){
            stroke = concate(stroke, onehundread, onethousand);
            num -= 900;
        }
        
        while (num >= 500){
            stroke = concate(stroke,fivehundread);
            num -= 500;
        }
        
        while (num >= 400){
            stroke = concate(stroke, onehundread, fivehundread);
            num -= 400;
        }
        
        while (num >= 100){
            stroke = concate(stroke, onehundread);
            num -= 100;
        }
        
        while(num >= 90){
            stroke = concate(stroke, ten, onehundread);
            num -= 90;
        }
        
        while(num >= 50){
            stroke = concate(stroke, fifty);
            num -= 50;
        }
        
        while (num >= 40){
            stroke = concate(stroke, ten, fifty);
            num -= 40;
        }
        
        while(num >= 10){
            stroke = concate(stroke,ten);
            num -= 10;
        }
        
        while (num >= 9){
            stroke = concate(stroke, one, ten);
            num -= 9;
        }
        
        while (num >= 5){
            stroke = concate(stroke,five);
            num -= 5;
        }
        
        while (num >= 4){
            stroke = concate(stroke, one, five);
            num -= 4;
        }
        
        while (num >= 1){
            stroke = concate(stroke, one);
            num -= 1;
        }
        
        return stroke;
    }
    
    
    public String concate(String s, char first){
        return s += first;
    }
    
    public String concate(String s, char first, char second){
        s += first;
        s += second;
        return s;
    }
    
    
}