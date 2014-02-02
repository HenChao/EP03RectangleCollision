package com.henchao.shapes;

/**
 * Copyright 2014 Henry Chao
 * 
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class Rectangle {
	
	public class Coordinate {
		public int x;
		public int y;
		
		public Coordinate(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public Coordinate origin;
	public int height;
	public int width;
	
	public Rectangle(int x, int y, int h, int w) {
		origin = new Coordinate(x,y);
		height = h;
		width = w;
	}

}
