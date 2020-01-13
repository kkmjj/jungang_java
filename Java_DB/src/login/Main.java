package mvc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		SAMPLEDAO DAO  = new SAMPLEDAO();
		ArrayList<SAMPLEDTO> book = DAO.findALL();
		
		for(SAMPLEDTO books : book)
		{
			System.out.println(books.getId());
		}

	}

}
