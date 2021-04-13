import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}
  //Methods getDelimetersList and isBalanced by: Tomas Oh, Period 2

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    ArrayList<String> list = new ArrayList<String>();
    for(int x = 0; x < tokens.length; x++)
    {
      if(tokens[x].equals(openDel) || tokens[x].equals(closeDel))
      {
        list.add(tokens[x]);
      }
    }
   return list;
  }

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
		int num = 0;
    for(int x = 0; x < delimiters.size(); x++)
    {
      if(delimiters.get(x).equals(openDel)){
        num++;
      }
      if(delimiters.get(x).equals(closeDel)){
        num--;
      }
      if(num < 0){
        return false;
      }
    }
   return num == 0;
	}
}