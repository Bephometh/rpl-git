
/**
 * Write a description of class Kalkulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kalkulator
{
    public Kalkulator(){
        
    }
    
    public float plus(float a,float b){
        float res = a + b;
		return res;
    }
    
    public float minus(float a,float b){
        float res = a - b;
		return res;
    }
    
    public float multiply(float a,float b){
        
	return a*b;	
    }
    
    public float division(float a,float b){
        
	return a/b;
    }
	

	public float max (float a, float b){
		if( a < b){
			return b;
		}
		else {
			return a;
		}	
	}

    public float min(float a,float b){
	if(a<b)return a;
	else return b;
    }
=======
}
