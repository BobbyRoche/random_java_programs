import java.util.*;

public class depth
{
private Stack<Integer> stk;

public depth()
{
stk = new Stack<Integer>();
}

public void dfs(int adjacent[][], int og)
{
int n = adjacent[og].length - 1;

int visited[] = new int[n + 1];      
int x = og;      
int i = og;      
System.out.print(x + "\t");      
visited[og] = 1;      
stk.push(og);

while (!stk.isEmpty())
{
x = stk.peek();
i = x;  
   while (i <= n)
   {
    if (adjacent[x][i] == 1 && visited[i] == 0)
   {
stk.push(i);
visited[i] = 1;
x = i;
i = 1;
System.out.print(x + "\t");
   continue;
}
i++;
   }
stk.pop();  
}  
}

public static void main(String args[])
{
int n, source;
    try
{
   System.out.println("Enter the number of nodes in the graph");
Scanner ss = new Scanner(System.in);
n = ss.nextInt();

   int adj_mat[][] = new int[n + 1][n + 1];
   System.out.println("Enter the adjacency matrix: ");
   for (int i = 1; i <= n; i++)
   for (int j = 1; j <= n; j++)
adj_mat[i][j] = ss.nextInt();

   System.out.println("Enter the source: ");
source = ss.nextInt();

System.out.println("The depth-first Traversal is given by ");
depth d = new depth();
d.dfs(adj_mat, source);                  
}catch(Exception e)
{
System.out.println(e.getMessage());
}  
}  
}

