package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 136
// Finish time:
public class PlanetExplorer {
	
	public int posx = 0;
	public int posy = 0;
	public String facing = "N";
	public int gridx = 0;
	public int gridy = 0;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		gridx = x;
		gridy = y;
	}
	
	public String executeCommand(String command){
		String cmd = "";
		if (command == "") {
			return posx + "," + posy + "," + facing;
		}
		
		for (int i = 0; i < command.length(); i++) {
			cmd = command.substring(i, i+1);
			System.out.println(cmd);
			System.out.println(facing);
			if (cmd == "r") {
				if (facing == "N")
					facing = "E";
				else {
					if (facing == "E") 
						facing = "S";
					else {
						if (facing == "S") 
							facing = "W";
						else {
							if (facing == "W") 
								facing = "N";
						}
					}
				}
			}
			System.out.println(facing);
			if (cmd == "l") {
				if (facing == "N") 
					facing = "W";
				if (facing == "W") 
					facing = "S";
				if (facing == "S") 
					facing = "E";
				if (facing == "E") 
					facing = "N";
			}
		}
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return posx + "," + posy + "," + facing;
	}

	
}
