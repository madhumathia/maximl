 import java.util.*;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LongestSubstring(str);

    }
public static void LongestSubstring(String s)
{
	boolean[] flag = new boolean[256];
 	int res = 0;
	int start = 0;
	char[] ch = s.toCharArray();
 
	for (int i = 0; i < ch.length; i++) {
		char current = ch[i];
		if (flag[current]) {
			res = Math.max(res, i - start);
			for (int k = start; k < i; k++)
			{
				if (ch[k] == current)
				{
					start = k + 1; 
					break;
				}
				flag[ch[k]] = false;
			}
		} else
		{
			flag[current] = true;
		}
	}
 
	res= Math.max(ch.length - start, res);
 
	System.out.println(res);
}
}
