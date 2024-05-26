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

        public static void main(String [] args){
                System.out.println("MAXBYTE :" + MAXBYTE);
                System.out.println("MAXSHORT :" + MAXSHORT);
                System.out.println("MAXINT :" + MAXINT);
                System.out.println("MAXLONG :" + MAXLONG);
                System.out.println("MINBYTE :" + MINBYTE);
                System.out.println("MINSHORT :" + MINSHORT);
                System.out.println("MININT :" + MININT);
                System.out.println("MINLONG :" + MINLONG);
        }
}