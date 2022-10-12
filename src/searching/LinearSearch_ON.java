/**
 * 
 */
package searching;

/**
 * @author Sai Krishna
 *
 */
public class LinearSearch_ON {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {12,2,3,1,56,45,38,12,43,15,90,45};
		int key = 38;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == key) {
				System.out.println(key+" key index is :"+i);
			}
		}
	}
}
