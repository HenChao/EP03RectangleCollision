package com.henchao.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.henchao.shapes.Rectangle;

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
public class CollisionDetectorTest {

	@Test
	public void twoRectanglesCollide() {
		Rectangle A = new Rectangle(0,0,5,5);
		Rectangle B = new Rectangle(1,1,3,3);
		assertTrue(CollisionDetector.hasCollision(A, B));
	}
	
	@Test
	public void twoRectanglesDoNotCollide() {
		Rectangle A = new Rectangle(0,0,6,7);
		Rectangle B = new Rectangle(0,8,4,5);
		assertFalse(CollisionDetector.hasCollision(A, B));
	}

}
