package com.henchao.util;

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
public class CollisionDetector {
	
	public static boolean hasCollision(Rectangle A, Rectangle B){
		
		if( (A.origin.x + A.width >= B.origin.x ) &&
			(A.origin.x <= B.origin.x + B.width ) &&
			(A.origin.y + A.height >= B.origin.y ) &&
			(A.origin.y <= B.origin.y + B.height )
				){
			return true;
		}
		
		return false;
	}

}
