package domineering;
import game.*;

import java.util.*;


public class Jeff extends GamePlayer {
	public RandomDomineeringPlayer(String n) 
	{
		super(n, "Domineering");
	}
	public GameMove getMove(GameState state, String lastMove)
	{
		DomineeringState board = (DomineeringState)state;
		//ArrayList<DomineeringMove> list = new ArrayList<DomineeringMove>();  
		DomineeringMove mv = new DomineeringMove();
		
		int dr, dc;
		if (state.who == GameState.Who.HOME) {
			dr = 0;
			dc = 1;
		} else {
			dr = 1;
			dc = 0;
		}
		
		/*
		for (int r=0; r<DomineeringState.ROWS; r++) {
			for (int c=0; c<DomineeringState.COLS; c++) {
				mv.row1 = r;
				mv.col1 = c;
				mv.row2 = r+dr; mv.col2 = c+dc;
				if (board.moveOK(mv)) {
					list.add((DomineeringMove)mv.clone());
				}
			}
		}*/



		
		
		return //returns the move
	}

	protected class ScoredMove extends DomineeringMove
	{
		//where the evaluation function exists
		//creates a DomineeringMove and applies a score, check DomineeringMove class
		//for further information
	}
	
	public boolean terminalValue(DomineeringState brd, ScoredMove mv)
	{
		//essentially just returns of the game is over.
		DomineeringState.Status status = brd.getStatus; 
		
		boolean isTerminal = true;
		//states 
		//GAME_ON
		//HOME_WIN
		//AWAY_WIN
		if(status == DomineeringState.Status.HOME_WIN)
			//set a move using mv.set
		else if(status = GameState.Status.AWAY_WIN)
			//set a move using mv.set
		else
			isTerminal == false;
		return isTerminal;
	}
	public void alphaBeta(DomineeringState brd, int currDepth, double alpha, double beta)
	{
		//not yet implemented in GameMode

		//decides who to maximize and minimize
		boolean toMaximize = (brd.who == GameState.Who.HOME)
		boolean toMinimize = !toMaximize;
		
		//finds the state of the game
		boolean isTerminal = terminalValue(brd,mvStack[currDepth])
		
		
		if(isTerminal)
		{
			;
		}
		else if(currDepth == depthLimit)
		{
			//set the move
			mvStack[currDepth].set(/*params*/);
		}
		else
		{
			//alpha beta
		}
	}
	public static void main(String [] args)
	{
		GamePlayer p = new RandomDomineeringPlayer("Random+");
		p.compete(args, 1);
	}
}
