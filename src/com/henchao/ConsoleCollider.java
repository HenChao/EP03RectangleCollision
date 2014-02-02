package com.henchao;

import com.henchao.shapes.Rectangle;
import com.henchao.util.CollisionDetector;
import com.henchao.util.RectangleGenerator;

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
public class ConsoleCollider {

	public static void main(String[] args) {
		Rectangle A = RectangleGenerator.generateRectangle();
		Rectangle B = RectangleGenerator.generateRectangle();
		
		System.out.println("First rectangle");
		printOutRectangleInformation(A);
		System.out.println("Second rectangle");
		printOutRectangleInformation(B);
		if (CollisionDetector.hasCollision(A, B)){
			System.out.println("There is a collision!");
		} else {
			System.out.println("No collision detected");
		}

	}
	
	private static void printOutRectangleInformation(Rectangle R){
		System.out.println("Origin at: " + R.origin.x + "," + R.origin.y);
		System.out.println("Height: " + R.height + ", Width: " + R.width);
	}

}
