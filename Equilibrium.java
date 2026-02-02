/*Given an array element count the no.of equlibrium index(sum of left =sum of right )*/
/*Algorithm:
 * 	1. create prefix sum(pf[]) of the user inputted array(a[i]).
 * 	2. take index pf[0]=arr[0].
 * 		rest elements=a[i]+pf[i-1].
 * 	3. create another array leftsum[] elements would be:
 * 		leftsum[0]=0 and rest elements=pf[i-1].
 * 	4. create another array rightsum[] elements would be :
 * 		elements=pf[n-1]-pf[i].
 */
class equilibrium{
    public static void main(String[] args) {
        int [] a={1,3,5,2,2};
        int pf[]=new int[a.length];
        pf[0]=a[0];
        for(int i=1;i<a.length;i++){
            pf[i]=pf[i-1]+a[i];
        }
        int leftsum=0;
        int rightsum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            leftsum=pf[i]-a[i];
            rightsum=pf[a.length-1]-pf[i];
        }
        if(leftsum==rightsum){
            count++;
            }
        System.out.println(count);

    }
    
}


