package JavaNumeric;
public class NumericTypes{

        
        private static final double BYTE_BOUND = Math.pow(2,8*1)/2;
        private static final double SHORT_BOUND = Math.pow(2,8*2)/2;
        private static final double INT_BOUND = Math.pow(2, 8*4)/2;
        private static final double LONG_BOUND = Math.pow(2,8*8)/2;
        
    
        public static final byte MAXBYTE =  (byte)(BYTE_BOUND -1);
        public static final short MAXSHORT =(short)(SHORT_BOUND -1);
        public static final int MAXINT = (int)(INT_BOUND -1);
        public static final long MAXLONG = (long)(LONG_BOUND -1);

        public static final byte MINBYTE = (byte)(-BYTE_BOUND);
        public static final short MINSHORT =(short)(-SHORT_BOUND);
        public static final int MININT = (int)(-INT_BOUND);
        public static final long MINLONG = (long)(-LONG_BOUND);
        
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
