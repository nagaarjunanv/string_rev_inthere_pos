public class string_rev_in_there_pos{

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		String arr[]=str.split(" ");
		StringBuffer str1=new StringBuffer();
		int i=0,j=0;
		for(i=0;i<arr.length;i++)
		{
		for(j=arr[i].length()-1;j>=0;j--)
		{
			char char_arr[]=arr[i].toCharArray();
			System.out.print(char_arr[j]);
			
		}
		System.out.print(" ");
		}
		
		
}
