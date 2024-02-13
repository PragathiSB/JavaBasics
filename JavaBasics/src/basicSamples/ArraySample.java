package basicSamples;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String strNames[]= {"pinky","wicky","john"};
        int[] age= {12,4,5,2,5};
        
        System.out.println("accessing elements of array:");
        System.out.println("first element:"+age[0]);
        System.out.println("second element:"+age[1]);
        System.out.println("third element:"+age[2]);
        System.out.println("four element:"+age[3]);
        System.out.println("fifth element:"+age[4]);
        
        System.out.println("using for lop");
        for(int i=0;i<age.length;i++)
        {
        	 System.out.println(age[i]);
        }
        
        System.out.println("using for-each loop:");
        for(int a:age)
        {
        	 System.out.println(a);
        }
        
        int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
        int sum=0;
        Double average;
        
        for(int number:numbers)
        {
        	sum+=number;
        }
        
        int arrayLength=numbers.length;
        
        average=((double)sum/(double)arrayLength);
        
        System.out.println("sum="+sum);
        System.out.println("average="+average);
        
        int[][] a= {{1,2,3},{4,5,6},{7,8,9,2}};
        System.out.println("length of row 1:"+a[0].length);
        System.out.println("length of row 2:"+a[1].length);
        System.out.println("length of row 3:"+a[2].length);
        
        
        
	}

}
