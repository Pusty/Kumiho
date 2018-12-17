package pusty.f0xC.rt.lang;

import pusty.f0xC.lang.OverrideHandler.OverrideTranslation;

@OverrideTranslation(override = "java/lang/Math")
public class OMath {
    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static long min(long a, long b) {
        return (a <= b) ? a : b;
    }
    
    public static double ceil(double a) {
        if(a > 0) {
        	return (double)((long)a+1);
        }else {
        	return (double)((long)a-1);
        }
    }
    
    /*
    public static float min(float a, float b) {
        if (a != a) return a;   // a is NaN
        if ((a == 0.0f) && (b == 0.0f)
            && (Float.floatToIntBits(b) == negativeZeroFloatBits)) {
            return b;
        }
        return (a <= b) ? a : b;
    }
    public static double min(double a, double b) {
        if (a != a) return a;   // a is NaN
        if ((a == 0.0d) && (b == 0.0d)
            && (Double.doubleToLongBits(b) == negativeZeroDoubleBits)) {
            return b;
        }
        return (a <= b) ? a : b;
    }
     */
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
    public static long max(long a, long b) {
        return (a >= b) ? a : b;
    }
    
    /*
        public static float max(float a, float b) {
        if (a != a) return a;   // a is NaN
        if ((a == 0.0f) && (b == 0.0f)
            && (Float.floatToIntBits(a) == negativeZeroFloatBits)) {
            return b;
        }
        return (a >= b) ? a : b;
    } 
    
        public static double max(double a, double b) {
        if (a != a) return a;   // a is NaN
        if ((a == 0.0d) && (b == 0.0d)
            && (Double.doubleToLongBits(a) == negativeZeroDoubleBits)) {
            return b;
        }
        return (a >= b) ? a : b;
    }
     
     */
}
