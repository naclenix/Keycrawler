package mainPackage;
import java.util.Scanner; 
  
/* 
* The player will be able to input a certain command to move forward in the game, i.e. "go north" or "get sword". 
* If the player inputs anything else, they'll get a 'syntax error'. 
* The player will go to different rooms, investigate said rooms, and find the keys hidden within. They are letters. The final puzzle is a word scramble. 
* I'm not sorry. 
* This game is probably waaaay too complicated for my first project in this class. 
*/ 
//JOptionPane.showMessageDialog(""); 

//ctrl-shift-l: show active keybindings. trackpad is dead.
public class KeycrawlerMain { 
     
    Scanner scanner = new Scanner(System.in); 
    String command = new String(); 
    int roomInt; 
    int a; 
    int pencil; 
    int diffuser; 
    int b; 
    boolean kiwi; 
    boolean lime; 
    boolean cube; 
    int c; 
     
    public static void main(String args[]) { 
         
        KeycrawlerMain game; 
        game = new KeycrawlerMain(); 
        game.onStart(); 
         
    } 
         
    public void onStart() { 
        System.out.println("Welcome to Keycrawler, a tiny text adventure." 
                + "\nCommands are: 'go east'; 'go north'; 'go south'; 'go west'; 'go back'; 'get [item]'; and 'use [item]'." 
                + "\nThe command 'go back' returns you to the center. No matter what, you are always facing north." 
                + "\nWrite 'start' to start."); 
        a = 0; 
        pencil = 0; 
        diffuser = 0; 
        b = 0; 
        kiwi = false; 
        lime = false;         
        c = 0; 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("start")) 
        { 
            firstRoomStart(); 
        } 
        else if (command.contentEquals("skip blue")) { 
            secondRoomStart(); 
        } 
        else if (command.contentEquals("skip green")) { 
            thirdRoomStart(); 
        }
        else if (command.contentEquals("skip final")) {
        	finalRoomStart();
        }
        else { 
            onStart(); 
        }         
    } 
     
    /*public void InvalidSyntax() { 
        onStart(); 
        //System.out.println("Invalid syntax."); 
        //command = scanner.nextLine(); 
        //has logic that returns you to previous method/room? 
    }*/ 
     
    public void firstRoomStart() { 
        System.out.println("FIRST ROOM" 
                + "\nThis room is red and seems very bare-bones, just a cube. The white door locks behind you." 
                + "\nOn the east wall, you see a locked chest. You'd bet your left arm that it contains something." 
                + "\nTo the north, there is a single door much like the one you came from." 
                + "\nThere is nothing else of note besides dust."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        } 
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomStart(); 
        } 
    } 
     
    public void firstRoomEast() { 
        System.out.println("You walk over to the chest and grab its lid, but it won't budge." 
                + "\nIt has one of those weird five-letter combination locks on it." 
                + "\nThe words 'A SHINY RED FRUIT' are written on its top." 
                + "\nYou'll have to put something into the lock to open it."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("apple")) { 
            firstRoomChest(); 
        } 
        else if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomEast(); 
        } 
    } 
     
    public void firstRoomChest() { 
        System.out.println("The lock clicks and the chest's lid pops open." 
                + "\nInside, on a velvet cushion, is a single copper key engraved with the letter E."); 
         
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        } 
        else if (command.equalsIgnoreCase("get key")) { 
            firstRoomKeyGot(); 
        } 
        else if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomChest(); 
        } 
    } 
     
    public void firstRoomKeyGot() { 
        a = 1; 
        System.out.println("You got Key E!"); 
         
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomKeyGot(); 
        } 
         
    } 
    //The shiny red fruit thing is probably just a placeholder. 
    public void firstRoomNorth() { 
        System.out.println("You walk up to the door and turn the knob. It's locked. Cool." 
                + "\nThe door's keyhole is copper-colored."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        }         
        else if (((command.equalsIgnoreCase("go north")) || (command.equalsIgnoreCase("use key"))) && (a == 1)) { 
            secondRoomStart(); 
        } 
        else if (((command.equalsIgnoreCase("go north")) || (command.equalsIgnoreCase("use key"))) && (a != 1)) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomNorth(); 
        } 
    } 
     
    public void firstRoomWest() { 
        System.out.println("You are greeted by a red wall. " 
                + "\nUpon closer inspection, the wall is just a wall."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            firstRoomSouth(); 
        } 
        else { 
            firstRoomWest(); 
        }         
    } 
     
    public void firstRoomSouth() { 
        System.out.println("You turn back. The door is still here, firmly locked in place." 
                + "\nYou think you might be here for awhile."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            firstRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            firstRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            firstRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            firstRoomWest(); 
        } 
        else { 
            firstRoomSouth(); 
        }         
    } 
     
    public void secondRoomStart() { 
        System.out.println("SECOND ROOM" 
                + "\nThe smell of lavender essential oils assaults your nose before you're out of the doorframe." 
                + "\nIn the west of the room lies a four-poster bed with blue curtains. Silver carpet covers the ground." 
                + "\nTo your east, there is a dresser with three drawers. In front is a door." 
                + "\nYou would think this was someone's bedroom if the walls weren't covered in eyeballs."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        } 
        else { 
            secondRoomStart(); 
        } 
    } 
     
    public void secondRoomEast() { 
        System.out.println("As you approach, the east wall's eyes all shift towards you." 
                + "\nThe top drawer of the dresser is open. You reach inside to get the key."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("get key")) { 
            secondRoomPencilGot(); 
        } 
        else if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        } 
    } 
     
    public void secondRoomPencilGot() { 
        System.out.println("\nYou pull out a gray pencil." 
                + "\nIt is not a key at all. It seems like a normal writing implement except for the U carved into its side." 
                + "\nYou got the Pencil!"); 
        pencil = 1; 
         
        if ((diffuser == 1) && (pencil == 1)) { 
            b = 1; 
            System.out.println("\nYou look at the pencil, then back to the diffuser. Hmm." 
                    + "\nThen you slide the diffuser up the pencil." 
                    + "\nIt fits perfectly, and now the conglomeration looks sort of like a very crappy key." 
                    + "\nYou got Key U!"); 
        }         
        else { 
            b = 0; 
        } 
         
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        } 
    } 
     
    public void secondRoomNorth() { 
        System.out.println("The door is as firmly shut as the last one was before you unlocked it."
        		+ "\nThe keyhole is silver."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if ((command.equalsIgnoreCase("go north")) || (command.equalsIgnoreCase("use key")) && (b == 1))  { 
            thirdRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go north") && (b != 1)) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        }
        else {
        	secondRoomNorth();
        }
    } 
     
    public void secondRoomSouth() { 
        System.out.println("The door you came from has shut. " 
                + "\nYou pull its handle, but it doesn't budge."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        }
        else {
        	secondRoomSouth();
        }
    } 
     
    public void secondRoomWest() { 
        System.out.println("As you approach the bed, the sickly scent of lavender grows stronger." 
                + "\nIt seems to be wafting from the little space between the bed and the wall." 
                + "\nYou have a feeling you might need to get the diffuser before you faint."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("get diffuser")) { 
            secondRoomDiffuserGet(); 
        } 
        else if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else {
        	secondRoomWest();
        } 
    } 
     
    public void secondRoomDiffuserGet() {
    	if (b == 0) {
    		System.out.println("You tentatively reach down into the space and tug at something on the wall." 
                	+ "\nIt pops free with no resistance. It is not a diffuser, but a tiny purple metal...thing." 
                	+ "\nIt has a hexagonal hole in the middle and a few grooves on the sides." 
                	+ "\nYou got the Diffuser!"); 
        	diffuser = 1; 
         
        	if ((diffuser == 1) && (pencil == 1)) { 
            	b = 1; 
            	System.out.println("\nYou look at the diffuser, then back to the pencil. Hmm." 
                    	+ "\nThen you slide the diffuser up the pencil." 
                    	+ "\nIt fits perfectly, and now the conglomeration looks sort of like a very crappy key." 
                    	+ "\nYou got Key U!"); 
        	}             	
        	else { 
            	b = 0; 
        	}
    	}
    	else {
    		System.out.println("The smell has disippated somewhat.");
    	}
         
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            secondRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            secondRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            secondRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            secondRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            secondRoomWest(); 
        }
        else {
        	secondRoomDiffuserGet();
        }
    } 
  
     
    public void thirdRoomStart() {
    	if ((kiwi != true) || (lime != true) || (cube != true)) {
        System.out.println("THIRD ROOM" 
                + "\nThis room is a lab of some sort. You know this because a sign says LAB above you." 
                + "\nThe whole area hums, and veins of green light criscross the slate-colored walls." 
                + "\nRight in front of you is a circular metal table with three squarish depressions evenly spaced in it." 
                + "\nTo the north, there is a door with a sign on it." 
                + "\nFor some bizarre reason, there are fruit trees to your east and west."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomStart();
        }
    	}
    	else if ((kiwi == true) && (lime == true) && (cube == true)) {
    		System.out.println("You return to the center of the room."
    				+ "\nRight in front of you is a circular metal table with three depressions in it."
    				+ "\nYou examine your stuff. The key is too small, but the lime, kiwi, and cube look like they'd fit."
    				+ "\nIt looks like you'll have to use the items from this room.");
    		command = scanner.nextLine();
    		
    		if (command.equalsIgnoreCase("use items")) {
    			thirdRoomKeyGet();
    		}
            else if (command.equalsIgnoreCase("go east")) { 
                thirdRoomEast(); 
            }         
            else if (command.equalsIgnoreCase("go north")) { 
                thirdRoomNorth(); 
            } 
            else if (command.equalsIgnoreCase("go south")) { 
                thirdRoomSouth(); 
            } 
            else { 
                thirdRoomStart(); 
            }
    	}
    } 
     
    public void thirdRoomEast() {
    	if (!kiwi) {
        System.out.println("There is a tree here with a single brown, hairy fruit dangling from one of its branches."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            thirdRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("get fruit") || (command.equalsIgnoreCase("get kiwi"))) { 
            thirdRoomKiwiGet(); 
        }        
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomEast();
        }
    	}
        else {
        	System.out.println("The tree is still here. Now that you look at it, it's really more of a vine."
        			+ "The fruit is gone, because you have it.");
        	command = scanner.nextLine();
        	
            if (command.equalsIgnoreCase("go back")) { 
                thirdRoomStart(); 
            }
            else if (command.equalsIgnoreCase("go east")) { 
                thirdRoomEast(); 
            }         
            else if (command.equalsIgnoreCase("go north")) { 
                thirdRoomNorth(); 
            } 
            else if (command.equalsIgnoreCase("go south")) { 
                thirdRoomSouth(); 
            } 
            else { 
                thirdRoomWest(); 
            }
        }
    } 
     
    public void thirdRoomKiwiGet() { 
        System.out.println("You pick the fruit off its branch."
        		+ "\nYou got the Kiwi!");
        kiwi = true;
        command = scanner.nextLine();
        
        if (command.equalsIgnoreCase("go back")) {
        	thirdRoomStart();
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomKiwiGet();
        }
    } 
  
    public void thirdRoomWest() { 
        if (!lime) {
        		System.out.println("The air smells faintly of citrus as you approach the tree." 
        			+ "\nIt has one ellipsoid green fruit and a few tiny white flowers."); 
        	command = scanner.nextLine(); 
         
        	if (command.equalsIgnoreCase("go back")) { 
            	thirdRoomStart(); 
        	}
        	else if ((command.equalsIgnoreCase("get fruit")) || (command.equalsIgnoreCase("get lime"))) {
        		thirdRoomLimeGet();
        	}
        	else if (command.equalsIgnoreCase("go east")) { 
            	thirdRoomEast(); 
        	}         
        	else if (command.equalsIgnoreCase("go north")) { 
            	thirdRoomNorth(); 
        	} 
        	else if (command.equalsIgnoreCase("go south")) { 
            	thirdRoomSouth(); 
        	} 
        	else { 
            	thirdRoomWest(); 
        	}
        }
        else {
        	System.out.println("The tree seems to be growing into the hard, smooth floor."
        			+ "\nThe fruit is gone, because you have it.");
        	command = scanner.nextLine();
        	
            if (command.equalsIgnoreCase("go back")) { 
                thirdRoomStart(); 
            }
            else if (command.equalsIgnoreCase("go east")) { 
                thirdRoomEast(); 
            }         
            else if (command.equalsIgnoreCase("go north")) { 
                thirdRoomNorth(); 
            } 
            else if (command.equalsIgnoreCase("go south")) { 
                thirdRoomSouth(); 
            } 
            else { 
                thirdRoomWest(); 
            }
        }
    } 
    
    public void thirdRoomLimeGet() {
    	System.out.println("You pick the fruit off its branch. It's about the size of your fist."
    			+ "\nYou got the Lime!");
    	lime = true;
    	command = scanner.nextLine();
    	
        if (command.equalsIgnoreCase("go back")) {
        	thirdRoomStart();
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomLimeGet();
        }
    } 
  
    public void thirdRoomNorth() { 
        if (c != 1) {
        	System.out.println("The way forward is locked, as always. The keyhole is gold this time, and rectangular." 
        			+ "\nThere is a sign on this door. It contains the crude drawings of:" 
        			+ "\na fuzzy, round thing; an oval shape with pinched ends; and a square." 
        			+ "\nOn the floor, small enough to fit in the palm of your hand, is a green cube."); 
        	command = scanner.nextLine(); 
         
        	if (command.equalsIgnoreCase("go back")) { 
            	thirdRoomStart(); 
        	} 
        	else if ((command.equalsIgnoreCase("get cube")) || command.equalsIgnoreCase("get green cube")) { 
            	thirdRoomCubeGet(); 
        	} 
        	else if (command.equalsIgnoreCase("go east")) { 
            	thirdRoomEast(); 
        	}         
        	else if (command.equalsIgnoreCase("go north")){ 
            	thirdRoomNorth(); 
        	}
        	else if (command.equalsIgnoreCase("go south")) { 
        		thirdRoomSouth(); 
        	} 
        	else if (command.equalsIgnoreCase("go west")) { 
            	thirdRoomWest(); 
        	} 
        }
        else {
        	System.out.println("The way forward is locked, as always."
        			+ "\nThe keyhole is gold and rectangular. The sign is still there, but you think it's served its purpose.");
        	command = scanner.nextLine(); 
            
        	if (command.equalsIgnoreCase("go back")) { 
            	thirdRoomStart(); 
        	}
        	else if (command.equalsIgnoreCase("go east")) { 
            	thirdRoomEast(); 
        	}
        	else if ((command.equalsIgnoreCase("use key")) || (command.equalsIgnoreCase("go north"))) {
        		finalRoomStart();
        	}        			
        	else if (command.equalsIgnoreCase("go south")) { 
        		thirdRoomSouth(); 
        	} 
        	else if (command.equalsIgnoreCase("go west")) { 
            	thirdRoomWest(); 
        	}
        }
    } 
     
    public void thirdRoomCubeGet() { 
        System.out.println("You pick it up." 
                + "\nIt is smooth and slippery and cool, as if it were a cube-shaped hole that the universe filled with the most generic thing possible." 
                + "\nYou don't know. Perhaps the level designers got lazy." 
                + "\nYou got the Cube!");
        cube = true;
         
        command = scanner.nextLine(); 
    
        if (command.equalsIgnoreCase("go back")) {
        	thirdRoomStart();
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomCubeGet();
        }
    } 
    public void thirdRoomSouth() { 
        System.out.println("You know the drill by now, so you don't bother jiggling the handle of the door." 
                + "\nIt has locked behind you."); 
         
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go back")) { 
            thirdRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        }
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomSouth();
        }
    } 
     
    public void thirdRoomKeyGet() { 
        System.out.println("The table sinks into the ground with a metallic grinding. It leaves only a circular seam." 
                + "\nAs you begin to wonder whether you actually solved the puzzle, the grinding starts again." 
                + "\nSomething small and hard drops from the ceiling and lands on your head with a CLINK."
                + "\nIt is a green metal card of some sort, embossed with the letter S." 
                + "\nYou got Key S!"); 
        c = 1; 
        command = scanner.nextLine(); 
        
        if (command.equalsIgnoreCase("go back")) { 
            thirdRoomStart(); 
        } 
        else if (command.equalsIgnoreCase("go east")) { 
            thirdRoomEast(); 
        }         
        else if (command.equalsIgnoreCase("go north")) { 
            thirdRoomNorth(); 
        } 
        else if (command.equalsIgnoreCase("go south")) { 
            thirdRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go west")) { 
            thirdRoomWest(); 
        }
        else {
        	thirdRoomKeyGet();
        }
    } 
     
    public void finalRoomStart() { 
        System.out.println("FINAL ROOM" 
                + "\nA bare white space with a black table. You can't see walls or a ceiling."); 
        command = scanner.nextLine(); 
         
        if (command.equalsIgnoreCase("go south")) { 
            finalRoomSouth(); 
        } 
        else if (command.equalsIgnoreCase("go north")) { 
            finalRoomNorth(); 
        } 
        else if ((command.equalsIgnoreCase("go east")) || (command.equalsIgnoreCase("go west"))) { 
            finalRoomEastWest(); 
        }         
        else { 
            finalRoomStart(); 
        } 
    } 
     
    public void finalRoomSouth() { 
        System.out.println("The door is locked."); 
        command = scanner.nextLine(); 
        
       if (command.equalsIgnoreCase("go south")) { 
           finalRoomSouth(); 
       }
       else if (command.equalsIgnoreCase("go back")) {
    	   finalRoomStart();
       }
       else if (command.equalsIgnoreCase("go north")) { 
           finalRoomNorth(); 
       } 
       else if ((command.equalsIgnoreCase("go east")) || (command.equalsIgnoreCase("go west"))) { 
           finalRoomEastWest(); 
       }         
       else { 
           finalRoomSouth();
       }
    } 
     
    public void finalRoomEastWest() { 
        System.out.println("There is nothing here but fog."); 
        command = scanner.nextLine(); 
        
       if (command.equalsIgnoreCase("go south")) { 
           finalRoomSouth(); 
       }
       else if (command.equalsIgnoreCase("go back")) {
    	   finalRoomStart();
       }
       else if (command.equalsIgnoreCase("go north")) { 
           finalRoomNorth(); 
       } 
       else if ((command.equalsIgnoreCase("go east")) || (command.equalsIgnoreCase("go west"))) { 
           finalRoomEastWest(); 
       }         
       else { 
           finalRoomStart();
       }
    } 
     
    public void finalRoomNorth() { 
        System.out.println("Words are carved into the top of the table:" 
                + "\n'USE KEYS'" 
                + "\nBelow the words, there is a piece of paper and a shiny black pen."
                + "\nYou look down at your keys and the letters carved into them." 
                + "\nYou wonder how writing would possibly do anything, but that's what you think you're supposed to do."); 
        command = scanner.nextLine();
        
       if (command.equalsIgnoreCase("go south")) { 
           finalRoomSouth(); 
       }
       else if (command.equalsIgnoreCase("go back")) {
    	   finalRoomStart();
       }
       else if (command.equalsIgnoreCase("use")) {
    	   finalRoomKeyGet();
       }
       else if (command.equalsIgnoreCase("go north")) { 
           finalRoomNorth(); 
       } 
       else if ((command.equalsIgnoreCase("go east")) || (command.equalsIgnoreCase("go west"))) { 
           finalRoomEastWest(); 
       }         
       else { 
           finalRoomNorth();
       }
    }
    
    public void finalRoomKeyGet() {
    	System.out.println("You write 'USE' onto the paper. Of course the darn thing was a word scramble."
    			+ "\nYou step back. This is exactly what you thought would happen. How does writing things on a paper activate something?"
    			+ "\nAnd then you blink and the table's gone. In its place is a door. White, with a brass knob and no keyhole."
    			+ "\nIt could be the way out. It could just be another room."
    			+ "\nBut there's nothing else for you here."
    			+ "\nYou walk through the door.");
    	command = scanner.nextLine();
    	
    	if (command.contentEquals("easter egg please")) {
    		easterEggPlease();
    	}
    	else {
    		endCredits();
    	}
    }
    
    public void endCredits() {
    	System.out.println("KEYCRAWLER"
    			+ "\nDeveloper: naclenix"
    			+ "\nCode: Spaghetti"
    			+ "\nHotel: Trivago"
    			+ "\n\nThanks for playing."
    			+ "\nWrite 'start' to start again.");
    	command = scanner.nextLine();
    	
    	if (command.equalsIgnoreCase("start")) {
    		onStart();
    	}
    	else {
    		endCredits();
    	}
    }
    
    public void easterEggPlease() {
    	System.out.println("Sure, man."
    			+ "\nI know you had to look into the internal spaghetti mess to get this, you cheat."
    			+ "\nHere ya go."
    			+ "\nYou got the Egg! It smells faintly of vinegar and is dyed pink."
    			+ "\nWords are written on it in blue crayon:\n");
    	endCredits();
    }

} 
