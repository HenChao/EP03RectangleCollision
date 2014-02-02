package com.henchao.util;

import java.util.Random;
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
public class RectangleGenerator {
	
	public static Rectangle generateRectangle() {
		Random rng = new Random();
		
		return new Rectangle(
					rng.nextInt(10),
					rng.nextInt(10),
					rng.nextInt(9) + 1,
					rng.nextInt(9) + 1
				);
	}

}
