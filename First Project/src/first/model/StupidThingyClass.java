package first.model;

public class StupidThingyClass
{
		//declaration section
		private String stringName;  //thingy name
		private String food;  //thingy favorite food
		private String movie;  //thingy favorite movie
		
		
		
		
		public StupidThingyClass()
		{
			
			stringName = "ThingyName";
			food = "Yummy foods";
			movie = "Good movie";
			
		}
		
		public void setFood(String name)
		{
			food = name;
		}
		public void setMovie(String name)
		{
			movie = name;
		}
		public void setName(String name) 
		{
			stringName = name;
		}
		
		
		
		public String getFood()
		{
			return food;
		}
		public String getMovie()
		{
			return movie;
		}
		public String getName()
		{
			return stringName;
		}
		
		

}