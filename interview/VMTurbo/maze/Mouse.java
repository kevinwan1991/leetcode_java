package VMTurbo.maze;

import java.util.HashSet;

class Mouse {
	public Mouse() {}

	// Return a string of the letters NSEW which, if used to traverse the
	// the maze from startingPoint, will reach a Place where isCheese() is
	// true.  Return null if you can't find such a path.
	private HashSet<Place> visitedPlace;
	
	public String findCheese(Place startingPoint) {
		//Basic version:
		//return helperBasic(startingPoint,"");
		
		//Extra Credit:
		this.visitedPlace=new HashSet<Place>();
		return helperAdvanced(startingPoint,"");
	}
	
	
	public String helperAdvanced(Place place,String path){
		if(place==null)
			return null;
		if(place.isWall())
			return null;
		if(this.visitedPlace.contains(place))
			return null;
		if(place.isCheese())
			return path;
		
		this.visitedPlace.add(place);
		String resPath=null;
		
		resPath=helperBasic(place.goEast(),path+"E");
		if(resPath!=null)
			return resPath;
	
		resPath=helperBasic(place.goWest(),path+"W");
		if(resPath!=null)
			return resPath;
	
		resPath=helperBasic(place.goSouth(),path+"S");
		if(resPath!=null)
			return resPath;
	
		resPath=helperBasic(place.goNorth(),path+"N");
		if(resPath!=null)
			return resPath;
		
		return null;
	}
	
	public String helperBasic(Place place,String path){
		if(place.isCheese())
			return path;
		if(place.isWall())
			return null;
		
		String resPath=null;
		char lastStep=(path=="")?'A':path.charAt(path.length()-1);
		
		if(lastStep!='W'){
			resPath=helperBasic(place.goEast(),path+"E");
			if(resPath!=null)
				return resPath;
		}
		
		if(lastStep!='E'){
			resPath=helperBasic(place.goWest(),path+"W");
			if(resPath!=null)
				return resPath;
		}
		
		if(lastStep!='N'){
			resPath=helperBasic(place.goSouth(),path+"S");
			if(resPath!=null)
				return resPath;
		}
		
		if(lastStep!='S'){
			resPath=helperBasic(place.goNorth(),path+"N");
			if(resPath!=null)
				return resPath;
		}
		
		return null;
	}
}