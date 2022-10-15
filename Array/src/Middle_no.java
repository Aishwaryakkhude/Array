
public class Middle_no {
	
	static final int start = Integer.MAX_VALUE;
    static final int end = Integer.MAX_VALUE;

    public static void doesnotWork() {
        int mid = (start + end) / 2;
        System.out.println(mid);    // output: -1
    }
    public static void worksGreat() {
        int mid = start + ((end + start) / 2);
        System.out.println(mid);    // output: 2147483646
    }

	public static void main(String[] args) {


		doesnotWork();
        worksGreat();
        
        

	}

}
