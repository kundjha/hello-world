class TestSwitch
{

public static void main (String args[])
{

int numberOfPlayers=0;
String sport="volleyball";

switch (sport)
{

case "tennis":
    	numberOfPlayers=1;
	break;

case "volleyball":
       numberOfPlayers=6;
       break;
case "baseball":
	numberOfPlayers=9;
       break;
}
System.out.println(numberOfPlayers +"players are needed.");	

}
}

