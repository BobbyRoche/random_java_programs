/*1.)g(n) = 1+(1/g(n-1))

2.) recursion would stop when n = 0.

3. public static double goldenMean(int n){
if(n==0)
return 1;
else
return 1 + (1/goldenMean(n-1));

4.  1.6179775280898876

5. public static double goldenMean(int n){
System.out.println("Entering goldenMean: n = " + n);
if(n==0)
return 1;
else
return 1 + (1/goldenMean(n-1));
    
}
*/