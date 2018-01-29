package com.techlabs.principles.lsp.solution1;

public class Square extends Rectangle{

		@Override
		public void setWidth(int side){
			this.width=side;
			this.height=side;
		}
		
		@Override
		public void setHeight(int side){
			this.height=side;
			this.width=side;
		}
		
		
}
