class Player { 
 private int id;     
private String name;     
private int runs;     
public void setid(int id) 
    {
 this.id=id; 
    } 
    public int getid() 
    { 
return id; 
    } 
    public void setname(String name) 
    { 
this.name=name; 
    } 
   public String getname() 
   { 
return name; 
    } 
   public void setruns(int runs) 
    {
 this.runs=runs; 
    } 
  public int getruns() 
    { 
return runs; 
   } 
} 
class Team
{
Player []player;
void setPlayer(Player ...player)
{
this.player=player;
}
Player []getplayer()
{
return player;
}
}
class TeamPlayer
{
public static void main(String x[])
{
Player p1=new Player();
Team t=new Team();
p1.setid(101);
p1.setname("asd");
p1.setruns(100);
Player p2=new Player();
p2.setid(102);
p2.setname("awer");
p2.setruns(50);

 t.setPlayer(p1,p2);
		 Player []p=t.getplayer();
		 System.out.println("display all data of players");
		 for(int i=0; i<p.length;i++) {
			 System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getruns());
		 }
	  }
}

