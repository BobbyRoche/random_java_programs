
package bst;

public class Module9_Roche_Assignment1 {
public static void main(String args[])
{

char[] tree={'A','B','D','\0','E','F','\0','\0','\0','G','H','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
NLRScan(tree,0);
}

static void NLRScan(char[] tree,int root)
{
System.out.print(tree[root]+",");
if(tree[(2*root)+1]!='\0')
NLRScan(tree,(2*root)+1);
if(tree[(2*root)+2]!='\0')
NLRScan(tree,(2*root)+2);
}
}