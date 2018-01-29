package com.techlabs.principles.lsp.solution2;

public class Square implements IPolygon{

		private int side;
		
		public Square(int side){
			this.side=side;
		}
		
		@Override
		public int calculateArea(){
			return (side*side);
		}
}
