
// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int y=0;
        Set<Integer> s=new HashSet<>();
        for(int i : arr)    {
             if(s.contains(i))  {
                y=i;
            }
            s.add(i);
        }
        int j=1;
        int x=0;
        while(j<=arr.length){
            if(!s.contains(j))  {
                x=j;
                break;
            }
            j++;
        }
        return new int[]{y,x};
    }
}
