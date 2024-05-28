package JavaNumeric;
public class NumericTypes{

    
        public static final byte MAXBYTE =  (byte) ((Math.pow(2,8*1)/2) -1);
        public static final short MAXSHORT =(short)((Math.pow(2,8*2)/2) -1);
        public static final int MAXINT = (int)((Math.pow(2, 8*4)/2) -1);
        public static final long MAXLONG = (long)((Math.pow(2,8*8)/2) -1);

        public static final byte MINBYTE = (byte)(-(MAXBYTE +1));
        public static final short MINSHORT =(short)(-(MAXSHORT +1));
        public static final int MININT = (int)(-(MAXINT +1));
        public static final long MINLONG = (long)(-(MAXLONG +1));
        
        public static short implicitCastingBytToShort(byte b){
            if(b > MAXBYTE || b < MINBYTE)
                throw new IllegalArgumentException("enter a number between " + MINBYTE + "and " + MAXBYTE);
            else
                return b;
        }
        
        public static int implicitCastingShortToInt(short s){
            if(s > MAXSHORT || s < MINSHORT)
                throw new IllegalArgumentException("enter a number between " + MINSHORT + "and " + MAXSHORT);
            else
                return s;
        }
        
        public static  long implicitCastingIntToLong(int i){
            if(i > MAXINT || i < MININT)
                throw new IllegalArgumentException("enter a number between " + MININT + "and " + MAXINT);
            else
                return i;
        }


}        
